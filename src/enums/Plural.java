package enums;
import java.util.Calendar;

public class Plural {
	public static final String AMARILLO = "AMARILLO";
	public static void main(String[] args) {
		
		if(Colores.AMARILLO.toString().equals(AMARILLO)){
			System.out.println("Proband enum amarillo: "+ Colores.AMARILLO.toString());
		}
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(Calendar.getInstance().getTime().toString().split(" ")[0].toUpperCase());
		
		for(Dias dia : Dias.values()){
			if(dia.toString().contains(Calendar.getInstance().getTime().toString().split(" ")[0].toUpperCase())){
				System.out.println(dia);
			}
			
		}
	}
}
