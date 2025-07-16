package app.web.MedicBot.services;

import app.web.MedicBot.dtos.AskRequest;
import app.web.MedicBot.dtos.AskResponse;

public interface MedicalAssistantService {

    AskResponse processPatientQuestion(AskRequest request);

}
