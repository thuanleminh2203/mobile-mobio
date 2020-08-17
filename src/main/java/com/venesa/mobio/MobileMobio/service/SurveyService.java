package com.venesa.mobio.MobileMobio.service;

import com.venesa.mobio.MobileMobio.entity.Survey;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface SurveyService {
    List<Survey> getAll();

    Survey save(Survey survey);

}
