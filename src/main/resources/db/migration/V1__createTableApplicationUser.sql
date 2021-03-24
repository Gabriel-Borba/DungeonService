CREATE TABLE if not exists application_user (
    id BIGSERIAL PRIMARY KEY,
        name VARCHAR(50) NOT NULL,
    version BIGINT NOT NULL
);
