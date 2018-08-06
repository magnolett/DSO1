package exercicio.inicial;

import java.util.List;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public class Banco {

    private List<Conta> accountList;
    
    public Banco(List<Conta> accountList) {
        this.accountList = accountList;
    }
    
    public void setAccountList(List<Conta> accountList) {
        this.accountList = accountList;
    }
    
    public List<Conta> getAccountList() {
        return this.accountList;
    }
    
    public Conta accountCreation(long accountNumber, double accountBalance, double accountLimit) {
        Conta account = new Conta(accountNumber, accountBalance, accountLimit);
        return account;
    }
    
    public String accountDelete(Conta account) {
        account.setAccountBalance(0);
        account.setAccountNumber(0);
        account.setAccountLimit(0);
        return "Conta deletada com sucesso!";
    }
    
    public void withdrawMoney(Conta account, double moneyToWithdraw) {	 	  	 	      	      	 	   	      	  	   	 	
        if(moneyToWithdraw > account.getAccountBalance()) {
            System.out.println("O valor desejado é maior que o saldo disponível!");
        } else if (moneyToWithdraw > account.getAccountLimit()) {
            System.out.println("O limite de saque diário já foi excedido!");
        } else {
            
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
    public void insertMoney(Conta account, double moneyToDeposit) {
        double accountBalance = account.getAccountBalance();
        account.setAccountBalance(accountBalance+moneyToDeposit);
        System.out.println("Dinheiro depositado com sucesso!");
    }    
    
    public void showAccountBalance(Conta account) {
        System.out.println("O saldo disponível na sua conta é: " + account.getAccountBalance());
    }
    
    public void getBankStatement(Conta account) {
        List<Movimentacao> transactionList = account.getTransaction();
        
        for(Movimentacao transaction : transactionList) {
            System.out.println("Descrição da transação: " + transaction.getDescription());
            System.out.println("Valor da transação: " + transaction.getTransactionValue());
            
            if(transaction.isCreditOrDebit(true)) {
                System.out.println("Transação realizada no crédito");
            } else {
                System.out.println("Transação realizada no débito");
            }
        }    
    }
    
    public void accountTransfer(Conta accountFrom, Conta accountTo, double transferValue) {	 	  	 	      	      	 	   	      	  	   	 	
        if(accountFrom.getAccountBalance() > transferValue) {
            System.out.println("O valor solicitado é maior que o disponível na conta!");
        } else {
            accountFrom.setAccountBalance(accountFrom.getAccountBalance() - transferValue);
            accountTo.setAccountBalance(accountTo.getAccountBalance() + transferValue);
            System.out.println("Valor transferido com sucesso!");
        }
    }
    
    
    
}