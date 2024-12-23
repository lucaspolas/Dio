
public class Testes {

    //declarando e criando uma função/método estática e publica (pode ser acessada por outras classes) com 3 parâmetros
    public static void torrar(String pao,double valor,String cliente){
        System.out.println("Torrada com "+pao);
        System.out.println("valor do pedido: R$"+valor+" reais");
        System.out.println("Cliente: "+cliente);
    }
    
    public static Double soma(double x, double y){
        return x + y;
    }

    public static String nomeCompleto(String nome){
        String primeiroN [] = nome.split(" ");
        return primeiroN [0];

    }

    public static void main (String[] args){
        torrar("Pão francês",4.99,"Lucas");//chamando função/método "torrar"
        
        System.out.println("Soma: "+soma(5,5));
        System.out.println(nomeCompleto("Lucas de Lima"));
    }


}
