package com.venesa.mobio.MobileMobio.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<T> {
    private int errorCode;
    private String errorMessage;
    private T data;

}