DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

-- CREATE users (for Device authentication)
CREATE TABLE users (
    username                VARCHAR(60)   NOT NULL,
    user_id                 VARCHAR(10)   NOT NULL,
    password                VARCHAR(256)  NOT NULL,
    enabled                 boolean       NOT NULL,
    create_time             TIMESTAMP     DEFAULT CURRENT_TIMESTAMP,
    update_time             TIMESTAMP,
CONSTRAINT PK_USERS primary key (
    username
  )
);

-- CREATE authorities
CREATE TABLE authorities (
   username                 VARCHAR(60) NOT NULL,
   authority                VARCHAR(60) NOT NULL,
CONSTRAINT FK_AUTHORITIES_USERS foreign key(username) references users(username)
);
CREATE UNIQUE INDEX ix_auth_username on authorities (username, authority);
