package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.repository.AppointmentRepository;
import com.venesa.mobio.MobileMobio.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    @Override
    public int updateAppointment(int appointmentId, String date, int workShiftId) {
        return appointmentRepository.updateAppointment(appointmentId, date, workShiftId);
    }
}
