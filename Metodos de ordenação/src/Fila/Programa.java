package Fila;

public class Programa {
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.adicionar("Jão");
        fila.adicionar("Zé");
        fila.adicionar("Juca");
        fila.adicionar("Maria");
        fila.adicionar("Ano");
        
        System.out.println("Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());
        
    }
}
