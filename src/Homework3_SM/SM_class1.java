package Homework3_SM;

public class SM_class1 {

	public static void main(String[] args) {
		// Static Method String class
		
		SM_class1.wylie();
		SM_class1.wylie1();
		SM_class1.wylie2();
		SM_class1.wylie3();
		SM_class1.wylie4();
		SM_class1.wylie5();

	}
	
	public static void wylie() {
		
String fname = "Reza ";
		
		String lname = "Islam";
		
		String Fullname = fname + lname;
		
		System.out.println(Fullname);
	}

	public static void wylie1() {
		
		String a = "House 12,";
		String b = " Road 3/c,";
		String c = " Sector 09,";
		String d = " Uttara,";
		String e = " Dhaka, Bangladesh";
		
		String fulladdress = a+b+c+d+e;
		
		System.out.println(fulladdress);
	}
	
	public static void wylie2() {
		
		String HS = "Wylie HS";
		String grade = " Ten grade";
		
		String Schoolgrade = HS+grade;
		
		System.out.println(Schoolgrade);
		
	}
	
	public static void wylie3() {
		
		String x = "Bangladesh";
		String y = " Cricket Team";
		
		String Teamname = x+y;
		 
		System.out.println(Teamname);
	}
	
	public static void wylie4() {
		
		String m = "Notre Dame College";
		String n = " Group 5";
		
		String Oldcollege = m+n;
		
		System.out.println(Oldcollege);
	}
	
	public static void wylie5() {
		
		String s = "Avis";
		String p = " Budget";
		
		String Workplace = s+p;
		
		System.out.println(Workplace);
	}
}
