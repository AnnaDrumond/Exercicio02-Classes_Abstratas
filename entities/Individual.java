package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	// m�todo abstrato sobrescrito da superclasse abstrata TaxPayer:
	
	
	@Override
	public Double tax() {
		
		// Leia: express�o entre () v�lida ? SIM fa�a isso SEN�O (:) fa�a isso aqui.
		double individualTax = (getAnualIncome() < 20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		/* Esta linha 30 � uma express�o condicional tern�ria, que seria o mesmo que:
		 * if (getAnualIncome() < 20000.00) {
			individualTax = getAnualIncome() * 0.15;
		} else {
			individualTax = getAnualIncome() * 0.25;
		} 
		 */
		
		if ( healthExpenditures > 0) {
			individualTax -= getHealthExpenditures() * 0.5;
		}
		
		//Se o gasto com sa�de for muito alto, pode resultar em valor negativo para pagar:
		if (individualTax < 0) {
			return 0.0;
		} else {
			return individualTax;
		}
	}
}
