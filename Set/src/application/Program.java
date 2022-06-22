package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int user = sc.nextInt();
			cursoA.add(user);
		}
		
		System.out.println("How many students for course B?");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int user = sc.nextInt();
			cursoB.add(user);
		}
		
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int user = sc.nextInt();
			cursoC.add(user);
		}
		
		Set<Integer> cursoTotal = new HashSet<>(cursoA);
		cursoTotal.addAll(cursoB);
		cursoTotal.addAll(cursoC);
		
		
		System.out.print("Total de alunos: " + cursoTotal.size());

		
		
		sc.close();
	}
	

}
