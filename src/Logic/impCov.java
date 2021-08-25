package Logic;

public class impCov {
	
	public Card registraPagamento(String numero_carta, String cvc, String data_scadenza, Integer saldo, Integer metodoPagamento) {
		Integer importo = 150;
		Integer nuovoSaldo;
		Card c = new Card(numero_carta, cvc, data_scadenza, saldo);
		if(metodoPagamento == 0) {
			System.out.println("Hai pagato 150 euro in contanti");
			return c;
		}else {
			nuovoSaldo = c.getSaldo() - importo;
			c.setSaldo(nuovoSaldo);
			return c;
		}
		
	}

}
