package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {3,7,2,1,5}; //custo 1

        for (int i=1; i<array.length; i++) { //Custo N
            int tmp=array[i]; //variavel que vai ser ordenada Custo N-1
            int j; //Custo N-1
            for (j=i; j>0 && array[j-1]>tmp; j--) { //percorre o array e desloca o número pra trás CustoN^2+1
                array[j]=array[j-1]; //Custo N^2
            }
            array[j]=tmp; //Custo N-1
        }
        for (int k=0; k<array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
//Custo total T(N)= O(N^2)
//char a='a'
//(int) a