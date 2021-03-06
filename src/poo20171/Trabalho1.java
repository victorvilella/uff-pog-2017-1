/**
 * Victor Barbosa Vilella
 * Matheus de Souza Carneiro
 * Histórico de versões disponível em https://github.com/victorvilella/uff-pog-2017-1
 */

package poo20171;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Trabalho1 {
    /* Lista de nomes lidos de pessoas.txt */
    private ArrayList lista;
    private Scanner scanner;
    
    /**
     * Construtor da classe
     * @throws Exception 
     */
    public Trabalho1() throws Exception{
        this.InicializarArrayList();
        this.InicializarScanner();
    }
    
    /**
     * Inicializa o objeto de scanner
     * @throws Exception 
     */
    private void InicializarScanner()  throws Exception{
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Inicializa o objeto de lista
     * @throws Exception 
     */
    private void InicializarArrayList() throws Exception{
        this.lista  = new ArrayList<>();
    }
    
    /**
     * Carrega os nomes presentes em pessoas.txt
     * @throws Exception 
     */
    public void Carregar_nome() throws Exception{
        String filename = "pessoas.txt";
        BufferedReader r = new BufferedReader(new FileReader(filename));
        boolean x       = true;
        String buffer;
        System.out.println("Lendo o arquivo '"+filename+"'");
        while(x){
            buffer      = r.readLine();
            if(buffer != null){
                System.out.println("Carregando o nome '" + buffer + "'");
                this.lista.add(buffer);
            } else {
                x       = false;
            }
        }
        System.out.println("Leitura do arquivo '"+filename+"' finalizada.");
    }
    
    /**
     * Lê o nome do teclado
     * @throws Exception 
     */
    public void Ler_nome() throws Exception{
        String nome;
        do{
            System.out.print("Digite o nome da pessoa: ");
            nome = this.scanner.nextLine();    
        } while(nome.trim().equals("")); // Regex para aceitar apenas um input de letras
        this.lista.add(this.lista.size(), nome);
        System.out.println("\nNome '" + nome + "' adicionado");
    }
    
    /**
     * Mostra a lista de nomes em memória
     * @throws Exception 
     */
    public void Exibir_nome() throws Exception{
        int i = 0;
        System.out.println("Imprimindo a lista carregada: ");
        Object[] aux    = this.lista.toArray();
        for(i = 0; i < aux.length; i++){
            System.out.println(aux[i]);
        }
        System.out.println("Impressão finalizada");
    }
    
    /**
     * Grava a lista em pessoas.txt
     * @throws Exception 
     */
    public void Gravar_lista()  throws Exception{
        String filename = "pessoas.txt";
        System.out.println("Iniciando processo de gravação");
        BufferedWriter f = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < this.lista.size(); i++){
            System.out.println("Escrevendo o nome '" + this.lista.get(i) + "");
            f.write((String) this.lista.get(i));
            f.newLine();
        }
        f.close();
        System.out.println("Gravação finalizada");
    }
}
