package rpg.dungeon.controller.request;

public class CharacterRequest {

    private String nickname;

    private Long strength;

    private Long dexterity;

    private Long wisdom;

    private Long constitution;

    private Long charisma;

    private Long intelligence;

    private Long experience;

    private Integer level;


    public CharacterRequest(String nickname, Long strength, Long dexterity, Long wisdom, Long constitution, Long charisma, Long intelligence, Long experience, Integer level) {
        this.nickname = nickname;
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.constitution = constitution;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.experience = experience;
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public Long getStrength() {
        return strength;
    }

    public Long getDexterity() {
        return dexterity;
    }

    public Long getWisdom() {
        return wisdom;
    }

    public Long getConstitution() {
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