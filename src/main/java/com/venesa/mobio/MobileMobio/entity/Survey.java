package com.venesa.mobio.MobileMobio.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mobile_survey")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Survey implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int surveyId;

    @Column(name = "appointment_cs_id")
    private String appointmentId;

    @Column(name = "contract_code")
    private String contractCode;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "rating")
    private int rating;

    @Column(name = "reason")
    private String reason;

    @Column(name = "note")
    private String note;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "rate_time")
    private Date rateTime;

    @Column(name = "type")
    private int type;
}
