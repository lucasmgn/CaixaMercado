package usoDeInterfaces.copy.teste;

import usoDeInterfaces.copy.pagamento.Autorizavel;
import usoDeInterfaces.copy.pagamento.Cartao;
import usoDeInterfaces.copy.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("556") && autorizavel.getValorTotal() < 100 ;
	}

}
