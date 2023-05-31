package javapratice;

public class Constructorme {
	
	private int age;
	private String name;
	
	public Constructorme(int a,String b){
		 age=a;
		 name=b;
	 }
	
	//get method
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
	 
	 
	public static void main(String[] args) {
		Constructorme s=new Constructorme(21,"kashi");
		Constructorme s1=new Constructorme(22,"kashi");
		
		cons1 cs=new cons1();
		int su=cs.pri();
		System.out.println(su);
		
		
		System.out.println("age="+ s.getAge());
		System.out.println("name="+ s.getName());
	}

}