package BubbleSortSala;
 
public class BubbleSS {
    public static void main(String[] args) {
        int arr[] = {40,80,60,20}; //custo 1
        boolean swap= false; //Custo 1
        do { 
            swap= false; // Custo N+a (valor constante de vezes que pode ser executado)
            for (int i =0; i<arr.length-1; i++) { //Custo N^2+1+a
                if (arr[i]>arr[i+1]) { //Custo N^2+a
                    int tmp= arr[i]; //Custo N^2+a
                    arr[i]=arr[i+1]; //Custo N^2+a
                    arr[i+1]=tmp; //Custo N^2+a
                    swap= true; //Custo N^2+a
                }
            }
        } while (swap); //Custo N+a+1
        for (int k=0; k<arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
