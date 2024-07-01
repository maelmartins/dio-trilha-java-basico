package br.com.projetojpa.id;

import java.math.BigDecimal;

public class RelatorioService {
	
	private Pedidos pedidos;
	
	public RelatorioService(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	

	public RelatorioService() {
	}


	public BigDecimal totalPedidosAtual() {
		return pedidos.totalPedidosMesAtual();
	}
	
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
}
