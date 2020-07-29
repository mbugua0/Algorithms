/*
 * 
 * 
 */
public class PasspordDecryp {

	/**
	 * @param args
	 */
	public static String decrypPassword(String s) {
		String decrypPassword = "";
		
		if(s == null){
			return decrypPassword;
		}
		
		for(int i = 0; i<s.length(); i++){
			char first = s.charAt(i);
			char second = 'n';
			if(i<s.length()-1){
				second = s.charAt(i+1);
			}
			if(Character.isLowerCase(first) && Character.isUpperCase(second)){
				decrypPassword = second+""+first+""+decrypPassword+"*";
			}
			else if(Character.isDigit(first)){
				decrypPassword = first+""+decrypPassword+"0";
			}
			else if(Character.isUpperCase(first)){
				char prev = s.charAt(i-1);
				if(!Character.isLowerCase(prev) || Character.isDigit(prev)){
					decrypPassword = decrypPassword+""+first;
				} 
			}
			else{
				decrypPassword = decrypPassword+""+first;
			}
				
		}
		
		return decrypPassword;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "hAck3rr4nk";
		System.out.println(decrypPassword(password));
	}

}
