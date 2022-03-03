package usoDeInterfaces.copy.caixa;

import usoDeInterfaces.copy.Impressao.Impressora;
import usoDeInterfaces.copy.pagamento.Cartao;
import usoDeInterfaces.copy.pagamento.Operadora;

public class Checkout {
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			this.impressora.imprimir(compra);
		}else {
			System.out.println("Pagamento negado!!");
		}
	}

}
