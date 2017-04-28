/**
 * Victor Barbosa Vilella
 * Matheus de Souza Carneiro
 * Histórico de versões disponível em https://github.com/victorvilella/uff-pog-2017-1
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
        try {
            String opcao_digitada;
            Trabalho1   t;
            t = new Trabalho1();
            while(opcao != 9){
                System.out.println("Menu do trabalho 1");
                System.out.println("0 - Carregar a lista de nomes de pessoas");
                System.out.println("1 - Inserir um nome de pessoa na lista"); // Feito
                System.out.println("2 - Exibir os nomes das pessoas na lista"); // Feito
                System.out.println("3 - Gravar lista de nomes de pessoas");
                System.out.println("9 - Fim");
                System.out.println("");
                System.out.print("Digite a opção desejada: ");
                opcao_digitada  = scanner.nextLine();
                    // Tratando o possível erro do usuário teclar uma opção não numeral
                    opcao       = Integer.parseInt(opcao_digitada);
                    // Fazendo uma ação de acordo com a opção escolhida
                    switch(opcao){
                        case 0:
                            t.Carregar_nome();
                            break;
                        case 1:
                            t.Ler_nome();
                            break;
                        case 2:
                            t.Exibir_nome();
                            break;
                        case 3:
                            t.Gravar_lista();
                            break;
                        default:
                            System.out.println("fim");
                            break;
                    }
            }
        } catch(NumberFormatException e){
            System.out.println("Você digitou uma opção não numérica: '" + e.getMessage() + "'");
            opcao       = -1;
        } catch (Exception ex) {
            System.out.println("Erro: '" + ex.getMessage() + "'");
            opcao       = -1;
        }
        return opcao;
    }
    
}
