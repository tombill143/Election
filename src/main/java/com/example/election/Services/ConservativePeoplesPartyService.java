package com.example.election.Services;

import com.example.election.Repositories.ConservativePeoplesPartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConservativePeoplesPartyService {
  @Autowired
  private final ConservativePeoplesPartyRepo conservativePeoplesPartyRepo;

  public ConservativePeoplesPartyRepo getConservativePeoplesPartyRepo() {
    return conservativePeoplesPartyRepo;
  }

  public ConservativePeoplesPartyService(ConservativePeoplesPartyRepo conservativePeoplesPartyRepo) {
    this.conservativePeoplesPartyRepo = conservativePeoplesPartyRepo;
  }
}
