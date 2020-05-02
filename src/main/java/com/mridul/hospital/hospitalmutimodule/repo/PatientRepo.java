package com.mridul.hospital.hospitalmutimodule.repo;

import com.mridul.hospital.hospitalmutimodule.model.Doctor;
import com.mridul.hospital.hospitalmutimodule.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {

}
