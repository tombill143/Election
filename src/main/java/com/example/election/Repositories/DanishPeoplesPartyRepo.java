package com.example.election.Repositories;

import com.example.election.Entitities.DanishPeoplesParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanishPeoplesPartyRepo extends JpaRepository<DanishPeoplesParty, Long> {

}
