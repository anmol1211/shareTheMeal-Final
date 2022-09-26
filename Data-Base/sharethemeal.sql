create database sharethemeal;
use sharethemeal;


create table city(cityname varchar(45),citypincode int primary key);



create table donor(rid int primary key,rname varchar(100),raddr varchar(100),rphone varchar(12),remail varchar(45),rpassword varchar(100),citypincode int, FOREIGN key(citypincode) REFERENCES city(citypincode));

create table donorfood(fid int primary key,fqty varchar(45),rid int ,foreign key(rid) references donor(rid));

create table customers(cid int not null auto_increment,cname varchar(50),cphone int(10),cemail varchar(60),cpassword varchar(30),citypincode int(10),primary key(cid),foreign key(citypincode) references city(citypincode));

create table companies(coId int auto_increment primary key, coName varchar(30),coAddress varchar(45),coPhone char(12),coEmail varchar(45),coPaassword varchar(30), cityPincode int, foreign key(cityPincode) references city(cityPincode));

create table foodproduct(fpId int auto_increment primary key, fpName varchar(30), fpPrice int, fpQty int);