import java.util.ArrayList;

public class CaixaEletronico {

	public String formatarNomeQuantidadeNota(int valorNota, int quantidadeNota ){
		
		if(valorNota != 10 && valorNota != 20 && valorNota != 50 && valorNota != 100){
			return "Error nota invalida";
		}
		
		if(quantidadeNota > 0){
			return quantidadeNota +((quantidadeNota == 1)? (" nota"):(" notas")) +" de R$ " + valorNota + ",00" ;
		}else{
			if(quantidadeNota == 0){
				return "";
			}
			if(quantidadeNota < 0){
				return "Error quantidade negativa";
			}
		}
		
		return null;
	}
	
	public String sacar(int valorDinheiro) {
		if(valorDinheiro < 10){
			return "Valor minimo: R$ 10,00";
		}
		if(valorDinheiro % 10 != 0){
			return "Nao possuo cedulas para essa operacao, somente com: R$ 10,00 R$ 20,00 R$ 50,00 e R$100,00";
		}
		int quantidadeNotas100 = valorDinheiro / 100;
		valorDinheiro -= quantidadeNotas100 * 100;
		
		int quantidadeNotas50 = valorDinheiro / 50;
		valorDinheiro -= quantidadeNotas50 * 50;
		
		int quantidadeNotas20 = valorDinheiro / 20;
		valorDinheiro -= quantidadeNotas20 * 20;
		
		int quantidadeNotas10 = valorDinheiro / 10;
		valorDinheiro -= quantidadeNotas10 * 10;
		
		String stringFormatada = "Entregar: ";
		
		ArrayList<String> arrayStringFormatar = new ArrayList<String>();
		arrayStringFormatar.add(formatarNomeQuantidadeNota(100,quantidadeNotas100));
		arrayStringFormatar.add(formatarNomeQuantidadeNota(50,quantidadeNotas50));
		arrayStringFormatar.add(formatarNomeQuantidadeNota(20,quantidadeNotas20));
		arrayStringFormatar.add(formatarNomeQuantidadeNota(10,quantidadeNotas10));
		
		
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