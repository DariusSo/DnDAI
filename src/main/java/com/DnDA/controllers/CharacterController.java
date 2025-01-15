package com.DnDA.controllers;

import com.DnDA.models.Character;
import com.DnDA.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping
    public void saveCharacter(@RequestBody Character character){
        characterService.saveCharacter(character);
    }

    @GetMapping
    public Character getCharacter(@RequestParam long id){
        return characterService.getCharacter(id);
    }

    @PutMapping
    public void updateCharacter(@RequestBody Character character, @RequestParam long id){
        characterService.updateCharacter(id, character);
    }

    @DeleteMapping
    public void deleteCharacter(@RequestParam long id){
        characterService.deleteCharacter(id);
    }

}
