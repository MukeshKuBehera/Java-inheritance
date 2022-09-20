class Vodafone implements Sim 
{
	public void call(){
		System.out.println("calling method  vodafone");
	}
	public void msg(){
		System.out.println("msg method of vodafone");
	}
	public static void main(String[] args){
	Vodafone s1=new Vodafone();
	s1.call();
	s1.msg();
	}
}
