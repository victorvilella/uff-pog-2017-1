/**
 * Victor Barbosa Vilella (213083106)
 * Matheus de Souza Carneiro (213083xxx)
 * Histórico de revisões disponível em https://github.com/victorvilella/uff-pog-2017-1
 */

package poo20171;
import java.util.Scanner;

/**
 *
 * @author programadores
 */
public class Poo20171 {
    
    private static Scanner scanner = null;
    
    /**
     * 
     */
    public void Poo20171(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        imprimeCreditos(1);
    }
    
    /**
     * Imprime os créditos do projeto
     * @param menuTrabalho 
     */
    protected static void imprimeCreditos(int menuTrabalho){
        System.out.println(" UFF - UNIVERSIDADE FEDERAL FLUMINENSE");
        System.out.println(" IC - INSTITUTO DE COMPUTAÇÃO");
        System.out.println(" TRABALHO DA DISCIPLINA \"PROGRAMAÇÃO ORIENTADA A OBJETOS\"");
        System.out.println(" ALUNOS: MATHEUS DE SOUZA CARNEIRO (213083xxx)");
        System.out.println("         VICTOR BARBOSA VILELLA (213083106)");
        System.out.println("");
        switch(menuTrabalho){
            case 1:
                menuPrincipalTrabalho01();
                break;
            default:
                System.err.println("Trabalho não implementado");
                break;
        }
    }
    
    /**
     * Imprime o menu principal do trabalho 1
     * @return 
     */
    protected static int menuPrincipalTrabalho01(){
        int opcao       = -1;
        String opcao_digitada = "";
        while(opcao != 9){
            System.out.println("Menu do trabalho 1");
            System.out.println("0 - Carregar a lista de nomes de pessoas");
            System.out.println("1 - Inserir um nome de pessoa na lista");
            System.out.println("2 - Exibir os nomes das pessoas na lista");
            System.out.println("3 - Gravar lista de nomes de pessoas");
            System.out.println("9 - Fim");
            System.out.println("");
            System.out.print("Digite a opção desejada: ");
            opcao_digitada  = scanner.nextLine();
            // Tratando o possível erro do usuário teclar uma opção não numeral
            try{
                opcao       = Integer.parseInt(opcao_digitada);
            } catch(NumberFormatException e){
                System.out.println("Você digitou uma opção não numérica: '" + e.getMessage() + "'");
                opcao       = -1;
            }
        }
        return opcao;
    }
    
}
