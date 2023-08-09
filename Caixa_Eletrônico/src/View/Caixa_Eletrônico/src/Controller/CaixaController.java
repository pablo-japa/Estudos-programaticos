package Controller;

import Model.CaixaModel;
import View.CaixaView;


public class CaixaController {

	private CaixaModel caixaModel;
	private CaixaView caixaView;

	public CaixaController(double saldo, CaixaView caixaView) {
		caixaModel = new CaixaModel(saldo);
	}

	public void depositarSaldo(double valor, double saldo) {
		if (valor > 0) {
			caixaModel.setSaldo(caixaModel.getSaldo() + valor);
			caixaView.exibirDepositoSucesso(valor);
		}else {
			caixaView.exibirMensagemValorInvalido(valor);
		}
	}
	public void exibirSaldo(CaixaView caixaView){
		double saldo = caixaModel.getSaldo();
		caixaView.exibirDepositoSucesso(saldo);
		
}
}

