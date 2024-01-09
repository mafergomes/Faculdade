package BuscaLinear;

public class BuscaLinear {
    public static void main(String[] args) {
        int arr[]= {3,7,2,1,4,7}; //custo 1
        int  u =3; //custo 1
        for (int i=0; i <arr.length; i ++) { //custo N+1
            if (arr[i]==u) { //custo N
                System.out.println("Posição do número no array: "+ i); //Custo N
                System.out.println("Número: "+ arr[i]); //Custo N
            }
        }
    }
}