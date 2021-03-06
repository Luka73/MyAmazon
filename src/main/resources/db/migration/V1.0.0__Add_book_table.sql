CREATE TABLE book (
   id SERIAL CONSTRAINT DEF_BOOK_PK PRIMARY KEY,
   title VARCHAR (150) NOT NULL,
   price DECIMAL (18,2) NOT NULL,
   pages INTEGER NOT NULL,
   synopsis VARCHAR (255),
   avg_rating DECIMAL (2,1),
   book_format VARCHAR (10) NOT NULL,
   volume INTEGER,
   edition INTEGER
);