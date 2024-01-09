import java.util.*;
class App{
    public static Scanner s = new Scanner(System.in);

    public static int Menu(){
        int opt = 0;
        while(opt!=1&&opt!=2){//menu peincipal do jogo
        System.out.println("----------------------------Jogo do Anagrama----------------------------");
        System.out.println("O jogo é simples você tem que acertar o anagrama em menos de 5 tentativas");
        System.out.println("1--Jogar");
        System.out.println("2--Sair");
        opt = s.nextInt();
        if(opt!=1&&opt!=2){
            System.out.println("Opção Invalida");
        }
        }
        return opt;
    }

    public static boolean Palpite(Jogo j,String s){//retorna true se o palpite estiver correto

        if(j.getString().equalsIgnoreCase(s)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean gameOver(boolean p, int v){//Retorna true se o jogador perder
        if(p==false&&v<1){
            return true;
        }else{
            return false;
        }
    }
	public static void main (String[] args) throws Exception{
        int opt=1;
        while(opt==1){//metodo de repetição permite ao jogador reiniciar o game caso queira
            opt = Menu();
            if(opt==1){
                Jogo j = new Jogo();
                System.out.println("------"+j.getScrambledString()+"------");
                String palpite = "";
                int vidas=5;
                s.nextLine(); //gasta um scanner para evitar erro de leitura durante a fase de palpites
                while(!gameOver(Palpite(j,palpite),vidas)){
                    System.out.println("Dê o seu palpite, você tem "+vidas+" chances: ");
                    palpite = s.nextLine();
                    if(!Palpite(j,palpite)){
                        System.out.println("Resposta incorreta");
                        vidas--;
                    }else{
                        System.out.println("Resposta Correta");
                        break;
                    }
                }
                System.out.println("A palavra era: "+j.getString());
            }
        }
	}
}
