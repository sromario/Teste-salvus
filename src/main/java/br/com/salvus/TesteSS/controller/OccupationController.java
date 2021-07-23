package br.com.salvus.TesteSS.controller;

import br.com.salvus.TesteSS.model.Occupation;
import br.com.salvus.TesteSS.repository.OccupationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {
    OccupationRepository repository;
    @GetMapping("occupation")
    public void OccupationRepository(OccupationRepository repository) {
        this.repository = repository;}

    public static void main(String[] args) {
        System.out.println("DADOS PROFISSIONAIS");
    }
        @PostMapping("occupation")
                public Occupation save(@RequestBody Occupation occupation){
        return repository.save(occupation);
        }








}
