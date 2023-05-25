package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Lecon;
import com.gestionAutoEcole.g04.repositories.LeconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeconServiceImp implements LeconService{

    @Autowired
    LeconRepository leconRepository;
    @Override
    public Lecon saveLecon(Lecon lecon) {
        return leconRepository.save(lecon);
    }

    @Override
    public Lecon updateLecon(Lecon lecon) {
        return leconRepository.save(lecon);
    }

    @Override
    public Lecon getLecon(Long id) {
        return leconRepository.findById(id).get();
    }

    @Override
    public List<Lecon> getAllLecons() {
        return leconRepository.findAll();
    }

    @Override
    public void deleteLeconById(Long id) {
        leconRepository.deleteById(id);
    }

    @Override
    public void deleteAllLecons() {
        leconRepository.deleteAll();
    }
}
