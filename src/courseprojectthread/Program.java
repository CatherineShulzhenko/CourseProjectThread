package courseprojectthread;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Dialog user=new Dialog();
		user.Menu();
		System.out.println("Выйти из программы?");
		System.out.println("1-да, 2-нет");
		int exit=in.nextInt();
		if(exit==1) {
			System.exit(0);
		} else {
			if(exit==2) {
				user.Menu();
			} else {
				System.out.println("Неправильная команда");
			}
		}
		in.close();
	}
}
