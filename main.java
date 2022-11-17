package methodv2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj ="bugün hava çok güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayı=topla(12,6);
		System.out.println(sayı);
		
	}
	public static void ekle() {
		System.out.println("eklendi");
		
	}
	public static void sil() {
		
		System.out.println("silindi");
		
	}
	public static void güncele() {
		System.out.println("güncelendi");	
		
	}
	public static int topla(int sayı1,int sayı2) {
		return sayı1+sayı2;
	}
	public static String sehirVer() {
		return "istanbul";
	}
}
