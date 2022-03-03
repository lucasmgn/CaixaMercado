package usoDeInterfaces.copy.pagamento.operadoras;

import usoDeInterfaces.copy.Impressao.Impressora;
import usoDeInterfaces.copy.Impressao.impressoras.ImpressoraEpson;
import usoDeInterfaces.copy.Impressao.impressoras.ImpressoraHP;
import usoDeInterfaces.copy.caixa.Checkout;
import usoDeInterfaces.copy.caixa.Compra;
import usoDeInterfaces.copy.pagamento.Cartao;
import usoDeInterfaces.copy.pagamento.Operadora;
import usoDeInterfaces.copy.teste.Cielo;

public class TesteCheckout {
 public static void main(String[] args) {
	Operadora operadora = new RedeCard();
	Impressora impressora = new ImpressoraHP();
	
	Cartao cartao = new Cartao();
	cartao.setNomeTitular("Carlos Litos Neto");
	cartao.setNumeroCartao("5565656");
	
	Compra compra = new Compra();
	compra.setNomeCliente("Carlos Litos Neto");
	compra.setProduto("Sabonete intimo");
	compra.setValorTotal(4.5);
	
	Checkout check = new Checkout(operadora, impressora);
	check.fecharCompra(compra, cartao);
}
}
