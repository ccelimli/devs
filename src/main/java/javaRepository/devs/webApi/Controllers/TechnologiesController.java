package javaRepository.devs.webApi.Controllers;

import javaRepository.devs.business.abstracts.TechnologyService;
import javaRepository.devs.business.requests.CreateTechnologyRequest;
import javaRepository.devs.business.requests.DeleteTechnologyRequest;
import javaRepository.devs.business.requests.UpdateTechnologyRequest;
import javaRepository.devs.business.responses.GetAllTechnologyReponse;
import javaRepository.devs.business.responses.GetByIdTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technologies")
public class TechnologiesController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @GetMapping()
    public List<GetAllTechnologyReponse> getAll() {
        return this.technologyService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdTechnologyResponse getByIdTechnologyResponse(@PathVariable int id) {
        return this.technologyService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody DeleteTechnologyRequest deleteTechnologyRequest) {
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) {
        this.technologyService.update(updateTechnologyRequest);
    }
}
