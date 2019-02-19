/*Find Excel column name from a given column number
MS Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA”.
Given a column number, find its corresponding Excel column name. Following are more examples.

Input          Output
 1              A
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC*/


 class FindExcelColoumn{
 	public static void main(String[] args) {
 		int n=705;
 		System.out.println(help(n));	
 	}
 	public static String help(int n){
 		StringBuilder sb=new StringBuilder();
 		while(n>0){
 			int rem=n%26;
 			if(rem==0){
 				sb.append((char)'Z');
 				n=n/26-1;
 			}
 			else{
 				sb.append((char)((rem-1)+'A'));
 				n=n/26;	
 			}
 		}
 		return sb.toString(); 
 	}



 }