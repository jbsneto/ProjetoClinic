create table cliente (

        id serial primary key,
	nome varchar(100), 
	cpf varchar(20), 
	dataNas varchar(20), 
	dataCadastro varchar(20), 
	telefone varchar(20), 
	email varchar(30), 
	obs varchar(500), 
	pais varchar(20), 
	estado varchar(20), 
	cidade varchar(20),
	bairro varchar(200), 
	rua varchar(200), 
	numero varchar(10), 
	complemento varchar(100), 
	cep varchar(10)

)