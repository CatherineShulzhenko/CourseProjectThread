package courseprojectthread;

import java.util.Scanner;

public class Dialog implements IDialog {
	Scanner in=new Scanner(System.in);

	@Override
	public void Menu() {
		System.out.println("������� �������� x:");
		double x=in.nextDouble();
		System.out.println("������� �������� y:");
		double y=in.nextDouble();
		MyRunnable myRun1=new MyRunnable("�����", 1, x, y);
		Thread t1=new Thread(myRun1);
		t1.start();
		MyRunnable myRun2=new MyRunnable("�������", 2, x, y);
		Thread t2=new Thread(myRun2);
		t2.start();
		MyRunnable myRun3=new MyRunnable("������������", 3, x, y);
		Thread t3=new Thread(myRun3);
		t3.start();
		MyRunnable myRun4=new MyRunnable("�������", 4, x, y);
		Thread t4=new Thread(myRun4);
		t4.start();
	}
}
