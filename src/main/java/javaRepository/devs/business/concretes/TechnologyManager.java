package javaRepository.devs.business.concretes;

import javaRepository.devs.business.abstracts.TechnologyService;
import javaRepository.devs.business.requests.CreateTechnologyRequest;
import javaRepository.devs.business.requests.DeleteTechnologyRequest;
import javaRepository.devs.business.requests.UpdateTechnologyRequest;
import javaRepository.devs.business.responses.GetAllTechnologyReponse;
import javaRepository.devs.business.responses.GetByIdTechnologyResponse;
import javaRepository.devs.dataAccess.abstracts.LanguageRepository;
import javaRepository.devs.dataAccess.abstracts.TechnologyRepository;
import javaRepository.devs.entities.concretes.Language;
import javaRepository.devs.entities.concretes.Technology;
import javaRepository.devs.utilities.mappers.ModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
    private LanguageRepository languageRepository;
    private ModelMapperService modelMapperService;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository, ModelMapperService modelMapperService) {
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
        this.modelMapperService= modelMapperService;
    }

    @Override
    public List<GetAllTechnologyReponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyReponse> response= technologies.stream().map(technology -> this.modelMapperService.forResponse().map(technology, GetAllTechnologyReponse.class)).collect(Collectors.toList());
        return response;
    }

    @Override
    public GetByIdTechnologyResponse getById(int id) {
        Technology technology= this.technologyRepository.findById(id).orElseThrow();
        GetByIdTechnologyResponse response=this.modelMapperService.forResponse().map(technology, GetByIdTechnologyResponse.class);

        return response;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology= this.modelMapperService.forRequest().map(createTechnologyRequest,Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = this.modelMapperService.forRequest().map(updateTechnologyRequest,Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        this.technologyRepository.deleteById(deleteTechnologyRequest.getId());
    }
}
