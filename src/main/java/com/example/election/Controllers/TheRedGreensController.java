package com.example.election.Controllers;


import com.example.election.Entitities.TheRedGreens;
import com.example.election.Services.TheRedGreensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRedGreensController {

  @Autowired
  TheRedGreensService theRedGreensService;

  public TheRedGreensController(TheRedGreensService theRedGreensService){

  }

  @GetMapping("/addredgreencandidate")
  public String addRedAndGreenCandidate(){

    TheRedGreens candidate1 = new TheRedGreens(1L, "Katrine Høegh Mc Quaid Jette M.", "Søgard");
    TheRedGreens candidate2 = new TheRedGreens(2L, "Søren", "Caspersen");
    TheRedGreens candidate3 = new TheRedGreens(3L, "Pia", "Berkmand");

    theRedGreensService.getTheRedGreensRepo().save(candidate1);
    theRedGreensService.getTheRedGreensRepo().save(candidate2);
    theRedGreensService.getTheRedGreensRepo().save(candidate3);

    return "The Red Greens Candidates mentioned in the controller should be now uploaded to the database";
  }

}
