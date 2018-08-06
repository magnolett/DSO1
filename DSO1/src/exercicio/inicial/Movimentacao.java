package exercicio.inicial;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public class Movimentacao {

    private String description;
    private double transactionValue;
    private boolean transactionType;
    
    public Movimentacao(String description, double transactionValue, boolean transactionType) {
        this.description = description;
        this.transactionValue = transactionValue;
        this.transactionType = transactionType;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }
    
    public double getTransactionValue() {
        return this.transactionValue;
    }
    
    public void setTransactionType(boolean transactionType) {
        if(transactionType) {
            System.out.println("Transação realizada no crédito!");
        } else {	 	  	 	      	      	 	   	      	  	   	 	
            System.out.println("Transação realizada no débito!");
        }
        this.transactionType = transactionType;
    }
    
    public boolean isCreditOrDebit(boolean transactionType) {
        return this.transactionType;
    }

}