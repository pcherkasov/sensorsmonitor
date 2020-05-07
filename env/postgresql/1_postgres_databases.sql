create USER liquibase_user with PASSWORD 'password';

create DATABASE monitor_db ENCODING 'UTF-8';
grant all privileges on DATABASE monitor_db TO liquibase_user;
create USER monitor_dev with PASSWORD 'password';
grant CONNECT on DATABASE monitor_db TO monitor_dev;
grant select, update, insert, delete ON ALL TABLES IN SCHEMA public TO monitor_dev;
grant  execute ON ALL FUNCTIONS IN SCHEMA public TO monitor_dev;
