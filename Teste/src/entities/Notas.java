package entities;

import java.util.Scanner;

public class Notas {

	String nome;
	int nota1bim;
	int nota2bim;
	int nota3bim;
	int notaFinal;
	public Scanner scan = new Scanner(System.in);
	
	public Notas() {
		System.out.println("Insira o nome do aluno: ");
		nome = scan.nextLine();
		
		this.insiraNota();
		 while (nota1bim > 30 || nota2bim > 35 || nota3bim > 35) {
			System.out.println("Erro, insira a nota novamente abaixo");
			insiraNota();
		}
		 scan.close();
	}

	public int notaFinal() {
		notaFinal = nota1bim + nota2bim + nota3bim;
		System.out.println("A nota final do aluno foi: " + notaFinal);

		return notaFinal;
	}

	public void insiraNota() {
		
		String[] nomeSep = nome.split(" ");
		System.out.println("Insira as notas do aluno " + nomeSep[0] + ": ");
		nota1bim = scan.nextInt();
		nota2bim = scan.nextInt();
		nota3bim = scan.nextInt();

	}

	public void passou() {
		
		if(notaFinal > 60) {
			System.out.println("Sua nota final foi: " + notaFinal);
			System.out.println("Passou!");
			return;
		}
		System.out.println("Sua nota final foi: " + notaFinal);
		System.out.println("Não passou.");
		return;
		
	  }
	}
