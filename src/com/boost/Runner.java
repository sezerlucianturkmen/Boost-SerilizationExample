package com.boost;

public class Runner {

	static String[] gunler;
	static int sayi;

	public static void main(String[] args) {

		birseylerYap();

		try {

			int gun = Integer.parseInt("sali");
			System.out.println("1.gun ....: " + gunler[10]);
		} catch (NullPointerException e) {
			System.out.println("gunler dizisi bos olarak kullanılmaktadır" + e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Gecersiz deger girdiniz.[1-7] araso bir deger giriniz");
		} catch (NumberFormatException e) {
			System.out.println("Lutfen sayısal bir deger giriniz" + e.toString());
		} catch (Exception e) {

		}

	}//

	public static void birseylerYap() {

		gunler = new String[7];
	}

}//
