package com.venesa.mobio.MobileMobio.controller;

import com.google.gson.Gson;
import com.venesa.common.DTO.crm.request.CRMMessageDTO;
import com.venesa.common.DTO.crm.request.CRMSendMessageDTO;
import com.venesa.common.DTO.crm.response.CRMSendMessageRes;
import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.common.config.EnvironmentConfig;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.CallMessageUtils;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.entity.Message;
import com.venesa.mobio.MobileMobio.service.MessageService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/mobio/mobile")
public class MessageController {
    private final MessageService messageService;
    private final WrapperResponseData wrapperResponse;
    private final CallMessageUtils webClientComponent;
    private final EnvironmentConfig environmentConfig;

    @GetMapping("/createMessage")
    public ResponseEntity<?> sendMessage(@RequestBody CRMMessageDTO rq, HttpServletRequest request) {
        ResponseEntity<?> responseEntity;
        ModelMapper modelMapper = new ModelMapper();
        Message message = modelMapper.map(rq, Message.class);
        CRMSendMessageDTO sendMessageDTO = modelMapper.map(rq, CRMSendMessageDTO.class);
        String url = environmentConfig.getSourceSendMessageCS2();
        try {
            messageService.save(message);
            String response = webClientComponent.callInternalService(new ParameterizedTypeReference<CRMSendMessageDTO>() {
            }, sendMessageDTO, HttpMethod.POST, url, String.class);
            Gson gson = new Gson();
            CRMSendMessageRes resData = gson.fromJson(response, CRMSendMessageRes.class);
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS,
                    resData));

        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
