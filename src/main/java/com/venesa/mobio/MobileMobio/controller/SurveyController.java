package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.DTO.crm.request.CRMSurveyDTO;
import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.entity.Survey;
import com.venesa.mobio.MobileMobio.service.SurveyService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/mobio/mobile")
public class SurveyController {
    private final WrapperResponseData wrapperResponse;

    private final SurveyService surveyService;

    @GetMapping("/getAllSurvey")
    public ResponseEntity<?> findAllSurvey() {
        ResponseEntity<?> responseEntity;
        try {
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS, surveyService.getAll()));

        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }

    @PostMapping("/createSurvey")
    public ResponseEntity<?> findAllSurvey(@RequestBody CRMSurveyDTO surveyDTO) {

        ModelMapper modelMapper = new ModelMapper();
        Survey survey = modelMapper.map(surveyDTO, Survey.class);
        ResponseEntity<?> responseEntity;
        try {
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS, surveyService.save(survey)));

        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
