package classes;

public class Nota {
	protected int valorNota;
	protected int quantidadeNotasRetornar;
	
	public Nota(int valorNota){
		this.valorNota = valorNota;
		this.quantidadeNotasRetornar = 0;
	}
	
	public int calcularQuantidadeDeNotas(int valorTotal) {
		if(valorTotal >= this.valorNota){
			this.quantidadeNotasRetornar = (int) (valorTotal / this.valorNota);	
		}else{
			this.quantidadeNotasRetornar = 0;
		}
		
		return this.quantidadeNotasRetornar;
	}

	public String formatarNomeQuantidadeNota(){
		
		if(this.valorNota != 10 && this.valorNota != 20 && this.valorNota != 50 && this.valorNota != 100){
			return "Error nota invalida";
		}
		if(this.quantidadeNotasRetornar > 0){
			return this.quantidadeNotasRetornar +((this.quantidadeNotasRetornar == 1)? (" nota"):(" notas")) +" de R$ " + this.valorNota + ",00" ;
		}else{
			if(this.quantidadeNotasRetornar == 0){
				return "";
			}
			if(this.quantidadeNotasRetornar < 0){
				return "Error quantidade negativa";
			}
		}
		
		return null;
	}
	public int getQuantidadeNotas(){
		return this.quantidadeNotasRetornar;
	}
}
