class PatternMock7 {
	public static void main(String[] args) {
		int n = 10;
		String str = "* * * * * ";

		// This creates the format string "%.3s" dynamically
		for (int i = 1; i <= n; i += 2) {
			System.out.printf("%." + i + "s", str);
			System.out.println();
		}
	}
}
