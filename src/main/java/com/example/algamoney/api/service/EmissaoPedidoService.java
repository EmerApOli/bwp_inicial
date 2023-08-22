package com.example.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.algamoney.api.model.ItemPedido;
import com.example.algamoney.api.model.Pedido;
import com.example.algamoney.api.repository.PedidoRepository;

@Service
public class EmissaoPedidoService {

	//@Autowired
//	private PedidoRepository pedidoRepository;

	/*@Autowired
	private CadastroRestauranteService cadastroRestaurante;

	@Autowired
	private CadastroCidadeService cadastroCidade;

	@Autowired
	private CadastroUsuarioService cadastroUsuario;

	@Autowired
	private CadastroProdutoService cadastroProduto;

	@Autowired
	private CadastroFormaPagamentoService cadastroFormaPagamento;
*/
	

	/*private void validarPedido(Pedido pedido) {
		Cidade cidade = cadastroCidade.buscarOuFalhar(pedido.getEnderecoEntrega().getCidade().getId());
		Usuario cliente = cadastroUsuario.buscarOuFalhar(pedido.getCliente().getId());
		Restaurante restaurante = cadastroRestaurante.buscarOuFalhar(pedido.getRestaurante().getId());
		FormaPagamento formaPagamento = cadastroFormaPagamento.buscarOuFalhar(pedido.getFormaPagamento().getId());

		pedido.getEnderecoEntrega().setCidade(cidade);
		pedido.setCliente(cliente);
		pedido.setRestaurante(restaurante);
		pedido.setFormaPagamento(formaPagamento);
		
		if (restaurante.naoAceitaFormaPagamento(formaPagamento)) {
			throw new NegocioException(String.format("Forma de pagamento '%s' não é aceita por esse restaurante.",
					formaPagamento.getDescricao()));
		}
	}*/
	public void validarItens(Pedido pedido) {
		////pedido.getItens().forEach(item -> {
		//	Produto produto = cadastroProduto.buscarOuFalhar(
		///			pedido.getRestaurante().getId(), item.getProduto().getId());
			
		  ItemPedido item = new ItemPedido();
		
			item.setPedido(item.getPedido());
			item.setProduto(item.getProduto());
			item.setObservacao(item.getObservacao());
			
			
		}
	
	
///	public Pedido buscarOuFalhar(Long pedidoId) {
	//	return pedidoRepository.findById(pedidoId)
	//		.orElseThrow(() -> new PedidoNaoEncontradoException(pedidoId));
	//}

}
