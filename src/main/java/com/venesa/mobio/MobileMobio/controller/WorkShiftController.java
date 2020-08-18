package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.DTO.crm.request.CRMBookingBase;
import com.venesa.common.DTO.crm.request.CRMWorkShiftDTO;
import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.service.AppointmentService;
import com.venesa.mobio.MobileMobio.service.WorkShiftService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/mobio/mobile/")
public class WorkShiftController {
    private final WrapperResponseData wrapperResponse;
    @Autowired
    private WorkShiftService workShiftService;

    @GetMapping("getListWorkShiftId")
    public ResponseEntity<?> updateAppointment(@RequestBody CRMWorkShiftDTO rq) {
        ResponseEntity<?> responseEntity;
        try {
            System.out.println("DATE --- " + rq.getDate().toString());
            List<Integer> listWorkShiftId = workShiftService.getListWorkShiftId(rq.getDate().toString());
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS,
                    listWorkShiftId));
        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
