package com.example.jpasqlrelations.service;

import com.example.jpasqlrelations.entities.Consultation;
import com.example.jpasqlrelations.entities.Medecin;
import com.example.jpasqlrelations.entities.Patient;
import com.example.jpasqlrelations.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
