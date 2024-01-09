package Grapho;

public class Aresta<T> {
    private Verter<T> go;
    private Verter<T> finish;

    public Aresta(Verter<T> go, Verter<T> finish){
        this.go = go;
        this.finish = finish;
    }

    public Verter<T> getGo(){
        return go;
    }

    public void setGo(Verter<T> go){
        this.go=go;
    }
    
    public Verter<T> getFinish(){
        return finish;
    }

    public void setFinish(Verter<T> finish){
        this.finish=finish;
    }
}
