# KH-WEB-Mybatis2

사용된 테이블

CREATE TABLE USERS(
USER_ID VARCHAR2(50) PRIMARY KEY,
USER_PW VARCHAR2(50), 
USER_NICK VARCHAR2(50),
USER_TEL VARCHAR2(50),
REG_DATE DATE DEFAULT SYSDATE
);