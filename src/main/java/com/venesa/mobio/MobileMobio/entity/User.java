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
    @Column(name = "mobile_id")
    private String mobileId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "identify_code")
    private String identifyCode;

    @Column(name = "gender")
    private int gender;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "card_id")
    private int cardId;

    @Column(name = "card_code")
    private String cardCode;

    @Column(name = "identify_type")
    private int identifyType;

    @Column(name = "province_code")
    private String provinceCode;
}
