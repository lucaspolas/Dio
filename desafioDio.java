public class desafioDio{
	public static void main (String[] args){
		
        int xp = 5465;
        String heroi = "Dio";
        String nivel = "";
        String rank [] = {"Ferro","Bronze","Prata","Ouro","Platina","Ascendente","Imortal","Radiante"};
		
        for(int i=0;i<8;i++){
            if(xp<=1000){
                nivel = rank[0]; 
            }
            else if(xp>=1001&&xp<=2000){
                nivel = rank[1];     
            }
            else if(xp>=2001&&xp<=5000){
                nivel = rank[2];                
            }
            else if(xp>=5001&&xp<=7000){
                nivel = rank[3];                
            }
            if(xp>=7001&&xp<=8000){
                nivel = rank[4];                
            }
            else if(xp>=8001&&xp<=9000){
                nivel = rank[5];                
            }
            else if(xp>=9001&&xp<=10000){
                nivel = rank[6];                
            }
            else if(xp>=10001){
                nivel = rank[7];                
            }

        }

        System.out.println("O Herói "+heroi+" está no nível: "+nivel);
        
	}
}