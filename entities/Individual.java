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

	// método abstrato sobrescrito da superclasse abstrata TaxPayer:
	
	double individualTax = 0.0;
	@Override
	public Double tax() {
		
		if (getAnualIncome() < 20000.00) {
			individualTax = getAnualIncome() * 0.15;
		} else {
			individualTax = getAnualIncome() * 0.25;
		}
		
		if ( healthExpenditures > 0) {
			individualTax -= getHealthExpenditures() * 0.5;
		}
		
		//Se o gasto com saúde for muito alto, pode resultar em valor negativo para pagar:
		if (individualTax < 0) {
			return 0.0;
		} else {
			return individualTax;
		}
	}
}
