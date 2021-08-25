package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

import Logic.Card;
import Logic.impCov;

class Impossible_coverage_TEST {

	@Test
	void test() {
		String nC = "0123456789";
		String cvc = "789";
		String dS = "02/2025";
		Integer saldo = 200;
		Random i = new Random();
		int x = i.nextInt(2);
		impCov ic = new impCov();
		Card c = ic.registraPagamento(nC, cvc, dS, saldo, x);
		assertEquals(50, c.getSaldo());
	}

}
