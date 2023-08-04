package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Pais;
import View.PaisView;

public class PaisController {
	private List<Pais> listaDePaises;
	private PaisView paisView;

	public PaisController() {
		listaDePaises = new ArrayList<>();
		paisView = new PaisView();
	}

	public void adicionarPais(String nome, String capital, int populacao) {
		Pais pais = new Pais(nome, capital, populacao);
		listaDePaises.add(pais);
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(listaDePaises);

	}

	public void limparLista() {
		listaDePaises.removeAll(listaDePaises);
	}

	public void removerPais(String nome) {
		for (Pais pais : listaDePaises) {
			if (pais.getNome().equalsIgnoreCase(nome)) {
				listaDePaises.remove(pais);
				break;
			}
		}
	}
}
