package classes;

public class Nota100 extends Nota{
	
	public Nota100() {
		super(100);
		
	}

	public int calcularQuantidadeDeNotas(int valorTotal){
		super.calcularQuantidadeDeNotas(valorTotal);
		return super.quantidadeNotasRetornar;
	}

	public String formatarNomeQuantidadeNota() {
		return super.formatarNomeQuantidadeNota();
	}
	
}
