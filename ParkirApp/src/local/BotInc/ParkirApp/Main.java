package local.BotInc.ParkirApp;

import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static Scanner userInput = new Scanner(System.in);
	static Date date = new Date();
	static Integer masukan;
	static Main main = new Main();
	
	public static void main(String[] args) {
		main.tampilMenu();
	}
	
	public void tampilMenu() {
		System.out.println("======== Aplikasi Parkiran ========");
		System.out.println("1. Checkin Kendaraan");
		System.out.println("2. Checkout Kendaraan");
		System.out.println("3. Laporan Kendaraan");
		System.out.println("4. Keluar Aplikasi");
		System.out.println("===================================");
		System.out.print("masukan pilihan: ");
		main.pilihanMenu();
	}
	
	public void pilihanMenu() {
		try {
			masukan = userInput.nextInt();
		} catch (Exception e) {
			System.out.println("anda harus memasukan angka!");
			userInput.next();
			System.out.print("masukan pilihan: ");
			pilihanMenu();
		}
		
		if(masukan == 1 || masukan == 2 || masukan == 3 || masukan == 4) {
			switch (masukan) {
			case 1:
				new CheckinKendaraan().showCheckin();
				break;

			case 2:
				new CheckoutKendaraan().showCheckout();
				break;
				
			case 3:
				new LaporanKendaraan().showLaporan();
				break;
	
			case 4:
				System.out.print("exit");
				System.exit(0);
				break;
			}
		} else {
			System.out.println("masukan angka (1-4)");
			System.out.print("masukan pilihan: ");
			pilihanMenu();
		}
	}
}
