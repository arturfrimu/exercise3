create table USER
(
    ID                NUMBER(20)  not null   primary key,
    FIRST_NAME        VARCHAR2(100),
    LAST_NAME         VARCHAR2(100) ,
    USER_NAME         VARCHAR2(100),
    GROUP_ID          NUMBER(20)
)

create table GROUP
(
    ID          NUMBER(20)    not null   primary key,
    NAME        VARCHAR2(100)
)

create table TASK
(
    ID               NUMBER(20)    not null   primary key,
    TITLE            VARCHAR2(100),
    DESCRIPTION      VARCHAR2(100),
    GROUP_ID         NUMBER(20),
    USER_ID          NUMBER(20)
)