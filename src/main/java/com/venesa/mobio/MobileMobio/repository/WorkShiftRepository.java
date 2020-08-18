package com.venesa.mobio.MobileMobio.repository;

import com.venesa.mobio.MobileMobio.entity.WorkShift;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WorkShiftRepository extends CrudRepository<WorkShift, Integer> {
    @Modifying
    @Query(value = "SELECT work_shift_id FROM work_shift WHERE work_shift_id NOT IN (" +
            "SELECT work_shift_id FROM appointment_cs ap " +
            "WHERE DATE(ap.app_date) = :date)", nativeQuery = true)
    @Transactional
    List<Integer> getListWorkShiftId(@Param("date") String date);
}
