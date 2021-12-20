package com.example.election.Controllers;

import com.example.election.Entitities.SocialPeoplesParty;
import com.example.election.Services.SocialPeoplesPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialPeoplesPartyController {

  @Autowired
  SocialPeoplesPartyService socialPeoplesPartyService;

  public SocialPeoplesPartyController(SocialPeoplesPartyService socialPeoplesPartyService){

  }

  @GetMapping("/addsocialpeoplespartycandidate")
  public String addSocialPeoplepartyCandidate(){

    SocialPeoplesParty candidate1 = new SocialPeoplesParty(1L, "Ulla, Holm", "Ballen");
    SocialPeoplesParty candidate2 = new SocialPeoplesParty(2L, "Kjeld, Bønken", "Tranebjerg");
    SocialPeoplesParty candidate3 = new SocialPeoplesParty(3L, "Anne Grethe Olsen", "Kolby");
    SocialPeoplesParty candidate4 = new SocialPeoplesParty(4L, "Lone, Krag", "Ørby");
    SocialPeoplesParty candidate5 = new SocialPeoplesParty(5L, "Børge S. Buur,", "Permelille");

    socialPeoplesPartyService.getSocialPeoplesPartyRepo().save(candidate1);
    socialPeoplesPartyService.getSocialPeoplesPartyRepo().save(candidate2);
    socialPeoplesPartyService.getSocialPeoplesPartyRepo().save(candidate3);
    socialPeoplesPartyService.getSocialPeoplesPartyRepo().save(candidate4);
    socialPeoplesPartyService.getSocialPeoplesPartyRepo().save(candidate5);


    return "The Social Peoples party Candidates mentioned in the controller should be now uploaded to the database";
  }

}
