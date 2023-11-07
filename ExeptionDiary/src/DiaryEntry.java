import java.time.DateTimeException;
import java.util.Scanner;

public class DiaryEntry {
	
	int date;
	String entryText;
	String mood;
	
    void text(String enteredText){
    	entryText=enteredText;
    	System.out.println(entryText);
    }
    void display(int date,String status) {
    	System.out.println("date:"+date+" mood:"+status+"\n\n");
    	
   
    }
    public static void main(String[] args) {
    	System.out.println("enter date ");
          int dat = 0;
    	
    	try {
    		Scanner sc=new Scanner(System.in);
        	int date=sc.nextInt();
        	if (date>31){
        		throw new DateTimeException("invalidDate");
             }else {
            	 dat=date;
            	DiaryEntry d1=new DiaryEntry();
         		d1.display(dat, "null");
         		d1.text("null");
             }
    	}
       
    	catch(DateTimeException e) {
    		System.out.println("invalid date");
    	}
    	catch(Exception e) {
    		System.out.println("enter date format");
    	}
	}
}

