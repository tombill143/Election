package com.example.election.Repositories;

import com.example.election.Entitities.LiberaleParti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiberalePartiRepo extends JpaRepository<LiberaleParti, Long> {

}
