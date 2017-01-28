package classes;

public class Nota10 extends Nota{
	
	public Nota10() {
		super(10);
	}
	
	public int calcularQuantidadeDeNotas(int valorTotal){
		super.calcularQuantidadeDeNotas(valorTotal);
		return super.quantidadeNotasRetornar;
	}

	public String formatarNomeQuantidadeNota() {
		return super.formatarNomeQuantidadeNota();
	}
}
