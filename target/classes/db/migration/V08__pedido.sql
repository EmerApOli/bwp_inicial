create table pedido (
  codigo bigint not null auto_increment,
  subtotal decimal(10,2) not null,
  taxa_frete decimal(10,2) not null,
  valor_total decimal(10,2) not null,
 data_cadastro datetime not null,
 primary key (codigo)

) engine=InnoDB default charset=utf8;
