
public class Student {
	
	    String name;
	    int rollNumber;
	    int mark;
	    Student(String text,int r,int m){
	        name=text;
	        rollNumber=r;
	        mark=m;
	    }
	    void display(){
	        System.out.println("name:"+name);
	        System.out.println("roll no:"+rollNumber);
	        System.out.println("mark:"+mark);
	        
	    }
	    void  grade() {
	    	if(mark>=90){
	         System.out.println("grade :A");
	         System.out.println();
	    	}else if(mark>=80) {
	        	System.out.println("grade B");
	        	System.out.println();
	    	}else if(mark>=70) {
	        	System.out.println("grade C");
	        	System.out.println();
	    	}else if(mark>=60) {
	        	System.out.println("grade D");
	        	System.out.println();
	    	}else {
	        	System.out.println("grade E");
	        	System.out.println();
	    	}
	    	
	    
	    }
	    public static void main(String[] args) {
	        Student s1=new Student("Raju",1,90);
	        s1.display();
	        s1.grade();
	        Student s2=new Student("Babu", 2, 61);
	        s2.display();
	        s2.grade();
	        
	    }

	}


