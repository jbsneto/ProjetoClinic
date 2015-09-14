create table cargo(
	id serial primary key,
	nome varchar(100),
	salario integer,
	idsetor integer,

	foreign key (idsetor) references setor(id)
)