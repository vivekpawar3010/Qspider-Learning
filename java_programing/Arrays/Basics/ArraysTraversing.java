class ArraysTraversing
{
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50, 60};

		// System.out.println("____________By for loop ________________");
		// for(int i = 0; i < a.length; i++){
		// 	System.out.println(a[i]);
		// }
		// System.out.println("____________By while loop ________________");
		// int i = 0;
		// while(i < a.length){
		// 	System.out.println(a[i++]);
		// }
		// System.out.println("____________By do while loop ________________");
		// int j = 0;
		// do{
		// 	System.out.println(a[j++]);
		// }while(j < a.length);

		System.out.println("Reverse traving fo the array");
		int j = a.length - 1;
		do{
			System.out.println(a[j--]);
		}while(j >= 0);
	}
}