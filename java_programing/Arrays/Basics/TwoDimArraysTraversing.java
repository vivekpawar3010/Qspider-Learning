// TwoDimArraysTraversing.java

class TwoDimArraysTraversing{
	public static void main(String[] args) {
		int a[][] = {{1,3,3}, {1,6,3,2,4}, {23,123,00,33}};
		System.out.println(Arrays.deepToString(a));


		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}