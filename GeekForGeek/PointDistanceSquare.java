class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class PointDistanceSquare{
	public static void main(String[] args) {
		Point p1=new Point(0,0);
		Point p2=new Point(4,0);
		Point p3=new Point(0,5);
		Point p4=new Point(5,5);
		boolean flag=validate_square(p1,p2,p3,p4);
		System.out.println(flag);
	}
	public  static boolean validate_square(Point p1,Point p2,Point p3,Point p4){
		double d1=Distance(p1,p2);
		double d2=Distance(p1,p3);
		double d3=Distance(p1,p4);
		System.out.println(d1+" "+d2+" "+d3);
		if(d1==d2 && d3==Math.sqrt(d1*d1+d2*d2)){
			return true;
		}

		else if(d1==d3 && d2==Math.sqrt(d1*d1+d3*d3)){
			return true;
		}

		else if(d2==d3 && d1==Math.sqrt(d3*d3+d2*d2)){
			return true;
		}
		else{
			return false;
		}
	}
	public static double Distance(Point p1,Point p2){		
		int x=Math.abs(p1.x-p2.x);
		int y=Math.abs(p1.y-p2.y);

		double d=Math.sqrt(x*x+y*y);
		System.out.println(d+" distance ");
		return d;
	}

}