class TrailingZero{
	public static void main(String[] args) {
		System.out.println("Start small. Ship something.");
        int a[] = {1,0,1,0,1,0,1,};
        int j = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == 0)
            {
                j++;
                a[i] = 1;
            }
        }
        j = a.length - j;
        while(j<a.length)
        {
            a[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(a));
	}
}