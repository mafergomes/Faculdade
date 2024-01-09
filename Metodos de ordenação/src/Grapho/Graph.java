package Grapho;

import java.util.ArrayList;

public class Graph<T> {
    private ArrayList<Verter<T>> verter;
    private ArrayList<Aresta<T>> aresta;

    public Graph() {
        this.verter = new ArrayList<Verter<T>>();
        this.aresta = new ArrayList<Aresta<T>>();
    }

    public void addVerter(T dado) {
        Verter<T> newVerter = new Verter<T>(dado);
        this.verter.add(newVerter);
    }

    public void addAresta(T dadoGo, T dadoFinish) {
        Verter<T> go = this.getVerter(dadoGo);
        Verter<T> finish = this.getVerter(dadoFinish);
        Aresta<T> aresta = new Aresta<T>(go, finish);
        go.addArestaSaida(aresta);
        finish.addArestaEntrada(aresta);
        this.aresta.add(aresta);
    }

    public Verter<T> getVerter(T dado) {
        Verter<T> verter = null;
        for (int i = 0; i < this.verter.size(); i++) {
            if (this.verter.get(i).getDado().equals(dado)) {
                verter = this.verter.get(i);
                break;
            }
        }
        return verter;
    }

    // busca em largura
    public void buscaEmLargura() {
        ArrayList<Verter<T>> marcados = new ArrayList<Verter<T>>();
        ArrayList<Verter<T>> fila = new ArrayList<Verter<T>>();
        Verter<T> atual = this.verter.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Verter<T> visitado = fila.get(0);
            for (int i = 0; i < visitado.getSaida().size(); i++) {
                Verter<T> proximo = visitado.getSaida().get(i).getFinish();
                if (!marcados.contains(proximo)) { // se o verter ainda nao foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }

    // busca em profundidade
    public void buscaEmProfundidade() {
        ArrayList<Verter<T>> percorridos = new ArrayList<Verter<T>>();
        ArrayList<Verter<T>> fila = new ArrayList<Verter<T>>();
        Verter<T> atual = this.verter.get(0);
        percorridos.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        

        /*
                        percArv.add(raiz);  

                visitados[raiz] = true;  

                int i;  
                for (i = 0; i < grafo.numV; i++) {  
                    if (grafo.matrizAdj[raiz][i] != 0 && visitados[i] == false) {  
                        buscaProfundidade(grafo, i); 
                        percArv.add(raiz); 
                    }  
                } 
         */


    }

}
