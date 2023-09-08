import java.util.Scanner;
class Calculator{
  public static void main(String[] args){
	  int result;
	  char c;
   do{
     Scanner s1 = new Scanner(System.in);
	 System.out.println("enter two numbers");
	 int num1 = s1.nextInt();
	 int num2 = s1.nextInt();
	 System.out.println("Enter 1 for Addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for division \nEnter 5 for modulus");
	 int ch = s1.nextInt();
	 switch(ch){
	   case 1:
	   result = num1 + num2;
	   System.out.println("The Additon of "+num1+" and "+num2+" is "+result);
	   break;
	   case 2:
	   result = num1 - num2;
	   System.out.println("The Subtraction of "+num1+" and "+num2+" is "+result);
	   break;
	   case 3:
	   result = num1 * num2;
	   System.out.println("The Multiplication of "+num1+" and "+num2+" is "+result);
	   break;
	   case 4:
	   result = num1 / num2;
	   System.out.println("The Division of "+num1+" and "+num2+" is "+result);
	   break;
	   case 5:
	   result = num1 % num2;
	   System.out.println("The Modulus of "+num1+" and "+num2+" is "+result);
	   break;
	   default:
	   System.out.println("you have entered wrong choice");
	   break;
	 }
	 System.out.println("if you want to continue your calculation further then enter y other n for exit");
	 c = s1.next().charAt(0);
    }while(c=='y');
    System.out.println("Thank you for using our calculator");
 }
}

