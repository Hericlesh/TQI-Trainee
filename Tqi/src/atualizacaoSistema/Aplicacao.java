package atualizacaoSistema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		// cadastro
		ArrayList<Usuarios> Usuario = new ArrayList<>();

		Usuarios cadastro1 = new Usuarios("Hericles", "02976498144", "MG20377190", "hericles123", "diabelo");
		Usuarios cadastro2 = new Usuarios("Diana", "84992494", "MG205610170", "diana123", "diabelo");

		Usuario.add(cadastro1);
		Usuario.add(cadastro2);

		// Login

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Digite o Usuario");
		String usuarioAcesso = Teclado.nextLine();
		System.out.println("Digite a senha");
		String senhaAcesso = Teclado.nextLine();

		for (Usuarios c : Usuario) {

			if (c.login.equalsIgnoreCase(usuarioAcesso) && c.senha.equalsIgnoreCase(senhaAcesso)) {
				System.out.println("O usuario: " + c.nome + " esta logado");

				int escolha=0;
			
				do 
				{
					System.out.println("\nIndique a ação desejada\n");
					System.out.println("Digite 1 para solicitar linha de credito");
					System.out.println("Digite 2 para acompanhar solicitação de linha de credito");
					System.out.println("Digite 3 para verificar dados cadastrais");
					System.out.println("Digite 4 para SAIR");

					
					  escolha = Teclado.nextInt();

				switch (escolha) {

				case 1:

					Credito c1=new Credito(c);
					System.out.println("Digite o valor para simulação");
					Double valor=Teclado.nextDouble();
					
					c1.consultaEmprestimo(valor);
					Integer confirmacao=Teclado.nextInt();
					System.in.read();
					break;
				case 2:

					
					
					break;
				case 3:
					System.out.println("Nome: "+c.nome+"CPF: "+ c.Cpf+"RG:"+c.Rg);

					break;
			
				case 4:
					System.out.println("SAIR");

				default:
					break;

				}
				
			
				}while(escolha !=4);
				
				Teclado.close();
			}

			if (c.login.equalsIgnoreCase(usuarioAcesso) && c.senha.equalsIgnoreCase(senhaAcesso) == false) {
				System.out.println("O usuario ou a senha estão incorretos");
			}

		}

	}

}
