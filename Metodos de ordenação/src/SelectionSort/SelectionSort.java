package SelectionSort;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {3,7,2,1,5}; //custo 1
        for (int i = 0; i<array.length; i++) { //Custo N
            int p=i; //Custo N-1
            for (int j=i+1; j<array.length; j++) { //Custo N^2+1
                if (array[j]<array[p]) { //Custo N^2
                    p=j; // Custo N^2
                }
            }
            int tmp= array[i]; //Custo N-1
            array[i]= array[p]; //Custo N-1
            array[p]= tmp; //Custo N-1
        }
        for (int k=0; k<array.length; k++) {
            System.out.println(array[k]);
        }
    }
    
}
//Custo total T(N)= 3N^2+5n-3