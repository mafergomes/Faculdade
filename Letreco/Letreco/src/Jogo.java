import java.io.*;
import java.util.*;
public class Jogo {
    private String s1="";
    private String s2="";

    public String getString(){
        return this.s1;
    }

    public String getScrambledString(){
        return this.s2;
    }
    public Jogo()throws java.lang.Exception{
        Random random = new Random();
        
        File arquivo = new File("caminho para um arquivo txt com palavras");
        BufferedReader br = new BufferedReader(new FileReader(arquivo));

        int cont =0;
        String palavra ="";
        int numero = random.nextInt(100);
        while(br.ready()){
            palavra = br.readLine();
            cont++;
            if(cont == numero){
                break;
            }
        }

        List<Character> Letras = new ArrayList<Character>();
        for(int i=0;i<palavra.length();i++) {
            Letras.add(palavra.charAt(i));
        }

        Collections.shuffle(Letras);
        StringBuilder sb = new StringBuilder(palavra);
        cont = 0;
        for(Character item:Letras){
            sb.setCharAt(cont,item);
            cont++;
        }
        String s2 = sb.toString();
        this.s1=palavra;
        this.s2=s2;
        br.close();
    }
}
