package my_practice;

import java.util.Scanner;

public class String_Program {

	public static void main(String[] args) {
		
       //	abc(200 ,300);
       //	def();
		//ghi();
		//jkl();
		//mno();
		//pqr();
		//stu();
		//vwx();
		yza();
		}
	  static void abc (int a, int b) {
		System.out.println(a+b);
	}
	  static void def() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter a Text");
		 String  str = sc.next();
		 
		 String reverse ="";
		 for(int i=str.length()-1; i>=0; i--) { 
		 reverse= reverse +str.charAt(i);
			 
		 }System.out.println(reverse +" "+"="+reverse);
		 if(str.equals(reverse)) {
			 System.out.println("Gven String IS Palindrom:"+ str);
		 }else {
			 System.out.println("Given String is not a palindrom:"+" "+str);
		 }
		 
	 }
	  static void ghi(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num  = sc.nextInt();
        if(isPalindrome(num)) {
        	System.out.println("given number is palindrome:"+num);
        }else {
        	System.out.println("given number is not palindrome:"+num);
        }
        sc.close();
	  }
	private static boolean isPalindrome(int num) {
		int ONUM =num;
		int RNUM =0;
		while(num>0) {
			int digit = num%10;
			RNUM= RNUM*10+digit;
			num/=10;
		}
		return ONUM==RNUM;
	}
	public static void jkl() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eniter a number");
		int num =sc.nextInt();
		if(num%2==0) {
			System.out.println("Given Number is Even");
		}else {
			System.out.println("Given number is Odd");
		}
	}
	public static void mno() {
		int i,fact=1;                                               
 	   int number=5;                
 	   for(i=1;i<=number;i++){    
 	       fact=fact*i;    
 	   }    
 	   System.out.println("Factorial of "+number+" is: "+fact); 
	}
	public static void pqr() {
		String str = "hello deepak";
		String []x= str.split(" ");
		for(int i=0; i<=x.length; i++) {
			for(int j=x[i].length()-1; j>=0; j-- ) {
			System.out.print(x[i].charAt(j));
		}System.out.print(" ");
	}
	}
	
	public static void stu() {
		String str ="hello deepak"; 
	  //System.out.println(str.length());
		String[]x =str.split(" ");
		//System.out.println(x.length);
		for(int i=x.length-1; i>=0; i--) {
			for(int j=x[i].length()-1; j>=0; j--) {
				System.out.print(x[i].charAt(j));
			}System.out.print(" ");
			
		}
	}
	public static void vwx() {
		String str="@aBc1adf3hG#hj@k$lL&0l0j9";
		int uc=0;
		int lc=0;
		int dc=0;
		int sc=0;
		for(int i=0; i<str.length(); i++) {
		char c =str.charAt(i);
		if(Character.isUpperCase(c)) {
			uc=uc+1;
			}else if(Character.isLowerCase(c)) {
			lc=lc+1;
		}else if(Character.isDigit(c)) {
			dc=dc+1;
			}else{
			sc=sc+1;
		}
	}
		System.out.println("UpperCount:"+uc);
		System.out.println("Lowercount:"+lc);
		System.out.println("DigitCount:"+dc);
		System.out.println("SpecialCount:"+sc);
   }
	public static void yza() {
		for(int i=0; i<=5; i++) {
			for(int j=1; j>i; j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
	}
	
  }
