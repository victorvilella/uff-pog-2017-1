/**
 * 
 */
package poo20171;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import poo20171.trabalho2auxiliares.Cliente;

public class Trabalho2 {
    private ArrayList<Object> filaPrioritaria;
    private ArrayList<Object> filaNormal;
    private ArrayList<Object> atendidos;
    private final Scanner scanner;
    
    public Trabalho2(){
        scanner = new Scanner(System.in);
    }
    
    public void saque(int conta, double valor){
        
    }
    
    public void deposito(int conta, double valor){
        
    }
    
    public void chamaProximoCliente(){
        Cliente c = null;
        if(this.filaPrioritaria.size() >= 3){ // Chama prioridade
            
        } else {
            
        }
    }
    
    public void atendeCliente(Object cliente){
        
    }
    
    public void cadastraCliente(){
        try {
            // Cadastro do cliente
            System.out.print("Digite o núero da conta corrente do cliente: ");
            int cc = this.scanner.nextInt();
            System.out.print("Digite a idade do cliente: ");
            int i = this.scanner.nextInt();
            System.out.print("O cliente é de atendimento prioritário (0 - Não, 1 - Sim): ");
            boolean p = this.scanner.nextBoolean();
            Cliente c = new Cliente(cc, i, p);
            
            // Inserção na fila correta
            if(p){
                this.filaPrioritaria.add(c);
            } else {
                this.filaNormal.add(c);
            }
            
            //Sucesso
            System.out.println("Cliente criado com sucesso.");
        } catch (Exception ex) {
            Logger.getLogger(Trabalho2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
