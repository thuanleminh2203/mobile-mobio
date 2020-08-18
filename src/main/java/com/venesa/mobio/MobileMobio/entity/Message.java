package com.venesa.mobio.MobileMobio.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;

    @Column(name = "send_unit_id")
    private int sendUnit;

    @Column(name = "title")
    private String title;

    @Column(name = "message")
    private String message;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "type")
    private int type;

    @Column(name = "send_date")
    private Date sendDate;

    @Column(name = "receive_date")
    private Date receiveDate;

    @Column(name = "message_status")
    private int messageStatus;

    @Column(name = "callback_url")
    private String callbackUrl;
}
