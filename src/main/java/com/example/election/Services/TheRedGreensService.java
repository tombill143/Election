package com.example.election.Services;

import com.example.election.Repositories.TheRedGreensRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheRedGreensService {

  @Autowired
  private final TheRedGreensRepo theRedGreensRepo;

  public TheRedGreensRepo getTheRedGreensRepo() {
    return theRedGreensRepo;
  }

  public TheRedGreensService(TheRedGreensRepo theRedGreensRepo) {
    this.theRedGreensRepo = theRedGreensRepo;
  }
}
