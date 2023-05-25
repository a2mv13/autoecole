package com.gestionAutoEcole.g04.repositories;

import com.gestionAutoEcole.g04.entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {
}
