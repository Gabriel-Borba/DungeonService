package rpg.dungeon.controller;

import org.springframework.web.bind.annotation.*;
import rpg.dungeon.repository.CharacterRepository;
import rpg.dungeon.controller.request.CharacterRequest;
import rpg.dungeon.controller.response.CharacterResponse;
import rpg.dungeon.entity.Character;
import rpg.dungeon.service.CharacterService;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    public CharacterResponse saveCharacter(@RequestBody  CharacterRequest characterRequest) {
        Character character = characterService.saveCharacter(characterRequest);
        return new CharacterResponse(character);
    }
}
