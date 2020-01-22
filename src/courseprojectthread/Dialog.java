package courseprojectthread;

import java.util.Scanner;

public class Dialog implements IDialog {
	Scanner in=new Scanner(System.in);

	@Override
	public void Menu() {
		System.out.println("¬ведите аргумент x:");
		double x=in.nextDouble();
		System.out.println("¬ведите аргумент y:");
		double y=in.nextDouble();
		MyRunnable myRun1=new MyRunnable("сумма", 1, x, y);
		Thread t1=new Thread(myRun1);
		t1.start();
		MyRunnable myRun2=new MyRunnable("разница", 2, x, y);
		Thread t2=new Thread(myRun2);
		t2.start();
		MyRunnable myRun3=new MyRunnable("произведение", 3, x, y);
		Thread t3=new Thread(myRun3);
		t3.start();
		MyRunnable myRun4=new MyRunnable("частное", 4, x, y);
		Thread t4=new Thread(myRun4);
		t4.start();
	}
}
