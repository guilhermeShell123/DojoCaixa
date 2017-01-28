package classes;

public class Nota20 extends Nota{
	
	public Nota20() {
		super(20);
	}
	
	public int calcularQuantidadeDeNotas(int valorTotal){
		super.calcularQuantidadeDeNotas(valorTotal);
		return super.quantidadeNotasRetornar;
	}

	public String formatarNomeQuantidadeNota() {
		return super.formatarNomeQuantidadeNota();
	}
}
