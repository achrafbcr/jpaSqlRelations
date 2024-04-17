package com.example.jpasqlrelations.repositories;

import com.example.jpasqlrelations.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
