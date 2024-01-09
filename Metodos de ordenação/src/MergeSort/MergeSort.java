package MergeSort;

public class MergeSort {
    public static void main(String[]args) {
        int array[] = {3,7,2,1,5}; //custo 1
        int m;
        int i=0;
        int t=array.length;
        m=i+(t-i)/2; // para calcular o meio do array
        int x=i;
        int y=m;
        int aux[]=new int [t-i+1];
        int c=0;
        while (x<m && y<=t) { //Custo N/2
            if (array[x]<array[t]) {
                aux[c]=array[x];
                x++;
            } else {
                aux[c]=array[y];
                y++;
            }
            c++;
        }
        for ( ;x<m;x++) { //Custo N
            aux[c]=array[x];
            c++;
        }
        for ( ;y<m;y++) { //Custo N
            aux[c]=array[y];
            c++;
        }
        for(c=0; c<aux.length; c++) { //Custo N
            array[i+c]=aux[c];
        }

        for (int k=0; k<array.length; k++) {
            System.out.println(array[k]);
        }
    }

}
