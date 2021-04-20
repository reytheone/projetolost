create database itau;

use itau;

create table itau.clientes(
codigo_cliente int not null,
nome_cliente varchar(50) not null,
idade_cliente integer not null,
email_cliente varchar(80) not null);

describe itau.clientes;

insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1,"Reinaldo Rodrigues",44,"reytheone@yahoo.com"),
(2,"Ricardo Armelin",36,"armelin@unibanco.com.br"),
(3,"Marcia CursoSql",19,"marcia@sql.com"),
(4,"Douglas Cavalcanti",20,"douglas.c@itau.com.br");

select * from itau.clientes;

delete from itau.clientes;

select * from itau.clientes order by codigo_cliente;

use itau;

INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Erica W. Harrington",23,"molestie.tortor.nibh@non.ca"),(6,"Adena Ryan",45,"ullamcorper.eu@incursuset.co.uk"),(7,"Gisela Barr",40,"pede.Cum.sociis@penatibus.co.uk"),(8,"Dorothy X. Raymond",70,"lacinia.mattis.Integer@ipsumDonec.edu"),(9,"Palmer Massey",63,"Donec.egestas.Aliquam@Crasvulputatevelit.ca"),(10,"Myra Z. Leblanc",44,"orci.tincidunt.adipiscing@molestiearcuSed.edu"),(11,"Stewart O. Simpson",22,"erat@condimentumDonec.ca"),(12,"Roanna Huff",74,"arcu.iaculis@urnaconvallis.co.uk"),(13,"Todd Ferguson",73,"vehicula.aliquet.libero@aptent.co.uk"),(14,"Gregory W. Fischer",48,"eget.massa.Suspendisse@tincidunttempusrisus.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Hayden Velez",18,"Mauris@sedduiFusce.org"),(16,"Jarrod Woodward",99,"elementum@consequatenim.net"),(17,"Rae B. Fischer",24,"Nulla@egetvolutpat.ca"),(18,"Martha D. Albert",86,"velit.dui.semper@consectetueripsumnunc.edu"),(19,"Quentin Howell",28,"risus.Quisque.libero@tortorInteger.edu"),(20,"Blaine Mcguire",67,"eros@in.com"),(21,"Xandra T. Maldonado",29,"molestie@fermentumfermentumarcu.edu"),(22,"Rebekah Hahn",51,"Aenean@mauris.com"),(23,"Adam Hawkins",24,"Cras.eu@mollis.ca"),(24,"Madeson Wallace",22,"arcu@In.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Daniel Hood",95,"Duis.cursus.diam@Proinvel.net"),(26,"Brendan Cooley",67,"Mauris.magna@Quisque.co.uk"),(27,"Benedict Rodriquez",100,"sollicitudin.adipiscing@eu.edu"),(28,"Dora Mcguire",50,"Nunc.mauris@cursusluctusipsum.net"),(29,"Ross Nielsen",72,"at@Praesenteu.ca"),(30,"Jaquelyn Vargas",84,"ultrices@tempor.net"),(31,"Lyle B. Olsen",58,"in.faucibus@sed.edu"),(32,"Lara F. Hancock",64,"non.sollicitudin@litoratorquentper.org"),(33,"Lael T. Carpenter",74,"vulputate@luctuset.net"),(34,"Sandra L. Hayden",28,"amet.dapibus@idblandit.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Lesley F. Carver",27,"erat.semper@necmetus.ca"),(36,"Kato R. Knowles",58,"per.inceptos@Phasellusdapibusquam.com"),(37,"Brody Holland",41,"cubilia@interdum.com"),(38,"Brynn P. Hernandez",79,"odio.semper.cursus@porttitor.org"),(39,"Samantha Hatfield",63,"vitae.odio.sagittis@egestasnuncsed.co.uk"),(40,"Nehru V. Massey",49,"ut.quam.vel@SeddictumProin.edu"),(41,"Joan Y. Ballard",42,"gravida@Fuscemollis.net"),(42,"Riley M. White",79,"lorem@vitaevelit.co.uk"),(43,"Quin X. Wynn",47,"accumsan.laoreet@nunc.ca"),(44,"Phillip F. Crawford",36,"dignissim.tempor@duinec.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"MacKensie Z. Tyson",51,"et@semperauctor.edu"),(46,"Glenna Hancock",57,"Quisque.ornare@dolorvitaedolor.edu"),(47,"Camilla P. Barlow",41,"Mauris.blandit.enim@quispedePraesent.co.uk"),(48,"Shelley P. Love",28,"penatibus.et@tellusjusto.com"),(49,"Gay Z. Bowers",71,"amet.consectetuer@Suspendissecommodotincidunt.net"),(50,"Preston A. Callahan",60,"orci@sedhendrerit.com"),(51,"Dale Z. Cantrell",59,"augue.malesuada@tempus.net"),(52,"Kuame Klein",98,"mi@rutrum.ca"),(53,"Ashton Gomez",69,"urna.et.arcu@Utnecurna.co.uk"),(54,"Sophia B. Ingram",49,"Duis.sit@accumsansedfacilisis.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Evangeline K. Atkinson",98,"massa@Donecelementumlorem.ca"),(56,"Bertha Y. Barnes",51,"lectus.pede.et@in.co.uk"),(57,"Miranda O. Morgan",71,"ultrices.iaculis.odio@Aeneanegestashendrerit.ca"),(58,"Ingrid T. Pate",43,"primis.in.faucibus@non.co.uk"),(59,"Fuller A. Mcbride",42,"semper@DonecestNunc.org"),(60,"Malcolm P. Miranda",31,"et.ultrices@ullamcorpervelitin.net"),(61,"Blair Guerra",96,"Proin.non@Quisquetincidunt.com"),(62,"Seth Callahan",27,"convallis.in@ultrices.ca"),(63,"Rogan Crawford",79,"lorem@natoquepenatibuset.ca"),(64,"Dorian Valentine",48,"mauris@gravidanuncsed.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Griffin Q. Owen",96,"enim.Mauris.quis@molestieSedid.edu"),(66,"Barrett F. Horn",84,"Maecenas.ornare.egestas@gravida.co.uk"),(67,"Lionel D. Velasquez",52,"mollis.Integer@disparturientmontes.co.uk"),(68,"Conan X. Hodges",20,"Mauris.quis.turpis@luctusaliquetodio.net"),(69,"Dale Murray",46,"amet.ultricies.sem@justoeuarcu.ca"),(70,"Quyn Gonzalez",62,"mi.felis.adipiscing@lacusUtnec.edu"),(71,"Maite X. Stewart",56,"Mauris.vestibulum.neque@blanditviverra.net"),(72,"Elton Booth",54,"mauris.ut.mi@viverraMaecenas.edu"),(73,"Darrel F. Sexton",95,"molestie@faucibusorci.com"),(74,"Barclay X. Olson",67,"Integer.sem.elit@Sed.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Amaya Merrill",64,"pharetra.Nam.ac@magna.org"),(76,"Orson Salinas",71,"Maecenas@variusultrices.com"),(77,"Kasper Valencia",34,"Nunc.pulvinar@sedleoCras.co.uk"),(78,"Ray Salinas",51,"adipiscing.Mauris.molestie@fringillacursus.org"),(79,"Jarrod F. Donaldson",31,"bibendum.sed@maurisSuspendissealiquet.co.uk"),(80,"Omar C. Charles",83,"Maecenas.iaculis.aliquet@felisadipiscingfringilla.ca"),(81,"Lucian H. Knowles",35,"Nunc@pede.ca"),(82,"Merrill Brown",20,"lobortis@lorem.co.uk"),(83,"Willa Mccall",91,"magna@ridiculus.net"),(84,"Nathan Beasley",32,"euismod.in@etultricesposuere.net");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"Reuben L. Copeland",54,"Donec.elementum.lorem@egetipsum.org"),(86,"Blaze Maldonado",85,"In.scelerisque@mieleifend.com"),(87,"Howard R. Tanner",69,"aliquet.vel@sit.ca"),(88,"Tamekah V. Mills",99,"Donec.egestas@ac.ca"),(89,"Trevor P. Bowen",62,"Proin@nonummy.edu"),(90,"Amal W. Gardner",87,"purus@dictumProineget.org"),(91,"Dai Knowles",61,"lacus.Quisque.imperdiet@eunibhvulputate.net"),(92,"Ali Santana",67,"Fusce.mi.lorem@erosnonenim.ca"),(93,"Zahir Hubbard",66,"Aliquam.tincidunt.nunc@eunulla.edu"),(94,"Griffin Patrick",93,"dolor@loremsitamet.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Maggy Watts",58,"ultrices.Vivamus@anteblandit.co.uk"),(96,"Herrod V. Kim",99,"egestas.a.dui@enimdiam.ca"),(97,"Kasper Richmond",94,"lorem.semper@pedeSuspendissedui.edu"),(98,"Ethan Morris",27,"gravida@Etiamligulatortor.edu"),(99,"Bethany Schneider",63,"nec.ante.Maecenas@Vestibulumuteros.ca"),(100,"Erica Mckinney",84,"egestas@ultricesVivamus.com"),(101,"Shaeleigh Z. Hoover",48,"tempus.scelerisque.lorem@utipsum.org"),(102,"Jennifer Wooten",25,"sem.vitae@sit.ca"),(103,"Rafael T. Albert",90,"amet@euismod.net"),(104,"Zenia P. Velazquez",19,"non@egetvolutpat.co.uk");

select * from itau.clientes where idade_cliente>50 order by idade_cliente;

select * from itau.clientes where idade_cliente>=18 and idade_cliente<= 25 order by idade_cliente;

select * from itau.clientes where idade_cliente between 18 and 25 order by idade_cliente;

select * from itau.clientes where codigo_cliente in(10, 18, 20) order by codigo_cliente desc;

select * from itau.clientes where nome_cliente like "ray%";

select * from itau.clientes where nome_cliente like "%z%";

select * from itau.clientes where nome_cliente like "B%";

select min(idade_cliente) from itau.clientes;

select * from itau.clientes 

select * from itau.clientes where idade_cliente=(select min(idade_cliente) from itau.clientes);

select * from itau.clientes where idade_cliente=(select max(idade_cliente) from itau.clientes);

create table itau.bck_clientes select * from itau.clientes;

select * from itau.bck_clientes;

select count(*) as Total_Registros from itau.clientes;

select count(*) as Total_Registros from itau.bck_clientes;

alter table itau.clientes add endereco_cliente varchar(60) not null;

alter table itau.clientes drop endereco_cliente;

alter table itau.clientes rename column endereco to endereco_cliente;

alter table itau.clientes rename column endereco to endereco_cliente;

select * from itau.clientes;

describe itau.clientes;

alter table itau.clientes change endereco_cliente endereco_cliente varchar(100) not null;

alter table itau.clientes change email_cliente email_cliente varchar(70) not null;

update itau.clientes set endereco_cliente="Rua Fábia" where codigo_cliente=1;

select * from itau.clientes;

update itau.clientes set endereco_cliente="Atualizar Endereço do Cliente" where endereco_cliente="";

create table itau.bck_clientes select * from itau.clientes;

select * from itau.bck_clientes;

delete from itau.clientes;

drop table itau.clientes;

select * from itau.clientes;

insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente from itau.bck_clientes where idade_cliente between 18 and 30;

describe itau.bck_clientes;

select count(*) from itau.clientes where idade_cliente between 18 and 30;

delete from itau.clientes where idade_cliente between 18 and 30;

create database unibanco;

use unibanco;

create table unibanco.clientes select*from itau.clientes;

select * from unibanco.clientes;

drop database itau;

create database itau;

use itau;

create table itau.clientes(
codigo_cliente int not null auto_increment primary key,
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null,
endereco_cliente varchar(60) not null,
bairro_cliente varchar(30) not null,
cep_cliente char(8) not null,
estado_cliente char(2) not null,
dep_valor_cliente dec(8,2) not null,
idade_cliente int not null,
email_cliente varchar(80) not null,
data_controle_registro datetime);

describe itau.clientes;

insert into itau.clientes
(nome_cliente,cpf_cliente,endereco_cliente,bairro_cliente,cep_cliente,estado_cliente,dep_valor_cliente,idade_cliente,email_cliente,data_controle_registro)
values
("Marcos Andre","25091096850","Rua Jacarapinima, 27","Casa Verde","02021030","SP",257000.00,41,"yahoo@yahoo.com","2021/04/19 15:03")

select * from itau.clientes;
select * from unibanco.clientes;

describe unibanco.clientes;

insert into itau.clientes
(nome_cliente,cpf_cliente,endereco_cliente,bairro_cliente,cep_cliente,estado_cliente,dep_valor_cliente,idade_cliente,email_cliente,data_controle_registro)
select nome_cliente,"Atualizar",endereco_cliente,"Atualiza Bairro","00000000","xx",0,idade_cliente,email_cliente,now() from unibanco.clientes;

create table itau.vendas(
codigo_venda int not null auto_increment primary key,
produto_vendido varchar(50) not null,
quantidade_vendida int not null,
valor_unitario_vendido dec (8,2) not null,
nome_vendedor varchar (50) not null);

describe itau.vendas;

insert into itau.vendas
(produto_vendido,quantidade_vendida,valor_unitario_vendido,nome_vendedor)
values
("PIC",50,325.99,"Paulo"),
("SeguroAuto",35,2500.00,"Luciana"),
("SeguroVida",12,799.00,"Cristina"),
("IAR",72,3200.00,"Cristina"),
("TD",98,1200.00,"Cristina");

SELECT 
    codigo_venda,
    produto_vendido,
    quantidade_vendida,
    valor_unitario_vendido,
    (quantidade_vendida*valor_unitario_vendido) as Total_Vendido,
    nome_vendedor
FROM
    itau.vendas;

SELECT 
    SUM(quantidade_vendida * valor_unitario_vendido) AS Total
FROM
    itau.vendas;
    
SELECT 
    SUM(quantidade_vendida * valor_unitario_vendido) AS Total_Venda,
    nome_vendedor,
    count(produto_vendido) as Itens_Vendidos
FROM
    itau.vendas
GROUP BY nome_vendedor;

SELECT 
    COUNT(nome_cliente) AS Total_Pessoas, idade_cliente
FROM
    itau.clientes
WHERE
    idade_cliente BETWEEN 18 AND 25
GROUP BY idade_cliente
ORDER BY idade_cliente;

use itau;

CREATE TABLE `produtos` (
	`codigo_produto` INT NOT NULL AUTO_INCREMENT,
	`nome_produto` varchar(50) NOT NULL,
	`valor_produto` DECIMAL(8,2) NOT NULL,
	`codigo_marca` INT NOT NULL,
	PRIMARY KEY (`codigo_produto`)
);

CREATE TABLE `marcas` (
	`codigo_marca` INT NOT NULL AUTO_INCREMENT,
	`nome_marca` varchar(50) NOT NULL,
	PRIMARY KEY (`codigo_marca`)
);

ALTER TABLE `produtos` ADD CONSTRAINT `produtos_fk0` FOREIGN KEY (`codigo_marca`) REFERENCES `marcas`(`codigo_marca`);

select * from itau.marcas;
select * from itau.produtos;

drop table itau.marcas;
drop table itau.produtos;

insert into itau.produtos
(nome_produto,valor_produto,codigo_marca)
values
("Home Theather",3000,4);

insert into itau.marcas
(nome_marca)
values
("Samsung");

create table itau.cargo(
cod_cargo char(2) not null primary key,
nome_cargo varchar (30) not null);

create table funcionario(
matricula int not null primary key auto_increment,
nome_funcionario varchar(40) not null,
cod_cargo char(2) not null,
foreign key (cod_cargo) references itau.cargo(cod_cargo));

insert into itau.cargo
(cod_cargo,nome_cargo)
values
("C1","programador"),
("C2","analista de sistemas");

insert into itau.funcionario
(nome_funcionario,cod_cargo)
values
("Pedro","c1"),
("Roberta","c1"),
("Alberto","c2");

select f.matricula,f.nome_funcionario,c.nome_cargo from itau.cargo as c inner join itau.funcionario as f on (c.cod_cargo=f.cod_cargo);