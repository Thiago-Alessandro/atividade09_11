package atividade09_11;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> clientes = new ArrayList<String>();
		
		clientes.add("Aline");
		clientes.add("Anderson");
		//clientes.clear();
		//clientes.remove
		System.out.println(clientes.get(0));
		System.out.println(clientes.size());
		
		System.out.println(clientes.toString()); // Mostra todo o array
	}

}
