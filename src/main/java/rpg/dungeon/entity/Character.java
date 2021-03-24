package rpg.dungeon.entity;

import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;

import javax.persistence.Column;

@Entity
public class Character {
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
}
