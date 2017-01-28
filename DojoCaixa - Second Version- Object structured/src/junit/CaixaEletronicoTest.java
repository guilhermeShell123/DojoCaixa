package junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classes.CaixaEletronico;

public class CaixaEletronicoTest {
	private CaixaEletronico caixaEletronico;
	
	@Before
	public void setUp() throws Exception {
		caixaEletronico = new CaixaEletronico();
	}
	
	@Test
	public void Sacar100retornar1Nota100() {
		Assert.assertEquals("Entregar: 1 nota de R$ 100,00", caixaEletronico.sacar(100));
	}
	
	@Test
	public void Sacar50retornar1Nota50() {
		Assert.assertEquals("Entregar: 1 nota de R$ 50,00", caixaEletronico.sacar(50));
	}	
	
	@Test
	public void Sacar20retornar1Nota20() {
		Assert.assertEquals("Entregar: 1 nota de R$ 20,00", caixaEletronico.sacar(20));
	}
	@Test
	public void Sacar10retornar1Nota10() {
		Assert.assertEquals("Entregar: 1 nota de R$ 10,00", caixaEletronico.sacar(10));
	}
	@Test
	public void Sacar30retornar1Nota20e1Nota10() {
		Assert.assertEquals("Entregar: 1 nota de R$ 20,00 e 1 nota de R$ 10,00", caixaEletronico.sacar(30));
	}
	
	@Test
	public void Sacar40retornar2Notas20() {
		Assert.assertEquals("Entregar: 2 notas de R$ 20,00", caixaEletronico.sacar(40));
	}
	@Test
	public void Sacar30retornar1Nota20E1Nota10() {
		Assert.assertEquals("Entregar: 1 nota de R$ 20,00 e 1 nota de R$ 10,00", caixaEletronico.sacar(30));
	}
	@Test
	public void Sacar80retornar1Nota50_1Nota20e1Nota10() {
		Assert.assertEquals("Entregar: 1 nota de R$ 50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00", caixaEletronico.sacar(80));
	}
	@Test
	public void Sacar90retornar1Nota50E2Notas20() {
		Assert.assertEquals("Entregar: 1 nota de R$ 50,00 e 2 notas de R$ 20,00", caixaEletronico.sacar(90));
	}
	@Test
	public void SacarMenos80retornarValorMinimo10() {
		Assert.assertEquals("Valor minimo: R$ 10,00", caixaEletronico.sacar(-80));
	}
	@Test
	public void Sacar0retornarValorMinimo10() {
		Assert.assertEquals("Valor minimo: R$ 10,00", caixaEletronico.sacar(0));
	}
	@Test
	public void Sacar82retornarNaoPossuoCedulasParaEssaOperacao() {
		Assert.assertEquals("Nao possuo cedulas para essa operacao, somente com: R$ 10,00 R$ 20,00 R$ 50,00 e R$100,00", caixaEletronico.sacar(82));
	}
	@Test
	public void Sacar37retornarNaoPossuoCedulasParaEssaOperacao() {
		Assert.assertEquals("Nao possuo cedulas para essa operacao, somente com: R$ 10,00 R$ 20,00 R$ 50,00 e R$100,00", caixaEletronico.sacar(37));
	}
	@Test
	public void Sacar230retornar2Notas100_1Nota20e1Nota10() {
		Assert.assertEquals("Entregar: 2 notas de R$ 100,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00", caixaEletronico.sacar(230));
	}
	


}