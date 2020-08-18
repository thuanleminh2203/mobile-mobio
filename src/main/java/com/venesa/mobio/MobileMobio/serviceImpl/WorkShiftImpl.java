package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.repository.WorkShiftRepository;
import com.venesa.mobio.MobileMobio.service.WorkShiftService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkShiftImpl implements WorkShiftService {
    @Autowired
    private WorkShiftRepository workShiftRepository;

    @Override
    public List<Integer> getListWorkShiftId(String date) {
        return workShiftRepository.getListWorkShiftId(date);
    }
}
