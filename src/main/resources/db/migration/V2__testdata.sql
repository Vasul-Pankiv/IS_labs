insert into hospital(name)
    values('hospital 1'),('hospital 2'),('hospital 3'),('hospital 4');

insert into department(name,hospital_id)
    values('department 1',1),('department 2',2),('department 3',3),('department 4',4);

insert into staff(name,surname,position, age, sex,department_id)
    values ('Vasyl','Pankiv','doctor',19,'MALE',1),
        ('Artem','Prokhvatylov','doctor',19,'MALE',2),
        ('Danylo','Syvak','doctor',19,'MALE',3),
        ('Yura','Malets','doctor',19,'MALE',4);

insert into users(id, password, username)
values(1,'admin','admin')