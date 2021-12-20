package com.example.election.Services;

import com.example.election.Repositories.SocialPeoplesPartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SocialPeoplesPartyService {
    @Autowired
  private final SocialPeoplesPartyRepo socialPeoplesPartyRepo;

  public SocialPeoplesPartyRepo getSocialPeoplesPartyRepo() {
    return socialPeoplesPartyRepo;
  }

  public SocialPeoplesPartyService(SocialPeoplesPartyRepo socialPeoplesPartyRepo) {
    this.socialPeoplesPartyRepo = socialPeoplesPartyRepo;
  }


}
