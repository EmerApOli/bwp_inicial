package com.example.algamoney.api.service;


import com.example.algamoney.api.model.Pedido;

import com.example.algamoney.api.repository.PedidoRepository;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class PedidoService {
 	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	  
	 //   @PreAuthorize("hasAuthority('ROLE_PESQUISAR_CATEGORIA') and hasAuthority('SCOPE_read')" )
	@GetMapping    
	public List<Pedido> listar() {
	        return pedidoRepository.findAll();
	    }
	

	public Pedido salvar(Pedido pedido) {
		pedido.getItemPedido().forEach(
				c -> c.setPedido(pedido));
		return pedidoRepository.save(pedido);
	}
	
	
	
	

}
