package javaRepository.devs.business.abstracts;

import javaRepository.devs.business.requests.*;
import javaRepository.devs.business.responses.GetAllLanguageResponse;
import javaRepository.devs.business.responses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguageService {
    void add(CreateLanguageRequest createLanguageRequest);
    List<GetAllLanguageResponse> getAll();
    GetByIdLanguageResponse getById(int id);
    void update(UpdateLanguageRequest updatelanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);
}
