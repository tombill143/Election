package com.example.election.Controllers;

import com.example.election.Entitities.DanishPeoplesParty;
import com.example.election.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DanishPeoplesPartyController {

  @Autowired
  DanishPeoplesPartyService danishPeoplesPartyService;

  public DanishPeoplesPartyController(DanishPeoplesPartyService danishPeoplesPartyService){

  }

  @GetMapping("/addpeoplespartycandidate")
  public String addPeoplesPartyCandidate(){
    DanishPeoplesParty candidate1 = new DanishPeoplesParty(1L, "Per Mortensen, " ,"Samsø");
    danishPeoplesPartyService.getDanishPeoplesPartyRepo().save(candidate1);

    return "The DP Candidates mentioned in the controller should be now uploaded to the database";
  }

}
