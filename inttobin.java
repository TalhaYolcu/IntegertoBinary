import java.util.*;
public class inttobin {
	public static void main(String[] args) {
	    Scanner inp=new Scanner(System.in);
	   	int y=inp.nextInt();		
	    String s=new String();
		//divide until number is 1
	    while(true) {
			if(y%2==0) {
				s+="0";
			}
			else {
				if(y==1) {
					s+="1";
					break;
				}
				else {
					s+="1";
				}
			} 
			y=y/2;
	    }
		//we have reverse of the number, we have to reverse it
	    char[] chars = s.toCharArray();
	    char temp;	
	    for(int i=0;i<s.length()/2;i++) {
	    	temp=chars[i];
	    	chars[i]=chars[s.length()-i-1];
	    	chars[s.length()-i-1]=temp;
	    }	
	    System.out.println(chars);
	}
}
