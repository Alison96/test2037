package Logic;

public class Card {
	
	private String numeroCarta;
	private String cvc;
	private String dataScadenza;
	private Integer saldo;
	
public Card(String numero_carta, String cvc, String data_scadenza, Integer saldo) {
		
		setSaldo(saldo);
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

}
