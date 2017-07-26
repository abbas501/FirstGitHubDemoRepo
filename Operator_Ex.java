class  Operator_Ex
{   
	int a=10;
	int  b=a+1;
	byte d = 10;
	byte e = 20;
	//byte f = d+e;
		public static void main(String[] args) 
	{
		byte c = 10;
		c=c+1;
		byte ab=10;
		byte cd=20;
		byte ef=(byte)(ab+cd); //TypeCasting Is done Here 
		
		Operator_Ex or = new Operator_Ex();
		System.out.println(ef);
		System.out.println(or.b);
		System.out.println(c);
	//	System.out.println(or.f);
		System.out.println(ef);
	}
}


/*


Operator_Ex.java:15: error: possible loss of precision
                byte ef=ab+cd;
                          ^
  required: byte
  found:    int
1 error

C:\Users\UIL15\Desktop\OCJP>javac Operator_Ex.java
Operator_Ex.java:7: error: possible loss of precision
        byte f = d+e;
                  ^
  required: byte
  found:    int
Operator_Ex.java:15: error: possible loss of precision
                byte ef=ab+cd;
                          ^
  required: byte
  found:    int
2 errors
*/