package entities;

public abstract class TaxPayer {
	//�"abstract" --  � uma forma de garantir heran�a total: somente subclasses n�o 
	// abstratas (comuns) podem ser instanciadas, mas nunca a superclasse abstrata.
	
	private String name;
	private Double anualIncome;
	
	// colocando o construtor cheio e vazio, gera a op��o para o programador
	// instanciar objetos com e sem argumentos
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// Inserindo o m�todo abstrato:
	// S�o m�todos que n�o possuem implementa��o.
	// M�todos precisam ser abstratos quando a classe � gen�rica demais para conter sua implementa��o
	
	public abstract Double tax();
	
	// Como o m�todo � abstrato, obrigatoriamente esta classe deve ser tamb�m abstrata.
	
	
	
}
