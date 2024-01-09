package CountSort;

public class CountSort {
    public static void main(String[] args) {
        int array[] = {0,-5,-1,4,5}; //custo 1
        int maior=array[0];
        int menor=array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>maior) {
                maior= array[i];
            }
            if (array[i]<menor) {
                menor= array[i];
            }
        }
        int tamanho=maior-menor+1;
        int count[] = new int [tamanho];
        for (int i=0; i<array.length; i++) {
            count[array[i]-menor]++;
            System.out.println(count[i]);
        }
        int out[]=new int[array.length];
        int c=0;
        for (int i=0; i<count.length; i++) {
            while (count[i]>0) {
                out[c]=i+menor;
                count[i]--;
                c++;
            }
        }
        for (int i =0; i< array.length;i++){
            array[i]=out[i];
        }
        for (int k=0; k<array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
