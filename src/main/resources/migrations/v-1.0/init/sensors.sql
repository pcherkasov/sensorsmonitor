insert into monitor_db.public.unit
values (1, 'bar'),
       (2, 'voltage'),
       (3, 'celsius'),
       (4, 'percent');

insert into monitor_db.public.type
values (1, 'Pressure'),
       (2, 'Voltage'),
       (3, 'Temperature'),
       (4, 'Humidity');

insert into monitor_db.public.sensor
values (1, 'Sensor 1', 'PC33-56', 0, 16, 1, 1, 'Room 1', 'Description of sensor 1'),
       (2, 'Sensor 2', 'EN-567', -25, 25, 2, 2, 'Room 1', 'Description of sensor 2'),
       (3, 'Sensor 3', 'TER-21', -70, 50, 4, 4, 'Room 2', 'Description of sensor 3'),
       (4, 'Sensor 4', 'H94', 0, 100, 3, 3, 'Room 3', 'Description of sensor 4'),
       (5, 'Sensor 5', 'EN-567', -25, 25, 2, 2, 'Room 2', 'Description of sensor 5'),
       (6, 'Sensor 6', 'H94', 0, 100, 3, 3, 'Room 2', 'Description of sensor 6'),
       (7, 'Sensor 7', 'H94', 0, 100, 3, 3, 'Room 4', 'Description of sensor 7'),
       (8, 'Sensor 8', 'PC33-56', 0, 16, 1, 1, 'Room 4', 'Description of sensor 8'),
       (9, 'Sensor 9', 'PC33-56', 0, 16, 1, 1, 'Room 4', 'Description of sensor 9');