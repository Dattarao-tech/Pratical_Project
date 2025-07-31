package loopprogram;

public class rev {
	public static void main (String[] args) {
		
		String a="jagnade";
		String b="";
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			b=b+a.charAt(i);
			
		}
		System.out.println(b);
	}

}
