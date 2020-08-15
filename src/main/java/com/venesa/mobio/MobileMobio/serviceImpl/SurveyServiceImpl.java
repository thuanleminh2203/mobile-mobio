package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.entity.Survey;
import com.venesa.mobio.MobileMobio.repository.SurveyRepository;
import com.venesa.mobio.MobileMobio.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public List<Survey> getAll() {
        List<Survey> surveyList = surveyRepository.findAll();
        return surveyList;
    }

    @Override
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }
}
