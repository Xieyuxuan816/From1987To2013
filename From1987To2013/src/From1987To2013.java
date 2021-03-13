import java.util.HashSet;
import java.util.Scanner;

public class From1987To2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int startingYear=sc.nextInt();
		for(int i=startingYear+1;i<=10000;i++) {
			if(validate(i)) {
				System.out.println(i);
				break;
			}
		}

	}

	private static boolean validate(int year) {
		// TODO Auto-generated method stub
		HashSet<Integer> digits=new HashSet<Integer>();
		int n=year;
		while(n!=0) {
			int r=n%10;
			if(digits.contains(r)) {
				return false;
			}
			digits.add(r);
			n=n/10;
		}
		return true;
	}

}
