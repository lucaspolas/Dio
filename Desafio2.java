import java.util.Random;
public class Desafio2{
    //Algorítimo vai aleatorizar as vitorias e derrotas do herói e definir seu rank não necessitando de uma entrada manual
	static int Rank(int x, int y){//Função calculo vitorias-derrotas
		int saldo = x - y;
        return saldo;
	}
	public static void main (String[]args){
        int vit = 0, der = 0; //variaveis de vitorias e derrotas
        double pericia = 1; //pericia interfere na probabilidade de vitoria
		Random gerador = new Random(); //aleatorização de numeros
		for(int i=1;i<=150;i++){
			gerador.nextInt(1,10);//geração de numeros de 1 a 10
			if(gerador.nextInt()<=pericia || gerador.nextInt()>=9){ //condição de vitoria baseada na perícia e no número sorteado
				vit = vit + 1; //aumento do contador de vitorias
                pericia = pericia + 0.04;//aumento da pericia por vitorias
			}
			else{
				der = der + 1; //contador de derrotas
                pericia = pericia + 0.1; //aumento da pericia por derrotas
			}
		}
		String nivel="";
		if(Rank(vit,der)<=10){ //concatenação de ifs para decidir o rank do herói
            nivel = "Ferro";
        }
        else if(Rank(vit,der)>=11 && Rank(vit,der)<=20){
            nivel = "Bronze";
        }
        else if(Rank(vit,der)>=21 && Rank(vit,der)<=50){
            nivel = "Prata";
        }
        else if(Rank(vit,der)>=51 && Rank(vit,der)<=80){
            nivel = "Ouro";
        }
        else if(Rank(vit,der)>=81 && Rank(vit,der)<=90){
            nivel = "Diamante";
        }
        else if(Rank(vit,der)>=91 && Rank(vit,der)<=100){
            nivel = "Lendário";
        }
        else if(Rank(vit,der)>100){
            nivel = "Imortal";
        }
		//impressão na tela das vitorias, derrotas e rank final do herói
        System.out.println("Vitórias: "+vit);
        System.out.println("Derrotas: "+der);
		System.out.println("O Herói tem de saldo de "+Rank(vit,der)+" vitórias e está no nível: "+nivel);
	}
}