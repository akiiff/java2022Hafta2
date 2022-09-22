package javaDersleri24;

public class Main {

	public static void main(String[] args) {
		
		sayıBulmaca();
	}
	public static void sayıBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
		int aranacak = 2;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur."+ aranacak);
		} else {
			mesajVer("Sayı mevcut değildir."+ aranacak);		}
		
	}
public static void mesajVer(String mesaj) {
	System.out.println(mesaj); 
	
}
}
