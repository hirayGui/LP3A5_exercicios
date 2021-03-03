package java8_aula6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		String texto;
		
		System.out.println("Insira o seu nome: ");
		texto = s.nextLine();
		CriarArquivo(texto, "nome.txt");
		
		System.out.println("Insira o seu sobrenome: ");
		texto = s.nextLine();
		CriarArquivo(texto, "sobrenome.txt");
		
		System.out.println("Nome completo: ");
		LerArquivo("nome.txt");
		LerArquivo("sobrenome.txt");
		
		s.close();
	}
	
	public static void CriarArquivo(String texto, String file) {
		try (PrintWriter writer = new PrintWriter(new File(file))){
			writer.print(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void LerArquivo(String file) {
		String linha;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((linha = reader.readLine()) != null){
				System.out.print(linha + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
