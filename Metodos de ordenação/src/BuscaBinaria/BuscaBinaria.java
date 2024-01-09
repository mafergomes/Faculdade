package BuscaBinaria; // obrigatoriamente ordenado e vai buscando pelos meios

public class BuscaBinaria {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6}; //custo 1
        int v=4; //custo 1
        int inicio=0; //custo 1
        int termino= arr.length-1; //a ultima posição do array custo 1
        while (inicio<=termino) { //custo log2(n)+1
            int meio = (inicio+termino)/2; //custo lo2(N)
            if (arr[meio]==v) { //custo log2(N)
                //custo 1
            } else {
                if (v<arr[meio]) { //custo log2(N)/2
                    termino=meio-1; //custo log2(N)/2
                } else {
                    inicio = meio+1; //custo log2(N)/2
                }
            }

        }
    }
    /* 
    public static int binary_search(int arr[], x, i, +) {
        if (i>t) {
            return -1;
        } else {
            int m=(i+t)/2;
            if (arr[m]==x) {
                return m;
            } else if (x>arr[m]) {
                return binary_search(arr, x, m+1, t);
            } else if (x<arrr[m]) {
                return t;
            }
        }
    }
    //Custo T(N) caso 1= O(1) acontece se o valor estiver no meio do vetor, caso 2= T(N/2)+1 se estiver do meio pra frente
    */
}

