
public class exampless {

	public static void main(String[] args) {
		
		sayıBulma();
	}
	public static void sayıBulma () {
		int[] sayılar=new int[] {1,2,3,4,5,6};
		int aranacak=1;
		boolean koşul = false;
		for (int i : sayılar) {
			if(aranacak== i) {
				 koşul=true;
				break;
			}
			
		}
		if(koşul) {
			mesajVer(aranacak+" sayısı dizinde var");
		}else mesajVer(aranacak+" sayısı dizinde  yok");
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
