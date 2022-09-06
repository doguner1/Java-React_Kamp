


public class Main {

	public static void main(String[] args) {
		
		//Don't repeat yourself
		
		String internetSubeButonu = "İnternet Şubesi";
		Double DolarDunDegeri = 8.20;
		Double DolarBugunDegeri = 8.10;
		boolean dolarDustuMu = false;
		int vade=36;
		
		
		if(DolarBugunDegeri< DolarDunDegeri) {
			System.out.println("Dolar Düştü Resmi");
		}else if(DolarBugunDegeri > DolarDunDegeri){
			System.out.println("Dolar Yükseldi Resmi");
		}else {
			System.out.println("Dolar Eşit Resmi");
		}
		
		// Köşeli parantez Var ise orada verdiğimiz veri tipi ile birden fazla veri olabilir demek
		String[] krediler = 
			{
					"Hızlı Krediler" , 
					"Mutlu Emekli Kredisi" , 
					"Konut Kredisi" , 
					"Map Kredisi" ,
					"Doğu Kredi"
					
			};
		
		
		for (String item : krediler) {
			System.out.println(item);
		}
		
		
		System.out.println(internetSubeButonu); 
		
	}

}
