package junit;

import org.junit.Assert;
import org.junit.Test;

import classes.Nota;


public class NotaTest extends Nota{
	public NotaTest() {
		super(0);
	}
	
	@Test
	public void testaQuantidadeNotasComMesmoValorQueValorTotalDeveRetornar1(){
		super.valorNota = 50;
		int quantidade_nota = super.calcularQuantidadeDeNotas(50);
		Assert.assertEquals(1, quantidade_nota);
	}
	
//-----Notas 100
	@Test
	public void testaQuantidadeNotas100Valor480DeveRetornar4() {
		super.valorNota = 100;
		int quantidade_nota = super.calcularQuantidadeDeNotas(480);
		Assert.assertEquals(4, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas100ValorMenorQue100DeveRetornar0() {
		super.valorNota = 100;
		int quantidade_nota = super.calcularQuantidadeDeNotas(80);
		Assert.assertEquals(0, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas100ValorNegativoDeveRetornar0() {
		super.valorNota = 100;
		int quantidade_nota = super.calcularQuantidadeDeNotas(-80);
		Assert.assertEquals(0, quantidade_nota);
	}
	
//------Notas Valor 50
	@Test
	public void testaQuantidadeNotas50Valor250DeveRetornar5() {
		super.valorNota = 50;
		int quantidade_nota = super.calcularQuantidadeDeNotas(250);
		Assert.assertEquals(5, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas50ValorMenorQue50DeveRetornar0() {
		super.valorNota = 50;
		int quantidade_nota = super.calcularQuantidadeDeNotas(40);
		Assert.assertEquals(0, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas50ValorNegativoDeveRetornar0() {
		super.valorNota = 50;
		int quantidade_nota = super.calcularQuantidadeDeNotas(-50);
		Assert.assertEquals(0, quantidade_nota);
	}
//Notas 20
	@Test
	public void testaQuantidadeNotas20Valor368DeveRetornar180() {
		super.valorNota = 20;
		int quantidade_nota = super.calcularQuantidadeDeNotas(368);
		Assert.assertEquals(18, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas20ValorMenorQue20DeveRetornar0() {
		super.valorNota = 20;
		int quantidade_nota = super.calcularQuantidadeDeNotas(5);
		Assert.assertEquals(0, quantidade_nota);
	}
	
//Notas 10
	@Test
	public void testaQuantidadeNotas10Valor100DeveRetornar10() {
		super.valorNota = 10;
		int quantidade_nota = super.calcularQuantidadeDeNotas(100);
		Assert.assertEquals(10, quantidade_nota);
	}
	
	@Test
	public void testaQuantidadeNotas10ValorMenorQue10DeveRetornar0() {
		super.valorNota = 10;
		int quantidade_nota = super.calcularQuantidadeDeNotas(9);
		Assert.assertEquals(0, quantidade_nota);
	}		
//Teste de formatação
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoQuantidade1(){
		super.valorNota = 10;
		super.quantidadeNotasRetornar = 1;
		Assert.assertEquals("1 nota de R$ 10,00", super.formatarNomeQuantidadeNota());
	}
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoQuantidade2(){
		super.valorNota = 20;
		super.quantidadeNotasRetornar = 2;
		Assert.assertEquals("2 notas de R$ 20,00", super.formatarNomeQuantidadeNota());
	}
	
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoQuantidade0(){
		super.valorNota = 20;
		super.quantidadeNotasRetornar = 0;
		Assert.assertEquals("", super.formatarNomeQuantidadeNota());
	}
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoQuantidade0EValorNota21(){
		super.valorNota = 21;
		super.quantidadeNotasRetornar = 0;
		Assert.assertEquals("Error nota invalida", super.formatarNomeQuantidadeNota());
	}
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoQuantidadeNegativa(){
		super.valorNota = 20;
		super.quantidadeNotasRetornar = -1;
		Assert.assertEquals("Error quantidade negativa", super.formatarNomeQuantidadeNota());
	}
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoValorNotaNegativo(){
		super.valorNota = -20;
		super.quantidadeNotasRetornar = 1;
		Assert.assertEquals("Error nota invalida", super.formatarNomeQuantidadeNota());
	}
	@Test
	public void TestFormatarNomeQuantidadeNotaPassandoValorNota21(){
		super.valorNota = 21;
		super.quantidadeNotasRetornar = 1;
		Assert.assertEquals("Error nota invalida", super.formatarNomeQuantidadeNota());
	}

}
