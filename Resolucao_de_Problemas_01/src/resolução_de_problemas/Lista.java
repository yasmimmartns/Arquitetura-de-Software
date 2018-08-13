package resolução_de_problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    
    private ArrayList<String> lista = new ArrayList();
    private Scanner ler = new Scanner(System.in);
    
    void inserirNome(){
        System.out.println("\nInsira um nome: ");
        String nome = ler.nextLine();
      
        lista.add(nome);
        System.out.println("Nome: " + nome + " inserido com sucesso!");
    }
    
    void listarNomes(){
        int i;
        int n = lista.size();
        
        if(n == 0){
            System.err.println("Lista vazia!");
        }
        else{
            System.out.println("\nLista de nomes: \n");
            
            for (i = 0; i < n; i++) {
                System.out.printf("%d - %s\n", i, lista.get(i));
            }
        }       
    }    
}
