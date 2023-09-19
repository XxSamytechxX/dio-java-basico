import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
    
     }
     
     static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados<5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" +  candidato + "Solicitou este valor de salario" + salarioPretendido);
            if( salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
     }

     static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

     static void analisarCandidato (double salarioPretendido){
        Double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioBase==salarioPretendido)
     System.out.println ("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
     else {
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
     }
    }
}
