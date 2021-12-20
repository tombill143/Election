package com.example.election.Services;

import com.example.election.Repositories.TheRedGreensRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheRedGreens {

  @Autowired
  private final TheRedGreensRepo theRedGreensRepo;

  public TheRedGreensRepo getTheRedGreensRepo() {
    return theRedGreensRepo;
  }

  public TheRedGreens(TheRedGreensRepo theRedGreensRepo) {
    this.theRedGreensRepo = theRedGreensRepo;
  }
}
