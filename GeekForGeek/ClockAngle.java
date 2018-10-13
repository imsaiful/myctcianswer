import java.util.*;
import java.io.*;
class ClockAngle{
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int h=in.nextInt();
		int m=in.nextInt();
		System.out.println(Calculate_angle(h,m));
	}
	public static double Calculate_angle(int h,int m){

		double a1=(h*60+m)*0.5;
		double a2=6*m;
		double angle=Math.abs(a1-a2);
		return Math.min(360-angle,angle);
}
}