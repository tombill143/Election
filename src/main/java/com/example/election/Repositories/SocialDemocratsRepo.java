package com.example.election.Repositories;

import com.example.election.Entitities.SocialDemocrats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialDemocratsRepo extends JpaRepository<SocialDemocrats, Long> {

}
