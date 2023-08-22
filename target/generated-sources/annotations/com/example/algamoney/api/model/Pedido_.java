package com.example.algamoney.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	public static volatile SingularAttribute<Pedido, BigDecimal> taxaFrete;
	public static volatile SingularAttribute<Pedido, Long> codigo;
	public static volatile SingularAttribute<Pedido, LocalDate> dataPagamento;
	public static volatile SingularAttribute<Pedido, BigDecimal> subtotal;
	public static volatile SingularAttribute<Pedido, BigDecimal> valorTotal;
	public static volatile ListAttribute<Pedido, ItemPedido> ItemPedido;

	public static final String TAXA_FRETE = "taxaFrete";
	public static final String CODIGO = "codigo";
	public static final String DATA_PAGAMENTO = "dataPagamento";
	public static final String SUBTOTAL = "subtotal";
	public static final String VALOR_TOTAL = "valorTotal";
	public static final String ITEM_PEDIDO = "ItemPedido";

}

