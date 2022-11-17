package gggg;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam = topla(2,3,4,5,6);
	}
	public static int topla(int...sayılar) {
		int toplam=0;
		for (int sayi:sayılar) {
			toplam+=sayi;
		}
		System.out.println("toplam : "+toplam);
		return toplam;
	}

}
