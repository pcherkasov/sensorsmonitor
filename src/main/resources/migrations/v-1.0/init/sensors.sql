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
       (3, 'Test search 3', 'TER-21', -70, 50, 4, 4, 'Room 2', 'Description of sensor 3'),
       (4, 'Sensor 4', 'H94', 0, 100, 3, 3, 'tost 3', 'Description of sensor 4'),
       (5, 'Sensor 5', 'EN-567', -25, 25, 2, 2, 'Room 2', 'Description of sensor 5'),
       (6, 'Sensor 6', 'H94', 0, 100, 3, 3, 'Room 2', 'Description of sensor 6'),
       (7, 'Sensor 7', 'H94', 0, 100, 3, 3, 'Room 4', 'Description of sensor 7'),
       (8, 'Sensor 8', 'PC33-56', 0, 16, 1, 1, 'Room 4', 'Description of sensor 8'),
       (9, 'Sensor 9', 'PC33-56', 0, 16, 1, 1, 'Room 4', 'Description of sensor 9'),
       (10, 'Sensor 10', 'Prs-32.2', 0, 10, 1, 1, 'Room 4', 'Description of sensor 10'),
       (11, 'Sensor 11', 'Vlt10/40', 10, 40, 2, 2, 'Box 10', 'Description of sensor 11'),
       (12, 'Sensor 12', 'HMD-10-11', 0, 100, 4, 4, 'Room 2', 'Description of sensor 12'),
       (13, 'Sensor 13', 'Tmp.Rt-0.1', -50, 100, 3, 3, ' Room 3', 'Description of sensor 13'),
       (14, 'Sensor 14', 'Vlt0/25', 0, 25, 2, 2, 'Box 20', 'Description of sensor 14'),
       (15, 'Sensor 15', 'Tmp.Sp-30', 0, 30, 3, 3, 'Room 2', 'Description of sensor 15'),
       (16, 'Sensor 16', 'Tmp.Rt-1.1', -100, 100, 3, 3, 'Оffice 14', 'Description of sensor 16'),
       (17, 'Sensor 17', 'Prs-22.9', 0.1, 0.9, 1, 1, 'Room 4', 'Description of sensor 17'),
       (18, 'Sensor 18', 'HMD-100-AB ', 20, 60, 4, 4, ' Box 40', 'Description of sensor 18'),
       (19, 'Sensor 19', 'Prs-24.8', 0, 7, 1, 1, 'Оffice 15', 'Description of sensor 19'),
       (20, 'Sensor 20', 'Vlt5/500', 5, 500, 2, 2, 'Room 1', 'Description of sensor 20'),
       (21, 'Sensor 21', 'HMD-20-0.55', 0, 20, 4, 4, 'Оffice 12', 'Description of sensor 21'),
       (22, 'Sensor 22', 'Prs-55.7', 10, 20, 1, 1, 'Room 3', 'Description of sensor 22'),
       (23, 'Sensor 23', 'Vlt0.1/10', 0.1, 10, 2, 2, 'Room 2', 'Description of sensor 23'),
       (24, 'Sensor 24', 'Tmp.Sp-20', -20, 20, 3, 3, 'Box 20', 'Description of sensor 24'),
       (25, 'Sensor 25', 'Tmp.Sp-22', 0, 220, 3, 3, 'Room 4', 'Description of sensor 25'),
       (26, 'Sensor 26', 'Vlt10/100', 10, 100, 2, 2, 'Room 4', 'Description of sensor 26'),
       (27, 'Sensor 27', 'Prs-31.1', 20, 30, 1, 1, 'Оffice 14', 'Description of sensor 27'),
       (28, 'Sensor 28', 'HMD-SS-50', 80, 90, 4, 4, 'Room 4', 'Description of sensor 28'),
       (29, 'Sensor 29', 'Prs-92.5', 0.4, 0.8, 1, 1, 'Оffice 11', 'Description of sensor 29'),
       (30, 'Sensor 30', 'Tmp.Rt-9', -10, 150, 3, 3, 'Box 10', 'Description of sensor 30 ');