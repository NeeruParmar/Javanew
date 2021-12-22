
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=1;
 

		    System.out.println(a++);
		    
		    System.out.println(a++);
		   
		    System.out.println(++a);
		    
		    System.out.println(a++);
		    
		    System.out.println(a++);
		    
		   
		    System.out.println(a--);
		    System.out.println(a--);

		    
		    System.out.println(--a);
		    System.out.println(--a);
		    
		    System.out.println(a--);
		    
		    
//ques 14 
		    int x = 1;       
		    x = x++ + ++x + x++ + ++x + ++x; 
		    //x=1+3+3+5+6
		    
		    System.out.println("Value of x for Question num  14 : " + x);
		    
//ques 15
 // Maths =75, Science = 55, Operating Systems =80,  Dataware house =75
//num of sub =4

		    int M= 75;
		    int S= 55;
		    int OS= 80;
		    int DH= 75;   
		    int total =  M + S + OS +  DH;
		     double  average = (total /4);
		     double per  = (average/100)*100;
		    
		    System.out.println("total marks =" + total);
		    System.out.println("average =" + average );
		    System.out.println("Total percenatge =" +per );
		   }

}
