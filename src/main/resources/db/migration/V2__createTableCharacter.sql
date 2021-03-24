CREATE TABLE if not exists character (
    id BIGSERIAL PRIMARY KEY,
        nickname VARCHAR(50) NOT NULL,
        strength INT NOT NULL,
        dexterity INT NOT NULL,
        wisdom INT NOT NULL,
        constitution INT NOT NULL,
        charisma INT NOT NULL,
        intelligence  INT NOT NULL,
        experience INT NOT NULL,
        lvl INT NOT NULL,
        id_user BIGINT NOT NULL,
        FOREIGN KEY (id_user) REFERENCES application_user (id),

        version BIGINT NOT NULL

);