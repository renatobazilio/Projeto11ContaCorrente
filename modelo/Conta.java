/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Conta {
    private String nomeDono;
    private int numConta;
    private Double saldo;

    public Conta() {
    }

    public Conta(String nomeDono, int numConta, Double saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    void depositar(double quantidade){
            this.saldo += quantidade;
            System.out.println("\n\nValor depositado R$" + quantidade +"\n");
    }
    
    void sacar (double quantidade){
        if(quantidade > this.saldo){
            System.out.println("\nValor maior que o limite disponivel");
        }else{
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            System.out.println("\nValor sacado R$" + quantidade +"\n");
        }
    }
    void transferencia (Conta destino, double quantidade){
        if(quantidade > this.saldo){
            System.out.println("\nValor maior que o limite disponivel");
        }else{
            this.saldo -= quantidade;
            destino.saldo += quantidade;
            System.out.println("\nValor Transfirido R$" + quantidade +"\n");
        }
    }
}
