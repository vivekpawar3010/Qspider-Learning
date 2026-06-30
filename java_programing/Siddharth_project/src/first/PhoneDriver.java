package first;

import java.util.Scanner;

public class PhoneDriver {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("Welcome to Phone Management System");
			System.out.println("1. Insert new Phone Data");
			System.out.println("2. Display all phone data");
			System.out.println("3. Update mobile details based on id");
			System.out.println("4. Delete mobile phone based on id");
			System.out.println("5. Display data based on id");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					PhoneDao.savePhone();
					break;

				case 2:
					PhoneDao.displayPhoneData();
					break;

				case 3:
					System.out.println("1. Update Name");
					System.out.println("2. Update Color");
					System.out.println("3. Update Price");
					System.out.println("4. Update Ram");
					System.out.print("Enter your choice: ");
					int ch = sc.nextInt();
					sc.nextLine();

					switch (ch) {
						case 1:
							PhoneDao.updatePhoneName();
							System.out.println("Data Updated Successfully");
							break;

						case 2:
							PhoneDao.updatePhoneColor();
							System.out.println("Data Updated Successfully");
							break;

						case 3:
							PhoneDao.updatePhonePrice();
							System.out.println("Data Updated Successfully");
							break;

						case 4:
							PhoneDao.updatePhoneRam();
							System.out.println("Data Updated Successfully");
							break;

						default:
							System.out.println("Wrong Choice");
							break;
					}
					break;

				case 4:
					PhoneDao.deletePhoneDetails();
					break;

				case 5:
					PhoneDao.readPhoneDetailsOnId();
					break;

				case 6:
					System.out.print("Do you really want to exit? 1: Yes, 2: No: ");
					int choiceOne = sc.nextInt();
					sc.nextLine();
					if (choiceOne == 1) {
						flag = false;
						System.out.println("Thank you for using our application");
						System.out.println("Visit Again 😊😊");
					}
					break;

				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
	}
}