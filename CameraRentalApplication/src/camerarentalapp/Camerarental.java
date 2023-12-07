package camerarentalapp;
import java.util.Scanner;
import java.util.ArrayList;
public class Camerarental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double INR = 1000;
		String username, password;

		Scanner s = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Camera Rental App");
		System.out.println("--------------------------------------");
		System.out.println("Please Login to Continue -");
		System.out.print("Enter username:");// username:sarvesh@123
		username = s.nextLine();
		System.out.print("Enter password:");// password:sarvesh1000
		password = s.nextLine();
		if (username.equals("sarvesh@123") && password.equals("sarvesh1000")) {
			System.out.println();
			System.out.println("Login Successful!!!");
			System.out.println();
			ArrayList<CamerarentalData> list = new ArrayList<>();
			list.add(new CamerarentalData(1, "Canon", "DSLR", 1000, true));
			list.add(new CamerarentalData(2, "Sony", "Ds123", 500, false));
			list.add(new CamerarentalData(3, "LG", "5050", 280, true));
			list.add(new CamerarentalData(4, "Lenova", "XPL", 300, true));
			list.add(new CamerarentalData(5, "Nikon", "SRL", 350, true));
			list.add(new CamerarentalData(6, "Sony", "2130", 260, false));
			list.add(new CamerarentalData(7, "Samsung", "DL", 550, true));
			list.add(new CamerarentalData(8, "LG", "Digital", 120, true));
			// int l=list.size();
			int x = 0;
			do {
				int option;
				Scanner sc = new Scanner(System.in);
				// public void main_option()
				System.out.println("1.MY CAMERA");
				System.out.println("2.RENT A CAMERA");
				System.out.println("3.VIEW ALL CAMERA");
				System.out.println("4.MY WALLET");
				System.out.println("Select your option : ");
				option = sc.nextInt();

				switch (option) {
				case 1:
					int k = 0;
					do {
						int choose;
						System.out.println("1.ADD");
						System.out.println("2.REMOVE");
						System.out.println("3.VIEW MY CAMERA");
						System.out.println("4.GO TO PREVIOUS MENU");
						System.out.println("Enter your choice : ");
						choose = sc.nextInt();

						switch (choose) {

						case 1:
							System.out.println("Enter Camera ID: ");
							int camera_id = sc.nextInt();
							System.out.println("Enter Camera Brand: ");
							String brand = sc.next();
							System.out.println("Enter Camera Model: ");
							String model = sc.next();
							System.out.println("Enter Camera Price per day: ");
							double price = sc.nextFloat();
							boolean Available = true;
							list.add(new CamerarentalData(camera_id, brand, model, price, Available));
							System.out.println("Successfully Added");
							System.out.println("If you want view camera List please enter '1' else enter '0': ");
							int m = sc.nextInt();
							if (m == 1) {
								System.out.println("==============================================================");
								System.out.println("cameraID\t Brand\t Model\t Price\t Status");
								System.out.println("==============================================================");
								for (int i = 0; i < list.size(); i++) {
									CamerarentalData data = list.get(i);
									String status = data.isAvailable() ? "Available" : "Rented";
									System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()
											+ "\t" + data.getPrice() + "\t" + status);									
								}
								System.out.println("==============================================================");

							}
							break;
						case 2:
							System.out.println( "Entre camera Id of the product you want to remove: ");
							int cameraId = sc.nextInt();
							for (int i = 0; i < list.size(); i++) {
								CamerarentalData camera = list.get(i);
								if (camera.getId() == cameraId) {
									list.remove(i);
									break;
								}
							}
							break;
						case 3:
							System.out.println("==============================================================");
							System.out.println("cameraID\t Brand\t Model\t Price\t Status");
							System.out.println("==============================================================");
							for (int i = 0; i < list.size(); i++) {
								CamerarentalData data = list.get(i);
								String status = data.isAvailable() ? "Available" : "Rented";
								System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()
										+ "\t" + data.getPrice() + "\t" + status);
							}
							System.out.println("==============================================================");
						case 4:
							x = 1;
							break;
						}
						System.out.println("If u want to add or remove camera please enter '1' else '0':");
						k = sc.nextInt();
					} while (k == 1);
					break;

				case 2:
					System.out.println("==============================================================");
					System.out.println("cameraID\t Brand\t Model\t Price\t Status");
					System.out.println("==============================================================");
					for (CamerarentalData data : list) {
						if (data.isAvailable()) {
							String status = data.isAvailable() ? "Available" : "Rented";

							System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t"
									+ data.getPrice() + "\t" + status);
						}
						System.out.println("==============================================================");
					}
					int index = -1;
					System.out.println("Enter camera Id of the product you want to rent ");
					int cameraId = sc.nextInt();
					for (int i = 0; i < list.size(); i++) {
						CamerarentalData camera = list.get(i);
						if (camera.getId() == cameraId) {
							index = i;
							break; // Found the camera, exit the loop
						}
					}
					if (index != -1) {
						CamerarentalData a = list.get(index);
						if (a.getPrice() <= INR) {
							System.out.println("Rented Successfully");
							a.setAvailable(false);
							INR = INR - a.getPrice();
							System.out.println("Current wallet balance - " + INR);
						} else {
							System.out.println("You don't have Sufficient Balance in your wallet");
						}
					} else {
						System.out.println("Camera with ID " + cameraId + " is not found in the list.");
					}

					break;

				case 3:
					System.out.println("==============================================================");
					System.out.println("cameraID\t Brand\t Model\t Price\t Status");
					System.out.println("==============================================================");
					for (int i = 0; i < list.size(); i++) {
						CamerarentalData data = list.get(i);
						String status = data.isAvailable() ? "Available" : "Rented";
						System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t"
								+ data.getPrice() + "\t" + status);
					}
					System.out.println("==============================================================");
					break;
				case 4:
					System.out.println("Your current wallet balance is :" + INR);
					System.out.println("Do you want to deposit more amount to your wallet?(1.Yes 2.No)- ");
					int m = sc.nextInt();
					if (m == 1) {
						System.out.println("Enter deposit amount: ");
						double addAmount = sc.nextDouble();
						INR = INR + addAmount;
						System.out.print("Your Wallet balance is updated successfully...");
					}
					System.out.println("Current wallet balance - " + INR);
					break;
				}
				System.out.println("If u want to continue (1.Yes 2.No)- ");
				x = sc.nextInt();
			} while (x == 1);
		} else {
			System.out.println("Authentication Failed");
		}
		System.out.println("Thank you for visiting camera rental application");

	}

}
