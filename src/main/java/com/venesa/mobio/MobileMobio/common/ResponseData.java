package com.venesa.mobio.MobileMobio.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<T> implements Serializable {
    private int errorCode;
    private String errorMessage;
    private T data;

}