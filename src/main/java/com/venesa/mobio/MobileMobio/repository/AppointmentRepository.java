package com.venesa.mobio.MobileMobio.repository;

import com.venesa.mobio.MobileMobio.entity.Appointment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
    @Modifying
    @Query(value = "update appointment_cs ap set ap.app_date = :date," +
            "ap.work_shift_id = :work_shift_id where ap.appointment_cs_id = :appointment_cs_id", nativeQuery = true)
    @Transactional
    int updateAppointment(@Param("appointment_cs_id") int appointmentId,
                          @Param("date") String date, @Param("work_shift_id") int workShiftId);
}
