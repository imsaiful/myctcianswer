/* enum in java */

class Enum{
	enum days{
			SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATUDAY
		}
	public static void main(String[] args) {
		for(days d:days.values()){
			System.out.println(d);
		}
	}
}