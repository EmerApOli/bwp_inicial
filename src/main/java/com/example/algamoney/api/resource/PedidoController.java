package com.example.algamoney.api.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.example.algamoney.api.event.RecursoCriadoEvent;
import com.example.algamoney.api.model.Pedido;
import com.example.algamoney.api.repository.PedidoRepository;
import com.example.algamoney.api.service.EmissaoPedidoService;
import com.example.algamoney.api.service.PedidoService;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;

	@Autowired
	EmissaoPedidoService emissãopedidoservice;
	
	    @GetMapping
	 //   @PreAuthorize("hasAuthority('ROLE_PESQUISAR_CATEGORIA') and hasAuthority('SCOPE_read')" )
	    public List<Pedido> listar() {
	        return pedidoRepository.findAll();
	    }
	

    @PostMapping
//	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA') and hasAuthority('SCOPE_write')")
	public ResponseEntity<Pedido> criar(@Valid @RequestBody Pedido pedido, HttpServletResponse response) {
    	emissãopedidoservice.validarItens(pedido);
		Pedido pedidoSalvar = pedidoService.salvar(pedido);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, pedidoSalvar.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSalvar);
	}
   
}