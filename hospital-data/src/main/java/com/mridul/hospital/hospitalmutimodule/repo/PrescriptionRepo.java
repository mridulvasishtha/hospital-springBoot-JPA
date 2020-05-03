package com.mridul.hospital.hospitalmutimodule.repo;

import com.mridul.hospital.hospitalmutimodule.model.Patient;
import com.mridul.hospital.hospitalmutimodule.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepo extends JpaRepository<Prescription,Long> {

}
