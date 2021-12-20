package com.example.election.Controllers;

import com.example.election.Entitities.LiberaleParti;
import com.example.election.Services.LiberalePartiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiberalePartiController {

  @Autowired
  LiberalePartiService liberalePartiService;

  public LiberalePartiController(LiberalePartiService liberalePartiService){

  }

  @GetMapping("/addliberalecandidate")
  public String addLiberaleCandidate(){
    LiberaleParti candidate1 = new LiberaleParti(1L, "Søren", "Weise");
    LiberaleParti candidate2 = new LiberaleParti(2L, "Anita, Elgaard, Højholt", "Olesen");
    LiberaleParti candidate3 = new LiberaleParti(3L, "Carsten", "Bruun");
    LiberaleParti candidate4 = new LiberaleParti(4L, "Mogens", "Exner");
    LiberaleParti candidate5 = new LiberaleParti(5L, "Anja", "Guldborg");
    LiberaleParti candidate6 = new LiberaleParti(6L, "Klaus", "Holdorf");

    liberalePartiService.getLiberalePartiRepo().save(candidate1);
    liberalePartiService.getLiberalePartiRepo().save(candidate2);
    liberalePartiService.getLiberalePartiRepo().save(candidate3);
    liberalePartiService.getLiberalePartiRepo().save(candidate4);
    liberalePartiService.getLiberalePartiRepo().save(candidate5);
    liberalePartiService.getLiberalePartiRepo().save(candidate6);


    return "The Liberale Candidates mentioned in the controller should be now uploaded to the database";
  }
}
