import java.util.Scanner;

public class Exersice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		
		int numberofdaysin_month = 0;
		String numberof_month="";
		
		System.out.println("Enter Month Number");
		int month = myscanner.nextInt();
		
		System.out.println("Enter a year");
		int year =myscanner.nextInt();
		
		switch (month) 
		{
		case 1 :
			numberof_month = "January";
			numberofdaysin_month = 31;
			break;
		case 2 :
			numberof_month = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            	numberofdaysin_month = 29;
            } else {
            	numberofdaysin_month = 28;
            }
            break;
		case 3 :
			numberof_month = "March";
			numberofdaysin_month = 31;
			break;
		case 4 :
			numberof_month = "April";
			numberofdaysin_month = 30;
			break;
		case 5 :
			numberof_month = "May";
			numberofdaysin_month = 31;
			break;
		case 6 :
			numberof_month = "June";
			numberofdaysin_month = 30;
			break;
		case 7 :
			numberof_month = "July";
			numberofdaysin_month = 31;
			break;
		case 8 :
			numberof_month = "August";
			numberofdaysin_month = 31;
			break;
		case 9 :
			numberof_month = "September";
			numberofdaysin_month = 30;
			break;
		case 10 :
			numberof_month = "October";
			numberofdaysin_month = 31;
			break;
		case 11:
			numberof_month = "Novemeber";
			numberofdaysin_month = 30;
			break;
		case 12 :
			numberof_month = "December";
			numberofdaysin_month = 31;
			break;
		}
		System.out.println(numberof_month + " " +  year +  " has " + numberofdaysin_month + " number of days.");

	}
	

	}


