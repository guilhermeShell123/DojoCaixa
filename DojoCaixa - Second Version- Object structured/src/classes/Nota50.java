package classes;

public class Nota50 extends Nota{
	
	public Nota50() {
		super(50);
	}
	
	public int calcularQuantidadeDeNotas(int valorTotal){
		super.calcularQuantidadeDeNotas(valorTotal);
		return super.quantidadeNotasRetornar;
	}

	public String formatarNomeQuantidadeNota() {
		return super.formatarNomeQuantidadeNota();
	}
}
