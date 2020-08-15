package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.DTO.mobio.request.BookingBase;
import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.entity.Appointment;
import com.venesa.mobio.MobileMobio.entity.Survey;
import com.venesa.mobio.MobileMobio.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private AppointmentService appointmentService;

    @PutMapping("/updateAppointment")
    public ResponseEntity<?> updateAppointment(@RequestBody BookingBase rq, HttpServletRequest request) {
        ResponseEntity<?> responseEntity;
        try {
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS,
                    appointmentService.updateAppointment(rq.getBookingCode(), rq.getAppointmentTime(), rq.getWorkShiftId())));
        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
