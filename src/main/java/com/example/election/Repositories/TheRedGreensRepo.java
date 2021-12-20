package com.example.election.Repositories;

import com.example.election.Entitities.TheRedGreens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheRedGreensRepo extends JpaRepository <TheRedGreens, Long> {

}
