package poo20171.trabalho2auxiliares;

import java.util.ArrayList;

/**
 * Classe que representa a instância de um cliente
 * @author programadores
 */
public class Cliente {
    private final int conta;
    private final int idade;
    private double saldo;
    private ArrayList<Object> extrato;
    private final boolean prioridade;
    
    /**
     * Inicializa o objeto com informações de conta corrente e idade
     * @param identificador
     * @param idade
     * @param prioridade
     * @throws Exception 
     */
    public Cliente(int identificador, int idade, boolean prioridade) throws Exception{
        conta = identificador;
        this.idade = idade;
        this.prioridade = prioridade;
        validaDadosCadastrais();
    }
    
    /**
     * Realiza o depósito na conta
     * @param valor
     * @throws Exception 
     */
    public void deposito(double valor) throws Exception{
        if(valor < 0){
            throw new Exception("O valor depositado não pode ser menor que zero");
        }
        saldo += valor;
        this.extrato.add(this.extrato.size(), valor);
    }
    
    /**
     * Realiza o saque da conta
     * @param valor
     * @throws Exception 
     */
    public void saque(double valor) throws Exception{
        if(valor < 0){
            throw new Exception("O valor a ser sacado não pode ser menor que zero");
        }
        saldo -= valor;
        extrato.add(extrato.size(), - valor);
    }
    
    /**
     * Faz uma verificação de dados cadastrais
     * @throws Exception 
     */
    private void validaDadosCadastrais() throws Exception{
        if(this.conta == 0){
            throw new Exception("Cliente não possui um código de conta válido");
        }
        
        if(this.idade < 0){
            throw new Exception("Cliente não possui uma idade válida");
        }
    }
}
