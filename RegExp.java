import java.util.regex.*;
import java.util.Date;

class RegExp{
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		String str = "adhjl-1_3@mail.com";
		boolean b = pattern(str);
		System.out.println(printIf(b));
		
	}
	
	static boolean pattern(String str) {
		Pattern pat = Pattern.compile("^[a-z0-9-_.]+@[a-z]+\\.(ru|org|net|com)$");
		Matcher mat = pat.matcher(str);
		return mat.matches();
	}
	
	static String printIf(boolean b) {
		String str;
		if (b == true) {
			str = "Verification complete";
		}else {
			str = "Verification failed";
		}
		return str;
	}
	
}