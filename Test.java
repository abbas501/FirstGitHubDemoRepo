class Test
{
	static int b=10;
	//static int b=b+1; 
	public static void main(String[] args) 
	{
		b =(int) (b+1);// O/P: 11
		System.out.println(b);
	}
}

/*
Test.java:4: error: variable b is already defined in class Test
        static int b=b+1;
                   ^
1 error
--------------------------------------------------------------------------------------------
*/