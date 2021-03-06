CREATE TABLE contributor (
    id SERIAL CONSTRAINT DEF_CONTRIBUTOR_PK PRIMARY KEY,
    job_role VARCHAR(20) NOT NULL
);

CREATE TABLE book_contributor (
    book_id INTEGER NOT NULL,
    contributor_id INTEGER NOT NULL,
    CONSTRAINT DOUBLE_PK_BOOK_CONTRIBUTOR PRIMARY KEY(book_id, contributor_id)
);

ALTER TABLE book_contributor ADD CONSTRAINT DEF_FK_BOOK_BOOK_CONSTRIBUTOR FOREIGN KEY (book_id) REFERENCES book (id) ON DELETE RESTRICT;

ALTER TABLE book_contributor ADD CONSTRAINT DEF_FK_CONTRIBUTOR_BOOK_CONSTRIBUTOR FOREIGN KEY (contributor_id) REFERENCES contributor (id) ON DELETE RESTRICT;