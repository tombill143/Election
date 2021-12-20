package com.example.election.Services;

import com.example.election.Repositories.DanishPeoplesPartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DanishPeoplesPartyService {
  @Autowired
  private final DanishPeoplesPartyRepo danishPeoplesPartyRepo;

  public DanishPeoplesPartyRepo getDanishPeoplesPartyRepo() {
    return danishPeoplesPartyRepo;
  }

  public DanishPeoplesPartyService(DanishPeoplesPartyRepo danishPeoplesPartyRepo) {
    this.danishPeoplesPartyRepo = danishPeoplesPartyRepo;
  }
}
