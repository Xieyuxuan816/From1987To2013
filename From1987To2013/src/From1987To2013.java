import java.util.Scanner;

public class From1987To2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int startingYear=sc.nextInt();
		for(int i=startingYear+1;i<10000;i++) {
			String s=String.valueOf(i);
			String[] year=s.split("");
			if(compareArray(year)) {
				print(year);
				break;
			}
		}

	}

	private static void print(String[] year) {
		// TODO Auto-generated method stub
		for(int i=0;i<year.length;i++) {
			System.out.print(year[i]);
		}
		
	}

	private static boolean compareArray(String[] year) {
		// TODO Auto-generated method stub
		for(int i=0;i<year.length;i++) {
			for(int j=i+1;j<year.length;j++) {
				if(year[i].equals(year[j])) {
					return false;
				}
			}
		}
		return true;
	}

}
