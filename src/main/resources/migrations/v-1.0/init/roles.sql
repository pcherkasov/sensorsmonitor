insert into monitor_db.public."role"
values
       (1, 'ROLE_ADMIN'),
       (2, 'ROLE_VIEWER');

insert into monitor_db.public."role_user"
values
       (1, 1, 2),
       (2, 2, 1),
       (3, 2, 2);