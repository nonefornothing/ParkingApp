package local.BotInc.ParkirApp;

import java.util.Scanner;

public class LaporanKendaraan {
	
	Scanner userInput = new Scanner(System.in);
	
	public static CheckinKendaraan checkin = new CheckinKendaraan();
	public static CheckoutKendaraan checkout = new CheckoutKendaraan();
	
	static String masukanString;
	
	public void showLaporan() {
		System.out.println("======================");
		System.out.print("Kendaraan Check In:");
		if(checkin.listCheckIn.size() == 0) {
			System.out.println(" 0");
		} else {
			for(int i = 0; i < checkin.listCheckIn.size(); i++){
				System.out.print("\n" + checkin.listCheckIn.get(i)[0] + " " + checkin.listCheckIn.get(i)[1] + " " + checkin.listCheckIn.get(i)[2] + " " + checkin.listCheckIn.get(i)[3] + " " + checkin.listCheckIn.get(i)[4] + ":" + checkin.listCheckIn.get(i)[5] + ":" + checkin.listCheckIn.get(i)[6] + " " + checkin.listCheckIn.get(i)[7] + "-" + checkin.listCheckIn.get(i)[8] + "-" + checkin.listCheckIn.get(i)[9]);
			}
		}
		System.out.print("\nKendaraan Check Out");
		if(checkout.listCheckout.size() == 0) {
			System.out.println(" 0");
		} else {
			for(int i = 0; i < checkout.listCheckout.size(); i++) {
				System.out.print("\n" + checkout.listCheckout.get(i)[0] + " " + checkout.listCheckout.get(i)[1] + " " + checkout.listCheckout.get(i)[2] + " " + checkout.listCheckout.get(i)[3] + " " + checkout.listCheckout.get(i)[4] + ":" + checkout.listCheckout.get(i)[5] + ":" + checkout.listCheckout.get(i)[6] + " " + checkout.listCheckout.get(i)[7] + "-" + checkout.listCheckout.get(i)[8] + "-" + checkout.listCheckout.get(i)[9]);
			}
		}
		
		kembaliKeMenu();
	}
	
	public void kembaliKeMenu() {
		System.out.println("\nKembali ke menu utama ? (y/n)");
		System.out.print(": ");
		masukanString = userInput.nextLine();
		if(masukanString.equals("y") || masukanString.equals("Y")) {
			new Main().tampilMenu();
		} else if (masukanString.equals("n") || masukanString.equals("N")){
			showLaporan();
		} else {
			System.out.println("Input wrong");
			kembaliKeMenu();
		}
	}
}
