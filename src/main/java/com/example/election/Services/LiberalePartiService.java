package com.example.election.Services;

import com.example.election.Repositories.LiberalePartiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiberalePartiService {
    @Autowired
  private final LiberalePartiRepo liberalePartiRepo;

  public LiberalePartiRepo getLiberalePartiRepo() {
    return liberalePartiRepo;
  }

  public LiberalePartiService(LiberalePartiRepo liberalePartiRepo) {
    this.liberalePartiRepo = liberalePartiRepo;
  }
}
