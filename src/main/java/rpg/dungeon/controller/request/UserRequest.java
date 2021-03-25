package rpg.dungeon.controller.request;


public class UserRequest {
    private String name;

    private Integer version;

    public UserRequest(String name){
        this.name = name;
    }
    public UserRequest(){ }



    public String getName() {
        return name;
    }
}
