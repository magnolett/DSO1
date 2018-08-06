package exercicio.inicial;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public class ContaCorrente extends Conta {

    public ContaCorrente(long accountNumber, double accountBalance, double accountLimit) {
		super(accountNumber, accountBalance, accountLimit);
	}

	private String accountManager;
    private boolean special;
    
    
    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }
 
    public String getAccountManager() {
        return this.accountManager;
    }
    
    public void setSpecial(boolean special) {
        this.special = special;
    }
    
    public boolean isSpecial() {
        return this.special;
    }
 
}	 	  	 	      	      	 	   	      	  	   	 	
