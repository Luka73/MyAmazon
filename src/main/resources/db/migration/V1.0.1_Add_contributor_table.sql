CREATE TYPE job_role AS ENUM ('author', 'illustrator', 'editor', 'translator');

CREATE TABLE contributor (
    id SERIAL CONSTRAINT DEF_CONTRIBUTOR_PK PRIMARY KEY,
    job_role job_role NOT NULL
);