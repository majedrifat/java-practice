package javabasic;

public class circel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roll r=new roll();
		r.findArea(3.9);

	}

}

class roll{
	
	double redius ;
	double area;
	void findArea(double r) {
		
		area=r*r*3.14;
		System.out.println(area);
		
	}
	
	
}