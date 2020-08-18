package com.venesa.mobio.MobileMobio.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment_cs")
@Data
public class WorkShift {
    @Id
    @Column(name = "work_shift_id")
    private int workShiftId;

    @Column(name = "app_date")
    private String date;
}
