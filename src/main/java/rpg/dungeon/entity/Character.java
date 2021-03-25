package rpg.dungeon.entity;

import rpg.dungeon.controller.request.CharacterRequest;

import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;

import javax.persistence.Column;

@Entity
public class Character {


    public Character(CharacterRequest characterRequest, User user) {
        this.nickname = characterRequest.getNickname();
        this.strength = characterRequest.getStrength();
        this.dexterity = characterRequest.getDexterity();
        this.wisdom = characterRequest.getWisdom();
        this.constitution = characterRequest.getConstitution();
        this.charisma = characterRequest.getCharisma();
        this.user = user;
    }


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nickname;

    @Column
    private Long strength;

    @Column
    private Long dexterity;

    @Column
    private Long wisdom;

    @Column
    private Long constitution;

    @Column
    private Long charisma;

    @Column
    private Long intelligence;

    @Column
    private Long experience;

    @Column
    private Integer level;


    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;


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

    public Long getConstitution() {
        return constitution;
    }
}