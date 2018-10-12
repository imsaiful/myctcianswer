class Point{
	int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;


	}



}

class RectangleOverlap{
	public static void main(String[] args) {
		Point l1=new Point(0,5);
		Point r1=new Point(10,0);
		Point l2=new Point(5,5);
		Point r2=new Point(15,0);		
		boolean flag=Validate_No_overlap(l1,r1,l2,r2);
		if(flag){
			System.out.println("Not overlap");	
		}
		else{
			System.out.println("Overlap");
		}
		
	}
	public static boolean Validate_No_overlap(Point l1,Point r1,Point l2,Point r2){
		if(l1.x > r2.x && l2.x > r1.x){
			return false;
		}
		if(l1.y < r2.y && l2.y < r1.y){
			return false;
		}

		
		return true;


	}



}