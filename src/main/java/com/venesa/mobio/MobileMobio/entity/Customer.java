package com.venesa.mobio.MobileMobio.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "id_card_no")
    private String idCardNo;
}
