/*Find if two rectangles overlap
Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates.
l1: Top Left coordinate of first rectangle.
r1: Bottom Right coordinate of first rectangle.
l2: Top Left coordinate of second rectangle.
r2: Bottom Right coordinate of second rectangle.

rectanglesOverlap

We need to write a function bool doOverlap(l1, r1, l2, r2) that returns true if the two given rectangles overlap.

Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
Note : It may be assumed that the rectangles are parallel to the coordinate axis.



One solution is to one by one pick all points of one rectangle and see if the point lies inside the other rectangle or not. This can be done using the algorithm discussed here.
Following is a simpler approach. Two rectangles do not overlap if one of the following conditions is true.
1) One rectangle is above top edge of other rectangle.
2) One rectangle is on left side of left edge of other rectangle.

We need to check above cases to find out if given rectangles overlap or not. Following is the implementation of the above approach.*/
class RectangleOverlap{
	static class P{
		int x,y;
		P(int a,int b){
			x=a;
			y=b;
		}
	}
	public static void main(String[] args) {
		P l1=new P(0,10);//top left 1
		P r1=new P(10,0);//botton right 1
		P l2=new P(5,5);//top left 2
		P r2=new P(15,0);//bottom right 2
		System.out.println(help(l1,r1,l2,r2));
	}
	public static boolean help(P l1,P r1,P l2,P r2){
		if(l1.x>r2.x || l2.x>r1.x || l1.y<r2.y || l2.y<r1.y){
			return false;
		}
		return true;

	}
}