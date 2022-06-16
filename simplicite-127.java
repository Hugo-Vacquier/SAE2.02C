package sae;

public class Remove {
	
	public static String removeSpace(String text) {
		
		int list = text.length();
		String result = "" ;
		
		for (int i = 0; i < list; i++ ) {
			
			if (text.charAt(i) == ' ') {
				if (i == 0) {
					if(text.charAt(i+1) == ' ') {
						
						result = result+text.charAt(i);

					}
				}
				
				else if (i == text.length()-1) {
					if(text.charAt(i-1) == ' ') {
						result = result + text.charAt(i) ;
					}
				}
				
				else if(text.charAt(i+1) == ' ' || text.charAt(i-1)== ' ') {
					result = result + text.charAt(i);
				}
				
				else {System.out.println("Espace supprimé");}
			}
			
			else {
				result=result + text.charAt(i);
			}
		}
		
		return result;
	}
}
