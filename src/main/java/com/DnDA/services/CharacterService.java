package com.DnDA.services;

import com.DnDA.exceptions.CharacterNotFoundException;
import com.DnDA.models.Character;
import com.DnDA.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository characterRepository;

    public void saveCharacter(Character character){
        characterRepository.save(character);
    }

    public Character getCharacter(long id){
        return characterRepository.findById(id)
                .orElseThrow(CharacterNotFoundException::new);
    }

    public void updateCharacter(long id, Character updatedCharacter){
        characterRepository.save(updatedCharacter);
    }

    @Transactional
    public void deleteCharacter(long id){
        Character character = characterRepository.findById(id)
                .orElseThrow(CharacterNotFoundException::new);
        characterRepository.delete(character);
    }
}
