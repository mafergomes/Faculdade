package EstacionamentoStrategy;

public class EstacionamentoStrategy {

static double valorBaseHora = 5;

static void calculoTarifaEstacionamento(int tipo, int horas) {
    if (tipo==1) { //Horista
        System.out.println("Tarifa por hora: " + valorBaseHora);
    }
    else if (tipo==2) { //Diaria
        double valorFinal = (valorBaseHora*24)*0.5;
        System.out.println("Tarifa por dia: " + valorFinal);
    }
    else if (tipo==3) { //Mensalista
        double valorFinal = (valorBaseHora*24)*30*0.2;
        System.out.println("Tarifa por mês: " + valorFinal);
    }
    else if (tipo==4) { //Tolerancia de horas
        
    }
}

public static void main(String[] args) {
    calculoTarifaEstacionamento(3,2);
}

}