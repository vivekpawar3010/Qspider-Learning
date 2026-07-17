// ArraysInputFromUser.java
import java.util.Scanner;
import java.util.Arrays;
class ArraysInputFromUser{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter the ele at " + (i + 1) + " in array");
			arr[i] = sc.nextInt();
		}
	}
}