package com.example.jpasqlrelations.service;

import com.example.jpasqlrelations.entities.Consultation;
import com.example.jpasqlrelations.entities.Medecin;
import com.example.jpasqlrelations.entities.Patient;
import com.example.jpasqlrelations.entities.RendezVous;
import com.example.jpasqlrelations.repositories.ConsultationRepository;
import com.example.jpasqlrelations.repositories.MedecinRepository;
import com.example.jpasqlrelations.repositories.PatientRepository;
import com.example.jpasqlrelations.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {


    private PatientRepository patientRepository;

    private MedecinRepository medecinRepository;

    private RendezVousRepository rendezVousRepository;

    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
