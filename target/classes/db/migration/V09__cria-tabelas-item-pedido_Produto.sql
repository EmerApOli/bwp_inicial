create table Produto (
  id bigint not null auto_increment,
  nome  varchar(255) null,
  descricao  varchar(255) null,
  preco_unitario decimal(10,2) not null,
  ativo  boolean,
  primary key (id),
  unique key uk_produto (id)
) engine=InnoDB default charset=utf8;

adaddaddasdda
--ewew

create table item_pedido (
  codigo bigint not null auto_increment,
  preco_unitario decimal(10,2) not null,
  preco_total decimal(10,2) not null,
  quantidade  bigint not null,
  observacao varchar(255) null,
  pedido_codigo bigint not null,
  produto_id bigint not null,
  primary key (codigo),
  unique key uk_item_pedido_produto ( pedido_codigo, produto_id),

  constraint fk_item_pedido_pedido foreign key (pedido_codigo) references pedido (codigo),
  constraint fk_item_pedido_produto foreign key (produto_id) references produto (id)
) engine=InnoDB default charset=utf8;