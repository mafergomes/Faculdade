import java.util.Scanner;

public class TrabalhoNakahata{
    
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int processos=0;
        int recursos=0;
        int qtdeSolicitada=0;
        int recursoSolicitado=0;
        int processoSolicidado=0;
        int menu=0;
        String recursosInformados="";
        String vetorRecursosInformadosString[];
        
        
        System.out.print("Informe a quantidade de processos: ");
        processos = s.nextInt();
        System.out.println();

        System.out.print("Informe a quantidade de recursos: ");
        recursos = s.nextInt();
        int recursosVetor = recursos;
        recursos++;
        System.out.println();

        int recursosAlocados[][] = new int[processos][recursos];
        int recursosNecessarios[][] = new int[processos][recursos];
        int recursosExistentes[] = new int[recursosVetor];
        int recursosPossuidos[] = new int[recursosVetor];
        int recursosDiponiveis[] = new int[recursosVetor];
        int vetorRecursosAindaDisponiveis[] = new int[recursosVetor];
        int vetorRecursosInformadosInt[] = new int[recursosVetor];

        for(int i=0; i<recursos; i++) {
            System.out.println("Informe a quantidade do vetor de recursos possuidos para o " + i + "º processo: ");
            if (i <= 0) {
                s.nextLine(); 
            }
            recursosInformados = s.nextLine();
            vetorRecursosInformadosString = recursosInformados.split(",");
            for(int j=0; j<vetorRecursosInformadosString.length; j++) {
                vetorRecursosInformadosInt[j]= Integer.parseInt(vetorRecursosInformadosString[j]);
            }
            recursosAlocados[i][0]=i;
            for(int k=1; k<recursos; k++){
        		recursosAlocados[i][k]= vetorRecursosInformadosInt[k-1];
        	}
        }

        System.out.println("Matriz de recursos alocados: ");
        ImprimeMatriz(recursosAlocados, processos, recursos);
        System.out.println();

        for(int i=0; i<recursos; i++) {
            System.out.println("Informe a quantidade do vetor de recursos ainda necessarios para o " + i + "º processo: ");
            if (i < 0) {
                s.nextLine();
            }
            recursosInformados = s.nextLine();
            vetorRecursosInformadosString = recursosInformados.split(",");
            for(int j=0; j<vetorRecursosInformadosString.length; j++) {
                vetorRecursosInformadosInt[j]= Integer.parseInt(vetorRecursosInformadosString[j]);
            }
            recursosNecessarios[i][0]=i;
            for(int k=1; k<recursos; k++){
        		recursosNecessarios[i][k]= vetorRecursosInformadosInt[k-1];
        	}
        }

        System.out.println("Matriz de recursos ainda necessarios: ");
        ImprimeMatriz(recursosNecessarios, processos, recursos);
        System.out.println();

        System.out.println("Informe o vetor de recursos existentes: ");        
        recursosInformados = s.nextLine();
        vetorRecursosInformadosString = recursosInformados.split(",");
        for(int i=0; i<vetorRecursosInformadosString.length; i++) {
            recursosExistentes[i]= Integer.parseInt(vetorRecursosInformadosString[i]);
        }

        System.out.println("Vetor dos recursos existentes: ");
        ImprimeVetor(recursosExistentes);
        System.out.println();

        System.out.println("Vetor dos recursos possuidos: ");
        for(int i=1; i<processos; i++){
        	for(int j=0; j<recursos; j++){
        		recursosPossuidos[i-1] = recursosPossuidos[i-1]+recursosAlocados[j][i];
        	}
        }
        ImprimeVetor(recursosPossuidos);
        System.out.println();

        System.out.println("Vetor dos recursos ainda necessários: ");
        for(int i=1; i<processos; i++){
        	for(int j=0; j<recursos; j++){
        		vetorRecursosAindaDisponiveis[i-1] = vetorRecursosAindaDisponiveis[i-1]+recursosNecessarios[j][i];
        	}
        }
        ImprimeVetor(vetorRecursosAindaDisponiveis);
        System.out.println();

        System.out.println("Vetor dos recursos disponíveis: ");
        for(int i=0; i<recursosDiponiveis.length; i++){
            recursosDiponiveis[i]= recursosExistentes[i]-recursosPossuidos[i];
        }
        ImprimeVetor(recursosDiponiveis);
        System.out.println();

        while(menu!=2){
            System.out.println("O que deseja fazer?");
            System.out.println("1- Solicitar recurso.");
            System.out.println("2- Sair.");
            menu=s.nextInt();
            if (menu==1) {
                System.out.println("Digite a quantidade solicitada: ");
                qtdeSolicitada=s.nextInt();
                System.out.println("Digite o recurso solicitado: ");
                recursoSolicitado=s.nextInt();
                System.out.println("Digite o processo solicitado: ");
                processoSolicidado=s.nextInt();
                if(recursoSolicitado<=recursos && processoSolicidado<=processos) {
                    if(recursosPossuidos[recursoSolicitado-1]+vetorRecursosAindaDisponiveis[recursoSolicitado-1]+qtdeSolicitada<=recursosExistentes[recursoSolicitado-1]){
                        System.out.println("Recurso solicitado pelo " + processoSolicidado + "º processo disponivel");
                        System.out.println("Verificando se o estado resultante é seguro");
                        System.out.println("Recurso solicitado pelo " + processoSolicidado + "º processo pode ser alocado");
                        System.out.println("Esse é um estado seguro!");
                        System.out.println();
                        System.out.println("Vetor dos recursos existentes: ");
                        ImprimeVetor(recursosExistentes);
                        System.out.println();
                        recursosPossuidos[recursoSolicitado-1]++;
                        System.out.println("Vetor dos recursos possuidos: ");
                        ImprimeVetor(recursosPossuidos);
                        System.out.println();
                        recursosDiponiveis[recursoSolicitado-1]--;
                        System.out.println("Vetor dos recursos disponíveis: ");
                        ImprimeVetor(recursosDiponiveis);
                        System.out.println();
                    } else {
                        System.out.println("Recurso solicitado pelo " + processoSolicidado + "º processo disponivel");
                        System.out.println("Verificando se o estado resultante é seguro");
                        System.out.println("Recurso solicitado pelo " + processoSolicidado + "º processo não pode ser alocado");
                        System.out.println("Esse é um estado não seguro e pode ocasionar um deadlock!");    
                    }
                } else System.out.println("Quantidade de recursos ou processos incorreta!");
            }
        }

        System.out.println("Fim do programa.");
        s.close();
    }

    public static void ImprimeMatriz(int matrizUtilizada[][], int processos, int recursos) {
        for(int i=0; i<processos; i++){
        	for(int j=0; j<recursos; j++){
        		System.out.print(" "+ matrizUtilizada[i][j] + " ");
        	}
        	System.out.println();
        }
    }

    public static void ImprimeVetor(int vetorUtilizado[]) {
        for(int i=0; i<vetorUtilizado.length; i++){
            System.out.print(vetorUtilizado[i] + " ");
        }
    }
}