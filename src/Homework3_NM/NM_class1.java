package Homework3_NM;

public class NM_class1 {

	public static void main(String[] args) {
		// Normal Method String class
 
		NM_class1 reza = new NM_class1();
		reza.dallas();
		reza.dallas1();
		reza.dallas2();
		reza.dallas3();
		reza.dallas4();
		reza.dallas5();
		
	}

	public void dallas() {
		
		String fname = "Reza ";
		
		String lname = "Islam";
		
		String Fullname = fname + lname;
		
		System.out.println(Fullname);
		
	}
	
	public void dallas1() {
		
		String a = "House 12,";
		String b = " Road 3/c,";
		String c = " Sector 09,";
		String d = " Uttara,";
		String e = " Dhaka, Bangladesh";
		
		String fulladdress = a+b+c+d+e;
		
		System.out.println(fulladdress);
	}
	
	public void dallas2() {
		
		String HS = "Wylie HS";
		String grade = " Ten grade";
		
		String Schoolgrade = HS+grade;
		
		System.out.println(Schoolgrade);
	}
	
	public void dallas3() {
		
		String x = "Bangladesh";
		String y = " Cricket Team";
		
		String Teamname = x+y;
		 
		System.out.println(Teamname);
		
	}
	
	public void dallas4() {
		
		String m = "Notre Dame College";
		String n = " Group 5";
		
		String Oldcollege = m+n;
		
		System.out.println(Oldcollege);
	}
	
	public void dallas5() {
		
		String s = "Avis";
		String p = " Budget";
		
		String Workplace = s+p;
		
		System.out.println(Workplace);
	}
}
