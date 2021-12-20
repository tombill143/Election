package com.example.election.Repositories;

import com.example.election.Entitities.ConservativePeoplesParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConservativePeoplesPartyRepo extends JpaRepository<ConservativePeoplesParty, Long> {

}
