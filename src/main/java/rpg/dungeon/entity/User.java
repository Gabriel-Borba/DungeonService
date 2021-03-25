package rpg.dungeon.entity;

import rpg.dungeon.controller.request.UserRequest;

import javax.persistence.*;

@Entity(name = "application_user")
public class User {

    public User(UserRequest userRequest){
        this.name = userRequest.getName();
    }


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Version
    private Integer version;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
