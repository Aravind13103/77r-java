class Marks{
	static int sub1 = 85;
	static int sub2 = 90;
	static int sub3 = 80;
	static int sum(){	
		return sub1+sub2+sub3;
	}
	static average(){
		float result = sum()/3;
		System.out.println("Average:" + result);
	}
public static void main(String[] args){
	float a = sum();
	System.out.println(a);
}
}