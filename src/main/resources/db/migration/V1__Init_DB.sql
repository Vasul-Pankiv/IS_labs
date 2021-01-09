create table department
(
    id          bigint auto_increment
        primary key,
    name        varchar(25) null,
    hospital_id bigint      null
)
    engine = MyISAM;

create index FKn8lq60po1t7p42oslqbk61wnu
    on department (hospital_id);

create table disease
(
    id   bigint auto_increment
        primary key,
    name varchar(25) null
)
    engine = MyISAM;

create table diseases_medicaments
(
    disease_id    bigint not null,
    medicament_id bigint not null,
    primary key (disease_id, medicament_id)
)
    engine = MyISAM;

create index FKra6d5u4ql2h8fvopogpn8sm5o
    on diseases_medicaments (medicament_id);


create table hospital
(
    id   bigint auto_increment
        primary key,
    name varchar(25) null
)
    engine = MyISAM;

create table medicament
(
    id   bigint auto_increment
        primary key,
    name varchar(25) null
)
    engine = MyISAM;

create table patient
(
    id            bigint auto_increment
        primary key,
    age           int          null,
    name          varchar(25)  null,
    sex           varchar(255) null,
    surname       varchar(25)  null,
    department_id bigint       null
)
    engine = MyISAM;

create index FKiasak5f8aedsbc41scrpikm8q
    on patient (department_id);

create table patients_diseases
(
    patient_id bigint not null,
    disease_id bigint not null,
    primary key (patient_id, disease_id)
)
    engine = MyISAM;

create index FKokitup0o4q6ijc67hfeul0d7h
    on patients_diseases (disease_id);

create table patients_medicaments
(
    patient_id    bigint not null,
    medicament_id bigint not null,
    primary key (patient_id, medicament_id)
)
    engine = MyISAM;

create index FK7csie96e0b38t2rhd673x24gw
    on patients_medicaments (medicament_id);

create table patients_staff
(
    patient_id bigint not null,
    staff_id   bigint not null,
    primary key (patient_id, staff_id)
)
    engine = MyISAM;

create index FKed7s3seb5hqgwslhsfetq5uap
    on patients_staff (staff_id);

create table staff
(
    id            bigint auto_increment
        primary key,
    age           int          null,
    name          varchar(25)  null,
    position      varchar(255) null,
    sex           varchar(255) null,
    surname       varchar(25)  null,
    department_id bigint       null
)
    engine = MyISAM;

create index FK686rqn8cpu4ncey4odd8cw3hm
    on staff (department_id);

