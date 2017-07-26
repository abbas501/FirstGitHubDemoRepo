class Test2 
{
	static byte a = 10;
	static byte b = 20;
	static byte c = a+b;
	public static void main(String[] args) 
	{
	System.out.println(c);
					
	}
}
/*
Case1: 

Test2.java:5: error: possible loss of precision
        static byte c = a+b;
                         ^
  required: byte
  found:    int
1 error
*/