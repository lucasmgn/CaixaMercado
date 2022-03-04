# CaixaMercado

<p>Projeto desenvolvido para praticar a utilização de polimofismo e de interfaces</p>

<h2>Interface IMPRIMIVEL</h2>
<p>Possui o método: </p>
 getCabecalho(); String
 getCorpoPagina(); String

<p>Usaremos ela para imprimir uma folha de pagamento.</p>


<h2>Interface IMPRESSORA</h2>

<p>Possui o método: </p>

imprimir(Imprimivel imprimivel)

Usado para usar os metodos da interface IMPRIMIVEL.

<h2>Classe CHECKOUT</h2> 

<p>Vai ter contato com uma inteface Impressora e uma interface Operadora:</p>

<b>Interfaces:</b>
	      <br><p> private Operadora operadora;</p>
	        <p>private Impressora impressora;</p>

<b>Método:</b>
	<p>fecharCompra(Compra compra, Cartao cartao);</p>
  
<h2>Interface AUTORIZAVEL</h2> 

<b>Método:</b>
getValortotal();

<h2>Interface OPERADORA</h2>

<b>Método:</b>
autorizar(Autorizavel, Cartao cartao)

<h2>Classe CARTAO </h2>

<b>Atributos:</b>
	<p>private String nomeTitular;</p>
	<p>private String numeroCartao;</p>
	<p>Metodos getters e setters</p>
	
<h2>Classe COMPRA </h2>	

<p>Que implementa as interfaces Autorizavel e Imprimivel</p>

<b>Atributos:</b>

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
<p> Com metodos getters e setters</p>

<p> Valor total do produto, nome do produto e o nome do cliente</p>
	
<h2> Uma classe para executar os Testes</h2>

<p>Validando Informações e Imprimindo na tela.</p>

