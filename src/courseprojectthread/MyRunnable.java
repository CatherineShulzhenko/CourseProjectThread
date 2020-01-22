package courseprojectthread;

public class MyRunnable implements Runnable {
	private String name;
	private double x;
	private double y;
	private double result;
	private int kind;
	
	MyRunnable (String name, int kind, double x, double y){
		this.name=name;
		this.kind=kind;
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void run() {
		if(kind==1) {
			this.result=x+y;
		} else {
			if(kind==2) {
				this.result=x-y;
			} else {
				if(kind==3) {
					this.result=x*y;
				} else {
					this.result=x/y;
				}
			}
		}
		System.out.println("Поток ("+kind+") "+this.name+": "+result);
	}
}
