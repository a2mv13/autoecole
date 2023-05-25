package com.gestionAutoEcole.g04.repositories;

import com.gestionAutoEcole.g04.entities.Instructeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructeurRepository extends JpaRepository<Instructeur, Long> {
}
