package com.gestionAutoEcole.g04.repositories;

import com.gestionAutoEcole.g04.entities.Lecon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeconRepository extends JpaRepository<Lecon, Long> {
}
