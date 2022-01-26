package Method;

public class MainCustomerProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CustomerService customerService= new CustomerService();
String newName =customerService.getname();
String newEmail= customerService.getemail();
String newAddress= customerService.getaddress();

newName ="Jane";
newEmail= "jane@gmail.com";
newAddress= "2220 Attwel Drive";

System.out.println("Name of the Customer is "+newName);
System.out.println("Email of the Customer is "+ newEmail);
System.out.println("Address of the Customer is "+ newAddress);


     

	}

}
