
public class Ex1 {

	public static void main(String[] args) {
	
		int i = 10;
		System.out.println(i);
		String str = "10";
		System.out.println(str);
		char ch = 65;
		char ch1 = 'A';
		System.out.println(ch);
		System.out.println(ch1);
		int i1 = ch1;
		System.out.println(i1);
		long l = 10;
		System.out.println(l);
		long l1 = 10000000000L;
		System.out.println(l1);
		
		
		float f = 10.5f;
		double d = 10.5;
		System.out.println(f);
		System.out.println(d);
		f = 0.123456789123456789f;
		d = 0.123456789123456789;
		System.out.println(f);
		System.out.println(d);
		
		double d1 = 12345;
		double d2 = 3e5;
		System.out.println(d2);
		
		boolean b = true;
		boolean b1 = false;
		String str1 = "true";
		System.out.println(b);
		System.out.println(str1);
		// 리터널 : 정수, 실수, 문자, 문자열, 논리
		// 자료형 : 정수 : int, long, char
		//		  실수 :float, double
		//        문자 : char
		//        문자열 : String
		//        논리 : boolean
		// Promotion : 자동형변환 byte -> short -> int -> long -> float -> double
		
		short s = 10;
		int i3 = s;
		float f1 = i3;
		int i4 = 123456;
		float f2 = i4;
		System.out.println(f2);
		int i5 = (int)f2;
		System.out.println(i5);
		
		int i6 = 129;
		byte b3 = (byte)i6;
		
		System.out.println(b3);
		int i7 = 2000000000;
		int i8 = 2000000000;
		//int i9 = i7 + i8;
		long l3 = (long)i7 + i8;
		//System.out.println(i9);
		System.out.println(l3);
		

		
	}

}
