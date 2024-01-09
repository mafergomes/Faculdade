package BubbleSort;

public class BubbleSort {
    
    public static void main(String[] args) {
    
        int array[] = {9,6,4,3,2,1}; //custo 1
        for(int i=0; i<array.length-1; i++) { //Custo N
            boolean ordem = true; //Custo N-1
            for(int j=0; j<array.length-1; j++) { //Custo N^2+1
                if(array[j]>array[j+1]) { //Custo N^2
                int tmp= array[j]; //Custo N^2
                array[j] = array[j + 1]; //Custo N^2
                array[j + 1] = tmp; //Custo N^2
                ordem = false; //Custo N^2
                }
            }
            if(ordem==true) { //Custo N-1
                break; //Custo N-1
            }
        }

        for (int i=0; i<array.length; i++) { //Custo N
            System.out.println(array[i]); //Custo N-1
        }
    }
}
