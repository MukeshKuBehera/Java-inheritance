class BSNL implements Sim 
{
	public void call(){
		System.out.println("calling method  BSNL");
	}
	public void msg(){
		System.out.println("msg method of BSNL");
	
	}
	public static void main(String[] args){
		System.out.println("BSNL sim is active");
		BSNL b=new BSNL();
		b.call();
		b.msg();
	}
}
