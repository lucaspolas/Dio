public class desafioDio2{
	String nome;
	int idade;
	int clas;
	String [] tipo = {"mago","guerreiro","monge","ninja"};
	
	public desafioDio2(String nome,int idade,int clas){
		this.nome = nome;
		this.idade = idade;
		this.clas = clas;
	}

	String [] tipoatq = {"magia","espada","artes marcias","shuriken"};

	public void ataque(){
		switch(clas){
		case 0:
			System.out.println("O personagem "+nome+" atacou usando "+tipoatq[0]);
			break;
		case 1:
			System.out.println("O personagem "+nome+" atacou usando "+tipoatq[1]);
			break;
		case 2:
			System.out.println("O personagem "+nome+" atacou usando "+tipoatq[2]);
			break;
		case 3:
			System.out.println("O personagem "+nome+" atacou usando "+tipoatq[3]);
			break;
		default:
			System.out.println("O personagem "+nome+" atacou usando uma arma desconhecida");
		}
	}

	public void info(){
		System.out.println("Nome do personagem: "+nome);
		System.out.println("Idade do personagem: "+idade);
		
		switch(clas){
		case 0:
			System.out.println("Classe do personagem: "+tipo[0]);
			System.out.println("Tipo de arma: "+tipoatq[0]);
			break;
		case 1:
			System.out.println("Classe do personagem: "+tipo[1]);
			System.out.println("Tipo de arma: "+tipoatq[1]);
			break;
		case 2:
			System.out.println("Classe do personagem: "+tipo[2]);
			System.out.println("Tipo de arma: "+tipoatq[2]);
			break;
		case 3:
			System.out.println("Classe do personagem: "+tipo[3]);
			System.out.println("Tipo de arma: "+tipoatq[3]);
			break;
		default:
			System.out.println("Classe do personagem: Desconhecida");
			System.out.println("Tipo de arma: Desconhecida");
		}
	}

	public static void main(String[] args) {
		
		desafioDio2 Personagem = new desafioDio2 ("Lucas",28,2);

		Personagem.info();
		Personagem.ataque();		

	}

}
