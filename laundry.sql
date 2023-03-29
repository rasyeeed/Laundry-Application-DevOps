CREATE TABLE adminLaundry(
    id_user CHAR(6) not null,
    username VARCHAR2(50),
    password VARCHAR2(50),
    CONSTRAINT ADMINLAUNDRY_PK PRIMARY KEY (id_user) ENABLE
);

INSERT INTO adminlaundry VALUES('01','VIDYARATMAYANTI','12345VIDYA');
