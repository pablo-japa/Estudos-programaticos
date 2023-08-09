package View;
import Controller.CaixaController;
import Model.CaixaModel;

public class CaixaView {
	
	public void exibirDepositoSucesso(double saldo) {
		System.out.println("-------Caixa Eletrônico-------");
		System.out.println("Saldo: " + saldo );
		System.out.println("--------//---------//---------");
	}
	public void exibirMensagemValorInvalido(double saldo) {
		System.out.println("Valor Invalido");
		
		
	}
}
