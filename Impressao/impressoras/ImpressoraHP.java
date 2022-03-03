package usoDeInterfaces.copy.Impressao.impressoras;

import usoDeInterfaces.copy.Impressao.Impressora;
import usoDeInterfaces.copy.Impressao.Imprimivel;

public class ImpressoraHP implements Impressora{

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * *  * * * * * * * * * *");
		System.out.println(imprimivel.getcabecalhoPagina());
		System.out.println("* * * * * * * * *  * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("                EPSON                  ");
		System.out.println("---------------------------------------");
		
	}

}
