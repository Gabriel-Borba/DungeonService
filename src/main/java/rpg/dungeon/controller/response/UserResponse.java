package rpg.dungeon.controller.response;
import rpg.dungeon.entity.User;

public class UserResponse {

    private String name;
    private Long id;

    public UserResponse(User user){
        this.id= user.getId();
        this.name= user.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
