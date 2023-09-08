//java program for defining the class
public class Sampleclass
{
	int id;
	String name;
	int age;
	//passing the constructer
	Sampleclass(int i,string n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+" "+name" "+age);
	}
	public static void main(String[]args)
	{
		Sampleclass s1= new Sampleclass(1,"YAS",21);
		s1.display();
	}
}