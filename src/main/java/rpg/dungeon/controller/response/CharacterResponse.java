package rpg.dungeon.controller.response;
import rpg.dungeon.entity.Character;

public class CharacterResponse {

    private String nickname;
    private Long strenght;
    private Long dexterity;
    private Long wisdom;
    private Long constitution;
    private Long charisma;
    private Long intelligence;
    private Long experience;
    private Integer level;

    public CharacterResponse(Character character){

        this.nickname = character.getNickname();
        this.strenght = character.getStrength();
        this.dexterity = character.getDexterity();
        this.wisdom = character.getWisdom();
        this.constitution = character.getConstitution();
        this.charisma = character.getCharisma();
        this.intelligence = character.getIntelligence();
        this.experience = character.getExperience();
        this.level = character.getLevel();

    }



    public String getNickname(){
        return nickname;
    }

    public Long getStrenght(){
        return strenght;
    }

    public Long getDexterity(){
        return dexterity;
    }

    public Long getWisdom(){
        return wisdom;
    }

    public Long getConstitution(){
        return constitution;
    }

    public Long getCharisma() {
        return charisma;
    }

    public Long getIntelligence() {
        return intelligence;
    }

    public Long getExperience() {
        return experience;
    }

    public Integer getLevel() {
        return level;
    }
}
