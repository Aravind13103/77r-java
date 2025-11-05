class Car{
	static String showroomName;
	String modelName;
	int price;

	public void displayDetails(){
	System.out.println("ShowroomName: "+showroomName);
	System.out.println("Car Model: "+modelName);
	System.out.println("Car price:" +price);
	}

	public static void main(String[] args){
		showroomName = "cars24";
		Car details = new Car();
		details.modelName="Toyota";
		details.price = 900000;
		details.displayDetails();
	}
}