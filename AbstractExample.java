 class AB{
	abstract void dis();
	void disp()
	{
	System.out.println("I am in abstract class");
	}
}
class AB1 extends AB{
	void dis()
	{
	System.out.println("I am dis from AB1");
	}
}
class AbstractExample{
	public static void main(String args[]){
	AB a=new AB();
	//a.dis();
	a.disp();
	






	}
}
