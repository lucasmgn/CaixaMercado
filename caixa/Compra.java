package usoDeInterfaces.copy.caixa;

import usoDeInterfaces.copy.Impressao.Imprimivel;
import usoDeInterfaces.copy.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel  {

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String getcabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}
	
}
