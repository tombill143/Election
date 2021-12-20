package com.example.election.Controllers;

import com.example.election.Entitities.SocialDemocrats;
import com.example.election.Services.SocialPeoplesPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialDemocratsController {

    @Autowired
    SocialPeoplesPartyService socialPeoplesPartyService;

    public SocialDemocratsController(SocialPeoplesPartyService socialPeoplesPartyService){

    }

    @GetMapping("/addsocialdemocratcandidate")
  public String addSocialDemocratCandidate(){

      SocialDemocrats candidate1 = new SocialDemocrats(1L, "Marcel", "Meijer");
      SocialDemocrats candidate2 = new SocialDemocrats(2L, "Michael", "Kristensen");
      SocialDemocrats candidate3 = new SocialDemocrats(3L, "Helle", "Hensen");
      SocialDemocrats candidate4 = new SocialDemocrats(4L, "Karina", "Knobelauch");
      SocialDemocrats candidate5 = new SocialDemocrats(5L, "Stefan Haffstein", "Wolffbrandt");
      SocialDemocrats candidate6 = new SocialDemocrats(6L, "Robert V.", "Rasmussen");
      SocialDemocrats candidate7 = new SocialDemocrats(7L, "Pia", "Ramsing");
      SocialDemocrats candidate8 = new SocialDemocrats(8L, "Anders Baun", "Sørensen");

      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);
      socialPeoplesPartyService.getSocialDemocratsRepo().save(candidate1);


      return "The Social Democrat Candidates mentioned in the controller should be now uploaded to the database";
    }

}
