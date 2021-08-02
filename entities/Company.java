package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	// método abstrato sobrescrito da superclasse abstrata TaxPayer:
	double companyTax = 0.0;

	@Override
	public Double tax() {

		if (numberOfEmployees > 10) {
			companyTax = getAnualIncome() * 0.14;
		} else {
			companyTax = getAnualIncome() * 0.16;
		}
		return companyTax;
	}

}
