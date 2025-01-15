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
    @Transactional
    public Character updateCharacter(long id, Character updatedCharacter){
        return characterRepository.findById(id)
                .map(existingCharacter -> {
                    existingCharacter.setName(updatedCharacter.getName());
                    existingCharacter.setClassType(updatedCharacter.getClassType());
                    existingCharacter.setLevel(updatedCharacter.getLevel());
                    existingCharacter.setStrength(updatedCharacter.getStrength());
                    existingCharacter.setDexterity(updatedCharacter.getDexterity());
                    existingCharacter.setConstitution(updatedCharacter.getConstitution());
                    existingCharacter.setCharisma(updatedCharacter.getCharisma());
                    existingCharacter.setWisdom(updatedCharacter.getWisdom());
                    existingCharacter.setIntelligence(updatedCharacter.getIntelligence());
                    existingCharacter.setInventory(updatedCharacter.getInventory());
                    existingCharacter.setImage(updatedCharacter.getImage());
                    existingCharacter.setStatus(updatedCharacter.getStatus());
                    return characterRepository.save(existingCharacter);
                })
                .orElseThrow(CharacterNotFoundException::new);
    }

    @Transactional
    public void deleteCharacter(long id){
        Character character = characterRepository.findById(id)
                .orElseThrow(CharacterNotFoundException::new);
        characterRepository.delete(character);
    }
}
