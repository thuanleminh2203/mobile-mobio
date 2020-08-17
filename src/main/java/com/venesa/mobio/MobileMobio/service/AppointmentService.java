package com.venesa.mobio.MobileMobio.service;

import org.springframework.stereotype.Service;

import java.util.Date;

public interface AppointmentService {
    int updateAppointment(int appointmentId, String date, int workShiftId);
}
