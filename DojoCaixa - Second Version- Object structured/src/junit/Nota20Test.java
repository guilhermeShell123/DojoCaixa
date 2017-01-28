package junit;

import org.junit.Assert;
import org.junit.Test;

import classes.Nota20;

public class Nota20Test extends Nota20{
	
	@Test
	public void testaQuantidadeDeNotasParaValor520Esperado24() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(520);
		Assert.assertEquals(26, quantidadeNotas);
	}
	
	@Test
	public void testaQuantidadeDeNotasParaValor100Esperado5() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(100);
		Assert.assertEquals(5, quantidadeNotas);
	}
	@Test
	public void testaQuantidadeDeNotasParaValor90Esperado4() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(90);
		Assert.assertEquals(4, quantidadeNotas);
	}
	@Test
	public void testaQuantidadeDeNotasParaValorMenos90Esperado0() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(-90);
		Assert.assertEquals(0, quantidadeNotas);
	}
//------Test Formatação
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoValorNotaNegativo(){
		super.quantidadeNotasRetornar = -1;
		String resultado = super.formatarNomeQuantidadeNota();
		Assert.assertEquals("Error quantidade negativa", resultado);
	}
	
	@Test
	public void TestFormatarnomeQuantidadeNotaPassandoZero(){
		super.quantidadeNotasRetornar = 0;
		String resultado = super.formatarNomeQuantidadeNota();
		Assert.assertEquals("", resultado);
	}
	
	@Test
	public void TestFormatarnomeQuantidadeNotaPassando1(){
		super.quantidadeNotasRetornar = 1;
		String resultado = super.formatarNomeQuantidadeNota();
		Assert.assertEquals("1 nota de R$ 20,00", resultado);
	}
	@Test
	public void TestFormatarnomeQuantidadeNotaPassando2(){
		super.quantidadeNotasRetornar = 2;
		String resultado = super.formatarNomeQuantidadeNota();
		Assert.assertEquals("2 notas de R$ 20,00", resultado);
	}
	
	
}
