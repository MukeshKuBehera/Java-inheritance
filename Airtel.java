class Airtel implements Sim 
{
	public void call(){
		System.out.println("calling method  Airtel");
	}
	public void msg(){
		System.out.println("msg method of Airtel");
	}
	abstract void videocall(){
		return "videocall";
	}
	public static void main(String[] args){
		System.out.println("Airtel sim is active");
		Airtel a=new Airtel();
		a.call();
		a.msg();
		a.videocall();
	}
}
