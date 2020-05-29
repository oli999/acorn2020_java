package tesc.mypac;

public class Member {

	 int num ;
	 String name;
	 String addr;
	
	public Member(int mNumber, String mName, String mAddr)
	{
		this.num = mNumber;
		this.name = mName;
		this.addr = mAddr;
	}
	
	public void showInfo()
	{
		System.out.println(this.num +" | "+ this.name + " | "+this.addr);
	}

}
