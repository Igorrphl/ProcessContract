package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		System.out.println("ENTRE COM OS DADOS DO CONTRATO");
		System.out.println();
		System.out.println("Número do Contratado: ");
		int number = sc.nextInt();
		System.out.println("Data do contrato: ");
		LocalDate contractDate = LocalDate.parse(sc.next());
		System.out.println("Digite o valor total do contrato: ");
		double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, contractDate, totalValue);
		
		System.out.println("Entre com o número de parcelas: ");
		int quantity = sc.nextInt();
		
		
			
		}
		
		
	}
