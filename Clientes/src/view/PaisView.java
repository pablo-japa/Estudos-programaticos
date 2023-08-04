package View; 

import java.util.List;

import Model.Pais;

public class PaisView {
	public void exibirListaDePaises(List<Pais> paises) {
		System.out.println("----Lista De Paises----");
		System.out.println("-----------------------");
		
		for (Pais pais : paises) {
			System.out.println("Pais: " + pais.getNome() + " capital: " + pais.getCapital() + " População: " + pais.getPopulacao());
		}
		
	}

}
