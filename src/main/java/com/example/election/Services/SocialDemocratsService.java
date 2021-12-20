package com.example.election.Services;

import com.example.election.Repositories.SocialDemocratsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialDemocratsService {
  @Autowired
  private final SocialDemocratsRepo socialDemocratsRepo;

  public SocialDemocratsRepo getSocialDemocratsRepo() {
    return socialDemocratsRepo;
  }

  public SocialDemocratsService(SocialDemocratsRepo socialDemocratsRepo) {
    this.socialDemocratsRepo = socialDemocratsRepo;
  }
}
