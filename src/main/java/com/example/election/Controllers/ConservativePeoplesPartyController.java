package com.example.election.Controllers;


import com.example.election.Entitities.ConservativePeoplesParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.election.Services.*;

@RestController
public class ConservativePeoplesPartyController {

    @Autowired
    ConservativePeoplesPartyService conservativePeoplesPartyService;

    public ConservativePeoplesPartyController(ConservativePeoplesPartyService conservativePeoplesPartyService){

    }

    @GetMapping("/conservativecandidate")
    public String addConservativeCandidate(){
      ConservativePeoplesParty candidate1 = new ConservativePeoplesParty(1L, "Urban", "Olsen");
      ConservativePeoplesParty candidate2 = new ConservativePeoplesParty(2L, "Peter", "Askjær");
      ConservativePeoplesParty candidate3 = new ConservativePeoplesParty(3L, "Martin", "Sørensen");
      ConservativePeoplesParty candidate4 = new ConservativePeoplesParty(4L, "Louise", "Bramstorp");
      ConservativePeoplesParty candidate5 = new ConservativePeoplesParty(5L, "Sigfred", "Jensen");
      ConservativePeoplesParty candidate6 = new ConservativePeoplesParty(6L, "Jørn C. ", "Nissen");
      ConservativePeoplesParty candidate7 = new ConservativePeoplesParty(7L, "Morten Ø. ", "Kristensen");
      ConservativePeoplesParty candidate8 = new ConservativePeoplesParty(8L, "Susanne", "Andersen");
      ConservativePeoplesParty candidate9 = new ConservativePeoplesParty(9L, "Iulain V. ", "Paiu");
      ConservativePeoplesParty candidate10 = new ConservativePeoplesParty(10L, "Per", "Hingel" );

      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate1);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate2);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate3);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate4);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate5);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate6);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate7);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate8);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate9);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate10);

      return "The Conservative Candidates mentioned in the controller should be now uploaded to the database";
    }
}
