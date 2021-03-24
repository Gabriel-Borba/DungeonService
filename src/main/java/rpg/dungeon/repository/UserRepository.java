package rpg.dungeon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rpg.dungeon.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {



}
