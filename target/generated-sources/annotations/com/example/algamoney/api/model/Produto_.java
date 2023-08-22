package com.example.algamoney.api.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ {

	public static volatile SingularAttribute<Produto, BigDecimal> preco;
	public static volatile SingularAttribute<Produto, Boolean> ativo;
	public static volatile SingularAttribute<Produto, String> nome;
	public static volatile SingularAttribute<Produto, Long> id;
	public static volatile ListAttribute<Produto, ItemPedido> ItemPedido;
	public static volatile SingularAttribute<Produto, String> descricao;

	public static final String PRECO = "preco";
	public static final String ATIVO = "ativo";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String ITEM_PEDIDO = "ItemPedido";
	public static final String DESCRICAO = "descricao";

}

