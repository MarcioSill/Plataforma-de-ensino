package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);		
		List<Lesson> list = new ArrayList<>();

		System.out.printf("Quantas aulas tem o curso? ");		
		int N =  sc.nextInt();
		
		sc.nextLine();		
		
		for(int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Dados da "+ i + "a aula:" );
					
			System.out.printf("Conteúdo ou tarefa (c/t)? ");			
			char letra = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.printf("Título: ");			
			String titulo = sc.nextLine();
			
			if(letra == 'c' || letra == 'C') {	
							
			System.out.printf("URL do vídeo: ");
			String url = sc.nextLine();
			
			System.out.printf("Duração em segundos: ");
			int dura = sc.nextInt();
			list.add(new Video(titulo, url, dura ));
		
		 }
			else {
								
				System.out.printf("Descrição: ");
				String descritionj = sc.nextLine();
				
				System.out.printf("Quantidade de questões:: ");
				int quantidade= sc.nextInt();
				
				list.add(new Task(titulo, descritionj, quantidade));
			}			
		}		
		
		int total = 0;
		
		for(Lesson c : list) {
			
			total += c.duration();			
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = "+ total + " segundos");
		
		sc.close();

	}

}
