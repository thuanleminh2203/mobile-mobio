package com.venesa.mobio.MobileMobio.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointment_cs")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_cs_id")
    private int appointmentId;

    @Column(name = "app_date")
    private String date;

    @Column(name = "work_shift_id")
    private int workShiftId;
}
