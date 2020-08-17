package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.DTO.crm.request.CRMBookingBase;
import com.venesa.common.DTO.mobio.request.BookingBase;
import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.common.config.EnvironmentConfig;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/mobio/mobile/")
public class AppointmentController {
    private final WrapperResponseData wrapperResponse;
    private final AppointmentService appointmentService;

    @PutMapping("updateAppointment")
    public ResponseEntity<?> updateAppointment(@RequestBody CRMBookingBase rq) {
        ResponseEntity<?> responseEntity;
        try {
            appointmentService.updateAppointment(rq.getBookingCode(), rq.getAppointmentTime(), rq.getWorkShiftId());
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS,
                    rq));
        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
