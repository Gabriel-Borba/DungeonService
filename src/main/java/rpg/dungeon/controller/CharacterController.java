package rpg.dungeon.controller;
import org.springframework.web.bind.annotation.*;
import rpg.dungeon.repository.CharacterRepository;
import rpg.dungeon.controller.request.CharacterRequest;
import rpg.dungeon.controller.response.CharacterResponse;
import rpg.dungeon.entity.Character;
@RestController
@RequestMapping("/character")


public class CharacterController {

    private CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) { this.characterRepository = characterRepository; }

    @PostMapping
    public CharacterResponse saveCharacter(CharacterRequest characterRequest) {
        Character character = new Character(characterRequest);
        character = characterRepository.save(character);
        return new CharacterResponse(character);
    }
}
