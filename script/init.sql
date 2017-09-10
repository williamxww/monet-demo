CREATE TABLE mdata1 (
  id       INT,
  name     VARCHAR(50),
  ip       VARCHAR(50),
  sn       VARCHAR(50),
  pwd      VARCHAR(50),
  nickName VARCHAR(50),

  f0       DOUBLE,
  f1       DOUBLE,
  f2       DOUBLE,
  f3       DOUBLE,
  f4       DOUBLE,
  f5       DOUBLE,
  f6       DOUBLE,
  f7       DOUBLE,
  f8       DOUBLE,
  f9       DOUBLE
);

insert into mdata1
( id,name, ip, sn, pwd, nickName, f0, f1, f2, f3, f4, f5, f6, f7, f8, f9)
values
(-1, 'vv','123','sn', 'pwd','nick',1.2,3,3.4,34,4.3,5.3,6.3,7.3,8.3,9.3);

insert into mdata1 ( id,name, ip, sn, pwd, nickName)
  values (-1, 'vv','123','sn', 'pwd','nick');

select count(1) from mdata1;

select name, ip, pwd, f1,f3,f7 from mdata1 order by f1 asc  limit 3 offset 1;

COPY 1000000 RECORDS INTO "mdata1" FROM 'D:/data.csv' USING DELIMITERS ',';