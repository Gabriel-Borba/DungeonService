package rpg.dungeon.service;

import org.springframework.stereotype.Service;
import rpg.dungeon.entity.User;
import rpg.dungeon.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(IllegalStateException::new);
    }
}
