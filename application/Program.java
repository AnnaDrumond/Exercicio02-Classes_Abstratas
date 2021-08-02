package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int payers = scanner.nextInt();

		// Para ler os dados de cada contribuinte:
		for (int i = 1; i <= payers; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char payerType = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = scanner.nextDouble();

			if (payerType == 'i' || payerType == 'I') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = scanner.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = scanner.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}
		scanner.close();

		System.out.println();
		System.out.println("TAXES PAID: ");

		double sum = 0.0;
		for (TaxPayer element : list) {
			System.out.printf(element.getName() + ": § " + String.format("%.2f%n",element.tax()));
			sum = sum + element.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", sum);

	}

}
