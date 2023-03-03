package javaRepository.devs.business.concretes;

import javaRepository.devs.business.abstracts.LanguageService;
import javaRepository.devs.business.requests.*;
import javaRepository.devs.business.responses.GetAllLanguageResponse;
import javaRepository.devs.business.responses.GetByIdLanguageResponse;
import javaRepository.devs.dataAccess.abstracts.LanguageRepository;
import javaRepository.devs.entities.concretes.Language;
import javaRepository.devs.utilities.mappers.ModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;
    ModelMapperService modelMapperService;

    @Autowired

    public LanguageManager(LanguageRepository languageRepository, ModelMapperService modelMapperService) {
        this.languageRepository = languageRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
//        Language language = new Language();
//        language.setName(createLanguageRequest.getName());
//        this.languageRepository.save(language);
        Language language = this.modelMapperService.forRequest().map(createLanguageRequest, Language.class);
        this.languageRepository.save(language);

    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
//        List<GetAllLanguageResponse> languageResponse = new ArrayList<GetAllLanguageResponse>();
//        for (Language language : languages) {
//            GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
//            responseItem.setId(language.getId());
//            responseItem.setName(language.getName());
//            languageResponse.add(responseItem);
//        }
        List<GetAllLanguageResponse> languageResponse = languages.stream().map(language -> this.modelMapperService.forResponse().map(language, GetAllLanguageResponse.class)).collect(Collectors.toList());
        return languageResponse;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Language language = this.languageRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse response = this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
        return response;
    }

    @Override
    public void update(UpdateLanguageRequest updatelanguageRequest) {
//        Language language = languageRepository.findById(updatelanguageRequest.getId()).get();
//        language.setName(updatelanguageRequest.getName());
        Language language=this.modelMapperService.forRequest().map(updatelanguageRequest,Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
//        Language language = languageRepository.findById(deleteLanguageRequest.getId()).get();
//        this.languageRepository.delete(language);
        Language language= this.modelMapperService.forRequest().map(deleteLanguageRequest,Language.class);
        this.languageRepository.deleteById(language.getId());
    }
}
