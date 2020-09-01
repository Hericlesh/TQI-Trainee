package atualizacaoSistema;

public class Credito {
	double Limiteemprestimo;

	public Credito(Usuarios Usuario) {

		if (Usuario.Score >= 200 && Usuario.Score < 600) {

			this.Limiteemprestimo = 2000;

		}

		else if (Usuario.Score >= 600 && Usuario.Score < 800) {

			this.Limiteemprestimo = 4000;

		}

		else if (Usuario.Score >= 800 && Usuario.Score < 1000) {

			this.Limiteemprestimo = 6000;

		}

		else if (Usuario.Score >= 1000) {

			Limiteemprestimo = 8000;

		} else {
			this.Limiteemprestimo = 0;
		}

	}

	public void consultaEmprestimo(double valorSolicitado) {

		if (valorSolicitado > 0 && valorSolicitado <= Limiteemprestimo) {

			double novoLimiteemprestimo=Limiteemprestimo-valorSolicitado;
			System.out.println("O emprestimmo pode ser aprovado,e caso realizado seu novo limite será de :"
					+ novoLimiteemprestimo + " ate a quitação do credito.");
			
			System.out.println("Deseja solicitar o credito? \nDigite 1 para sim ou 2 para cancelar"); 

		} else {
			System.out.println("Não a valor limite disponivel para sua demanda porfavor entre em contato com a agencia ");

		}
	}

	public boolean emprestimoConfirmacao(double valorSolicitado, int confirmacao) {
		
		if(confirmacao==1 && valorSolicitado > 0 && valorSolicitado <= Limiteemprestimo ) {
			System.out.println("O emprestimo sera processado entraremos em contato");
			
			
			
		} return true;
		
	}
	
	
	
	
}
