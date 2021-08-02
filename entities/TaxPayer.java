package entities;

public abstract class TaxPayer {
	//•"abstract" --  É uma forma de garantir herança total: somente subclasses não 
	// abstratas (comuns) podem ser instanciadas, mas nunca a superclasse abstrata.
	
	private String name;
	private Double anualIncome;
	
	// colocando o construtor cheio e vazio, gera a opção para o programador
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
	
	// Inserindo o método abstrato:
	// São métodos que não possuem implementação.
	// Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
	
	public abstract Double tax();
	
	// Como o método é abstrato, obrigatoriamente esta classe deve ser também abstrata.
	
	
	
}
