package rpg.dungeon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rpg.dungeon.entity.Character;


public interface CharacterRepository extends JpaRepository<Character, Long> {

}
