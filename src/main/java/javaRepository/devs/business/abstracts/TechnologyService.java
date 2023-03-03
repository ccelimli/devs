package javaRepository.devs.business.abstracts;

import javaRepository.devs.business.requests.CreateTechnologyRequest;
import javaRepository.devs.business.requests.DeleteTechnologyRequest;
import javaRepository.devs.business.requests.UpdateTechnologyRequest;
import javaRepository.devs.business.responses.GetAllTechnologyReponse;
import javaRepository.devs.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyReponse> getAll();
    GetByIdTechnologyResponse getById(int id);
    void add(CreateTechnologyRequest createTechnologyRequest);
    void update(UpdateTechnologyRequest updateTechnologyRequest);
    void delete(DeleteTechnologyRequest deleteTechnologyRequest);

}
