package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Roberta da Silva  Bragança de Souza");
		list.add("Coelho Machado de Alcântara Mello do Rosário");
		list.add("Santos Lepoldina Ferreina Schneider");
		list.add("rodrigo");
		list.removeIf(x -> x.charAt(0) == 'C');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("INdexOf Roberta ");
		
		System.out.println("---------------------------------------------");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.tolist());
	}

}
