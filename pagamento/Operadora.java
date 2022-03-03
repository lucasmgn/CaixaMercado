package usoDeInterfaces.copy.pagamento;

public interface Operadora {
	
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
