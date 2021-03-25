package rpg.dungeon.controller;
import org.springframework.web.bind.annotation.*;
import rpg.dungeon.repository.UserRepository;
import rpg.dungeon.controller.request.UserRequest;
import rpg.dungeon.controller.response.UserResponse;
import rpg.dungeon.entity.User;
@RestController
@RequestMapping("/user")
public class UserController {


    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public UserResponse saveUser(@RequestBody UserRequest userRequest){
        User user = new User(userRequest);
        user = userRepository.save(user);
        return new UserResponse(user);
    }
}