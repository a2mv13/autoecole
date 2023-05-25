package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Lecon;

import java.util.List;

public interface LeconService {
    Lecon saveLecon(Lecon lecon);
    Lecon updateLecon(Lecon lecon);
    Lecon getLecon(Long id);
    List<Lecon> getAllLecons();
    void deleteLeconById(Long id);
    void deleteAllLecons();
}
