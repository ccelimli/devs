package javaRepository.devs.webApi.Controllers;

import javaRepository.devs.business.abstracts.LanguageService;
import javaRepository.devs.business.requests.*;
import javaRepository.devs.business.responses.GetAllLanguageResponse;
import javaRepository.devs.business.responses.GetByIdLanguageResponse;
import javaRepository.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void Add(@RequestBody CreateLanguageRequest languageRequest) {
        this.languageService.add(languageRequest);
    }

    @GetMapping()
    public List<GetAllLanguageResponse> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id){
        return this.languageService.getById(id);
    }
    @PutMapping()
    public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody DeleteLanguageRequest deleteLanguageRequest) {
        this.languageService.delete(deleteLanguageRequest);
    }
}
