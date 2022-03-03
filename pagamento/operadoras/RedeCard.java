package usoDeInterfaces.copy.pagamento.operadoras;

import usoDeInterfaces.copy.pagamento.Autorizavel;
import usoDeInterfaces.copy.pagamento.Cartao;
import usoDeInterfaces.copy.pagamento.Operadora;

public class RedeCard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("526") && autorizavel.getValorTotal() < 200 ;
	}
	
}
