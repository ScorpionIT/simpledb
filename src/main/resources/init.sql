CREATE TABLE customer(
    id      bigserial       primary key,
    fio     text            not null,
    phone   text,
    address text,
    created timestamp       default now()
)