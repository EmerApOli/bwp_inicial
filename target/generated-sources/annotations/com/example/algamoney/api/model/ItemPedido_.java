package com.example.algamoney.api.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemPedido.class)
public abstract class ItemPedido_ {

	public static volatile SingularAttribute<ItemPedido, BigDecimal> precoUnitario;
	public static volatile SingularAttribute<ItemPedido, Long> codigo;
	public static volatile SingularAttribute<ItemPedido, String> observacao;
	public static volatile SingularAttribute<ItemPedido, Produto> produto;
	public static volatile SingularAttribute<ItemPedido, Pedido> pedido;
	public static volatile SingularAttribute<ItemPedido, BigDecimal> precoTotal;
	public static volatile SingularAttribute<ItemPedido, Integer> quantidade;

	public static final String PRECO_UNITARIO = "precoUnitario";
	public static final String CODIGO = "codigo";
	public static final String OBSERVACAO = "observacao";
	public static final String PRODUTO = "produto";
	public static final String PEDIDO = "pedido";
	public static final String PRECO_TOTAL = "precoTotal";
	public static final String QUANTIDADE = "quantidade";

}

