import java.util.*;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static class EspacoMemoria{

        public boolean livre;
        public int tamanhoMemoria;

        public EspacoMemoria(boolean livre, int tamanhoMemoria){
            this.livre = livre;
            this.tamanhoMemoria = tamanhoMemoria;
        }
    }

    public static class Memoria{

        public ArrayList<EspacoMemoria> listaDeEspacoMemorias = new ArrayList<EspacoMemoria>();

        public Memoria(){

        }

        public void adicionarMemoriaFim(EspacoMemoria espacoMemoria){ //adiciona um espaço de memoria no final da lista
            listaDeEspacoMemorias.add(espacoMemoria);
        }

        public void adicionarMemoriaComeco(EspacoMemoria espacoMemoria){ //adiciona um espaço de memoria no começo da lista
            listaDeEspacoMemorias.add(0, espacoMemoria); //o parametro 0 indica o começo da lista
        }

        public void adicionarMemoriaIndice(EspacoMemoria espacoMemoria, int indice){ //adiciona um espaço de memoria em um lugar especifico
            listaDeEspacoMemorias.add(indice, espacoMemoria);
        }

    }

    public static void main(String[] args) {
        int opcao;
        boolean swap;

        System.out.print("Digite a quantidade de memória: ");
        int tamanhoDaMemoriaGeral = s.nextInt();

        System.out.print("Digite 1 para o primeiro ajuste, 2 para o melhor ajuste e 3 para o pior ajuste: ");
        int ajuste = s.nextInt();
        System.out.println();

        switch (ajuste) {
            case 1:
                System.out.println("Primeiro caso selecionado");
                System.out.print("Digite 1 para Alocação, 2 para Desalocação ou 3 para sair: ");
                opcao=s.nextInt();
                
                while(swap){
                    firstFit(tamanhoDaMemoriaGeral);
                }
                break;
            case 2:
                System.out.println("Melhor caso selecionado");
                System.out.print("Digite 1 para Alocação, 2 para Desalocação ou 3 para sair: ");
                opcao=s.nextInt();
                
                while(swap){
                    bestFit();
                }
                break;
            case 3:
                System.out.println("Pior caso selecionado");
                System.out.print("Digite 1 para Alocação, 2 para Desalocação ou 3 para sair: ");
                opcao=s.nextInt();
                System.out.print("Digite a quantidade de memória: ");
                qtd = s.nextInt();
                while(swap){
                    worstFit();
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        firstFit(tamanhoDaMemoriaGeral);
    }

    public static void firstFit(int tamanhoDaMemoriaGeral){

        Memoria memoriaGeral = new Memoria();

        EspacoMemoria espacoMemoria = new EspacoMemoria(true, tamanhoDaMemoriaGeral);

        memoriaGeral.adicionarMemoriaFim(espacoMemoria);

    }
}

/*
 * bestfit usa a logica do exercicio primeiro
 * 
 * 
 * 
 * 
 * 
 * 
 */
