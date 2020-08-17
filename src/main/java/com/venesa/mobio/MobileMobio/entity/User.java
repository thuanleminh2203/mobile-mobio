package com.venesa.mobio.MobileMobio.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mobile_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_id")
    private int mobileId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "id_card_no")
    private String idCardNo;

    @Column(name = "gender")
    private int gender;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "province_code")
    private String provinceCode;
}
