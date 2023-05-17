package de.neuefische.backend.controller;

import lombok.RequiredArgsConstructor;
import de.neuefische.backend.model.RandMCharacter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.neuefische.backend.service.RandMService;

import java.util.List;

@RestController
@RequestMapping("/api/randm")
@RequiredArgsConstructor
public class RandMController {
    private final RandMService randMService;

    @GetMapping("/characters")
    public List<RandMCharacter> getAllCharacters(){
        return randMService.getAllCharacters();
    }

    @GetMapping("/fill")
    public List<RandMCharacter> fillCharactersFromApi(){
        return randMService.fillCharactersFromApi();
    }


}