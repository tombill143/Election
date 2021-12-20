package com.example.election.Repositories;

import com.example.election.Entitities.SocialPeoplesParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialPeoplesPartyRepo extends JpaRepository<SocialPeoplesParty, Long> {

}
