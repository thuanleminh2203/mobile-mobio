package com.venesa.mobio.MobileMobio.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkShiftService {
    List<Integer> getListWorkShiftId(String date);
}
