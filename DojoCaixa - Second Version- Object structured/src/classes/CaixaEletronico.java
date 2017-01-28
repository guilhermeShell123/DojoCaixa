package classes;
import java.util.ArrayList;

public class CaixaEletronico {
	
	public String sacar(int valorDinheiro) {
		if(valorDinheiro < 10){
			return "Valor minimo: R$ 10,00";
		}
		if(valorDinheiro % 10 != 0){
			return "Nao possuo cedulas para essa operacao, somente com: R$ 10,00 R$ 20,00 R$ 50,00 e R$100,00";
		}
		Nota100 nota100 = new Nota100();
		Nota50 nota50 = new Nota50();
		Nota20 nota20 = new Nota20();
		Nota10 nota10 = new Nota10();
		
		nota100.calcularQuantidadeDeNotas(valorDinheiro);
		valorDinheiro -= nota100.getQuantidadeNotas() * 100;
		
		nota50.calcularQuantidadeDeNotas(valorDinheiro);
		valorDinheiro -= nota50.getQuantidadeNotas() * 50;
		
		nota20.calcularQuantidadeDeNotas(valorDinheiro);
		valorDinheiro -= nota20.getQuantidadeNotas() * 20;
		
		nota10.calcularQuantidadeDeNotas(valorDinheiro);
		valorDinheiro -= nota10.getQuantidadeNotas() * 10;
		
		String stringFormatada = "Entregar: ";
		
		ArrayList<String> arrayStringFormatar = new ArrayList<String>();
		arrayStringFormatar.add(nota100.formatarNomeQuantidadeNota());
		arrayStringFormatar.add(nota50.formatarNomeQuantidadeNota());
		arrayStringFormatar.add(nota20.formatarNomeQuantidadeNota());
		arrayStringFormatar.add(nota10.formatarNomeQuantidadeNota());
		
		while(arrayStringFormatar.remove(""));
		
		if(arrayStringFormatar.size() > 1){
			String stringParcialmenteFormatada = "e " + arrayStringFormatar.get(arrayStringFormatar.size()-1);
			for(int i = arrayStringFormatar.size()-2; i >= 0; i--){
				stringParcialmenteFormatada =  arrayStringFormatar.get(i) +" " + stringParcialmenteFormatada;
			}
			stringFormatada += stringParcialmenteFormatada; 
		}else{
			stringFormatada += arrayStringFormatar.get(0);
		}
		return stringFormatada;
	}
}