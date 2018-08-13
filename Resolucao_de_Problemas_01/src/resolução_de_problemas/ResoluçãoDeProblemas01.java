package resolução_de_problemas;

/**
 *
 * @author yasmim gouveia martns
 */
import java.util.Scanner;

public class ResoluçãoDeProblemas01 {
   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Lista l = new Lista();
        
        int opcao = 0;
        
        while(true){
            
            System.out.println("\n\n**** MENU ****");
            System.out.println("<0> Adicionar novo nome");
            System.out.println("<1> Listar nomes");
            System.out.println("<2> Sair\n");

            opcao = ler.nextInt();

            switch(opcao){
                case 0: 
                    l.inserirNome();
                    break;

                case 1:
                    l.listarNomes();
                    break;
                    
                case 2:
                    System.exit(0);
                    break;

                default: 
                    System.err.println("Opção inválida!");
            }
        }
    } 
}
