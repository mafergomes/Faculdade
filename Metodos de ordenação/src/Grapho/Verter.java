package Grapho;

import java.util.ArrayList;

public class Verter<T> {
    private T dado;
    private ArrayList<Aresta<T>> arestaEntrada;
    private ArrayList<Aresta<T>> arestaSaida;

    public Verter(T valor){
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<T>>();
        this.arestaSaida = new ArrayList<Aresta<T>>();
    }
    //dado
    public T getDado(){
        return dado;
    }

    public void setDado(T dado){
        this.dado=dado;
    }

    //add aresta de entrada 
    public void addArestaEntrada (Aresta<T> aresta){
        this.arestaEntrada.add(aresta);
    }
    //add aresta de Saida
    public void addArestaSaida (Aresta<T> aresta){
        this.arestaSaida.add(aresta);
    }

    //aresta de entrada
    public ArrayList<Aresta<T>> getEntrada(){
        return arestaEntrada;
    }

    //aresta de Saida
    public ArrayList<Aresta<T>> getSaida(){
        return arestaSaida;
    }

}
