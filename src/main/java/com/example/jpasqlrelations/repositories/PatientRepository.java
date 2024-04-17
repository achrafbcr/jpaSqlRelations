package com.example.jpasqlrelations.repositories;

import com.example.jpasqlrelations.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
