package com.venesa.mobio.MobileMobio.repository;

import java.util.List;
import javax.transaction.Transactional;

import com.venesa.mobio.MobileMobio.entity.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Integer> {
    List<Survey> findAll();

    @Transactional
    Survey save(Survey survey);
}
