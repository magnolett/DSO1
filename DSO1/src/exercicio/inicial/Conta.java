package exercicio.inicial;

import java.util.List;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public class Conta {

    private List<Movimentacao> transaction;
    private long accountNumber;
    private double accountBalance;
    private double accountLimit;

    public Conta(long accountNumber, double accountBalance, double accountLimit) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountLimit = accountLimit;
        
    }
    
    public void setTransaction(List<Movimentacao> transaction) {
        this.transaction = transaction;
    }
    
    public List<Movimentacao> getTransaction() {
        return this.transaction;
    }
    
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public long getAccountNumber() {
        return this.accountNumber;
    }	 	  	 	      	      	 	   	      	  	   	 	
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public double getAccountBalance() {
        return this.accountBalance;
    }
    
    public void setAccountLimit(double accountLimit) {
        this.accountLimit = accountLimit;
    }
    
    public double getAccountLimit() {
        return this.accountLimit;
    }

}