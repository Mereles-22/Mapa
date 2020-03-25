package Mapa;
import java.util.Scanner;

public class Mapa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Casa[] casa = new Casa[999];
		Rua[] rua = new Rua[999];
		RotasSalvas[] rota = new RotasSalvas[999];
		Pessoa[] pessoa =  new Pessoa[999];
		
		int indiceCasa = 0 , indiceRua = 0, indiceRota = 0, indicePessoa = 0;
		
		while (true) {
			System.out.println("------Deseja entrar no Sistema?------");
			System.out.println("(1) Entrar no Sistema");
			System.out.println("(2) Sair do Sistema");
			int opcao = leitor.nextInt();
			

			if (opcao == 1) {
				System.out.println("------Seja bem vindo ao Sistema------");
				System.out.println("(1) Cadastrar casa");
				System.out.println("(2) Cadastrar rua" );
				System.out.println("(3) Cadastrar rotas favoritas");
				System.out.println("(4) listar comercio locais");
				System.out.println("(5) Cadastrar novo usuario ");
				System.out.println("(6) Outros");
				int op = leitor.nextInt();
				leitor.nextLine();
				
				if(op == 1) {
						System.out.println("\nQual o tipo da casa(Apartamento/Casa) :");
						String tipo_casa = leitor.nextLine();
						System.out.println("Qual o numero da casa? :");
						int nume_casa = leitor.nextInt();
						leitor.nextLine();
						System.out.println("Qual a cor da casa? :");
						String cor_casa = leitor.nextLine();
						System.out.println("A casa e cercada? :");
						String cercada = leitor.nextLine();
						casa[indiceCasa] = new Casa(tipo_casa,nume_casa,cor_casa,cercada);
						indiceCasa++;

				}
				
				if(op == 2) {
					System.out.println("Qual o nome da rua? :");
					String nome = leitor.nextLine();
					System.out.println("Qual o CEP? :");
					String CEP = leitor.nextLine();
					System.out.println("A rua e pavimentada? (sim/nao) :");
					String pavimentada = leitor.nextLine();
					System.out.println("Qual o nome do bairro? :");
					String bairro = leitor.nextLine();
					rua[indiceRua] = new Rua(nome,CEP,pavimentada,bairro);
					indiceRua++;
				}
					
				if(op == 3) {
						System.out.println("Nome da rua onde mora");
						String nomerua = leitor.nextLine();
						System.out.println("Qual o CEP");
						String Cep = leitor.nextLine();
						System.out.println("Qual o nome do bairro? :");
						String Bairro = leitor.nextLine();
						rota[indiceRota] = new RotasSalvas(nomerua,Cep,Bairro);
						indiceRota++;
				}
					
				if(op == 4) {
					System.out.println("------Comercios Locais------");
					ComerciosLocais comercio = new ComerciosLocais();
					comercio.getComercio();
				}
				
				if(op == 5) {
					System.out.println("Cadastro do usuario");
					System.out.println("\nInsira seu nome de usuario");
					String nomePessoa = leitor.nextLine();
					System.out.println("Insira seu email");
					String email =  leitor.nextLine();
					System.out.println("Insira sua senha");
					String senha = leitor.nextLine();
					pessoa[indicePessoa] = new Pessoa(nomePessoa,email,senha);
					indicePessoa++;
				}
				
				if(op == 6) {
					System.out.println("------Escolha o que deseja Fazer------");
					System.out.println("(1)Listar casas cadastradas: ");
					System.out.println("(2)Procurar rua pelo CEP: ");
					System.out.println("(3)Listar rotas salvas: ");
					System.out.println("(4)Listar Usuario:");
					System.out.println("(5)Listar ruas cadastradas: ");
					int outro = leitor.nextInt();
					leitor.nextLine();
					
					if(outro == 1) {
						for(int i = 0; i < indiceCasa; i++) {
							System.out.println("Tipo da casa: "+casa[i].getTipo_casa());
							System.out.println("Numero da casa: "+casa[i].getNumero_casa());
							System.out.println("Cor da casa: "+casa[i].getCor_casa());
							System.out.println("Se e cercada: "+casa[i].getCercada());
							System.out.println("Quantidade de ruas cadastradas : "+indiceCasa);
							System.out.println("");
							continue;
						}
						
					}
					
					if(outro == 2) {
						int a = 0;
						System.out.println("Digite o CEP que deseja procurar: ");
						String cepDigitado = leitor.nextLine();
						
						for(int i = 0; i < indiceRua; i++) {
							if(rua[i].getCEP().equals(cepDigitado)) {
							System.out.println(rua[i].getNome());
							a = 1;
							}
						}
						
						if(a == 0) {
							System.out.println("CEP não encontrado");
						}
					}
					
					if(outro == 3) {
						for(int i = 0; i < indiceRota; i++) {
							System.out.println("Nome da rua: "+rota[i].getNomerua());
							System.out.println("CEP da rua: "+rota[i].getCep());
							System.out.println("Pavimentacao: "+indiceRota);
							continue;
						}
					}
					
					if(outro == 4) {
						for(int i = 0; i < indicePessoa; i++) {
							System.out.println("Nome das pessoas"+pessoa[i].getNomePessoa());
							System.out.println("E-mail da pessoa"+pessoa[i].getEmail());
							System.out.println("Senha do usuario"+pessoa[i].getSenha());
							System.out.println("Quantidade de usuario cadastrados"+indicePessoa);
							continue;
						}
					}
					
					if(outro == 5) {
						for(int i = 0; i < indiceRua; i++) {
							System.out.println("Nome da rua"+rua[i].getNome());
							System.out.println("CEP da rua"+rua[i].getCEP());
							System.out.println("E pavimentada"+rua[i].getPavimentacao());
							System.out.println("Nome do bairro"+rua[i].getBairro());
							System.out.println("Quantidades de ruas"+indiceRua);
							continue;
						}
					}
				}
			
				System.out.println("\nQuer continuar no Sistema? Digite(1)sim ou (2)Nao :");
				int resposta = leitor.nextInt();
				
				
				if(resposta == 1) {
					continue;
				}else {
					System.out.println("Programa fechou");
					break;
				}
				
			}

			if (opcao == 2) {
				System.out.println("Programa fechou");
				break;
			}

			System.out.println("Opcao invalida.");
		}
		
		
	}

}
