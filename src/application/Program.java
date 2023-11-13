package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalServices;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		System.out.println("ENTRE COM OS DADOS DO CONTRATO");
		System.out.println();
		System.out.println("Número do Contrato: ");
		int number = sc.nextInt();
		System.out.println("Data do contrato (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
		System.out.println("Digite o valor total: ");
		double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, contractDate, totalValue);
		
		//Trabalhando com as parcelas
		System.out.println("Entre com o número de parcelas: ");
		int quantity = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalServices());
		
		contractService.processContract(contract, quantity);
		
		
		System.out.println("Parcelas: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		 
		
		
		sc.close();
		}
		
		
	}
