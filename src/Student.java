
public class Student {
	int srollno,maths,science,social;
	String sname;
	static int sid=10023;
	static String schoolname="Kps";
	Student(int srollno,String sname,int maths,int science,int social){
		this.srollno=srollno;
		this.sname=sname;
		this.maths=maths;
		this.science=science;
		this.social=social;
	}
	
	
	public void status() {
		int total=maths+science+social;
		if(total>150)
			System.out.println("Pass");
		else
			System.out.println("fail");
	}
	public static void main(String[] args) {
		Student s=new Student(102,"shankar",56,69,87);
		s.status();
		Student s1=new Student(101,"anil",85,75,68);
		s1.status();
		

	}

}
