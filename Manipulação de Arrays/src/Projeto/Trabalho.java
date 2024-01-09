package Projeto;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palavra = s.nextLine();
        String p = palavra;
        String[] array = new String [p.length()];
        char[] letras= null;
        String sufixo= "";
        letras= p.toCharArray();
        int count1=1;

        //Array com sufixos
        for (int i=0; i<array.length; i++) {
            array[i]= p;
            while (count1<letras.length) {
                sufixo+=letras[count1];
                count1++;
            }
            count1=count1-sufixo.length();
            p=sufixo;
            sufixo= "";
            count1++;
        }
        System.out.println("Array com sufixos: "+Arrays.toString(array));

        //Ordenação do array
        String tmp;
        boolean swap= false; 
        do { 
            swap= false;
            for (int i=0; i<array.length-1; i++) { 
                if (array[i].compareToIgnoreCase(array[i+1])>0) { 
                    tmp= array[i]; 
                    array[i]=array[i+1]; 
                    array[i+1]=tmp; 
                    swap= true;
                }
            }
        } while (swap);
        System.out.println("Array com sufixos em ordem alfabética: "+Arrays.toString(array));

        //Contagem de repetições das letras
        int arrayNum[] = new int [palavra.length()];
        for (int i=0; i<array.length-1; i++) {
            int count2=0;
            int aux=0;
            while (count2<array[i].length() && count2<array[i+1].length()) {
                int a= Character.getNumericValue(array[i].charAt(count2));
                int b= Character.getNumericValue(array[i+1].charAt(count2));
                if (a!=b) {
                    break;
                }
                aux++;
                count2++;
            }
            arrayNum[i]=aux;    
        }
        System.out.println("Quantidade de repetições de prefixos: "+Arrays.toString(arrayNum));
        
        int maior=0;
        for (int i=0; i<arrayNum.length; i++) {
            if (arrayNum[i]>maior) {
                maior=arrayNum[i];
            }
        }
        
        ArrayList <String> saida = new ArrayList<String>();
        
        for (int i=0; i<arrayNum.length; i++) {
            if (arrayNum[i]==maior) {
                StringBuilder nome = new StringBuilder(array[i]);
                while (nome.length()>maior) {
                    nome.deleteCharAt(maior);
                }
                String palavra2 = nome.toString();
                saida.add(palavra2);
            }
        }
        for(String item:saida){
            System.out.println("Prefixo com mais repetições: "+item);
        }
        s.close();
    }    
}