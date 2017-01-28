package junit;

import org.junit.Assert;
import org.junit.Test;

import classes.Nota50;

public class Nota50Test extends Nota50{
	
	@Test
	public void testaQuantidadeDeNotasParaValor520Esperado5() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(520);
		Assert.assertEquals(10, quantidadeNotas);
	}
	
	@Test
	public void testaQuantidadeDeNotasParaValor100Esperado2() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(100);
		Assert.assertEquals(2, quantidadeNotas);
	}
	@Test
	public void testaQuantidadeDeNotasParaValor90Esperado1() {
		int quantidadeNotas = super.calcularQuantidadeDeNotas(90);
		Assert.assertEquals(1, quantidadeNotas);
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
		Assert.assertEquals("1 nota de R$ 50,00", resultado);
	}
	@Test
	public void TestFormatarnomeQuantidadeNotaPassando2(){
		super.quantidadeNotasRetornar = 2;
		String resultado = super.formatarNomeQuantidadeNota();
		Assert.assertEquals("2 notas de R$ 50,00", resultado);
	}
	
	
}
