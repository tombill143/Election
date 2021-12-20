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
      ConservativePeoplesParty candidate1 = new ConservativePeoplesParty(1L, "Marcel", "Meijer");
      ConservativePeoplesParty candidate2 = new ConservativePeoplesParty(2L,  "Michael", "Kristensen");
      ConservativePeoplesParty candidate3 = new ConservativePeoplesParty(3L, "Helle", "Hensen");
      ConservativePeoplesParty candidate4 = new ConservativePeoplesParty(4L, "Karina", "Knobelauch");
      ConservativePeoplesParty candidate5 = new ConservativePeoplesParty(5L, "Stefan Haffstein", "Wolffbrandt");
      ConservativePeoplesParty candidate6 = new ConservativePeoplesParty(6L, "Robert V.", "Rasmussen");
      ConservativePeoplesParty candidate7 = new ConservativePeoplesParty(7L, "Pia", "Ramsing");
      ConservativePeoplesParty candidate8 = new ConservativePeoplesParty(8L, "Anders Baun", "Sørensen");

      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate1);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate2);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate3);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate4);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate5);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate6);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate7);
      conservativePeoplesPartyService.getConservativePeoplesPartyRepo().save(candidate8);

      return "The Conservative Candidates mentioned in the controller should be now uploaded to the database";
    }
}
