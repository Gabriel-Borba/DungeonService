package rpg.dungeon.service;


import org.springframework.stereotype.Service;
import rpg.dungeon.controller.request.CharacterRequest;
import rpg.dungeon.entity.Character;
import rpg.dungeon.entity.User;
import rpg.dungeon.repository.CharacterRepository;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    private final UserService userService;


    public CharacterService(CharacterRepository characterRepository, UserService userService) {
        this.characterRepository = characterRepository;
        this.userService = userService;
    }

    public Character saveCharacter(CharacterRequest characterRequest) {
        User user = userService.getUserById(characterRequest.getUserId());
        Character character = new Character(characterRequest, user);
        return characterRepository.save(character);
    }
}
