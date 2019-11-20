package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.println("This is for south INDIAN");

	}
	private void northIndia() {
		System.out.println("This is for North INDIAN");

	}
	public static void main(String[] args) {
			StateDetails st=new StateDetails();
			LanguageInfo li=new LanguageInfo();
			
			st.southIndia();
			st.northIndia();
			li.tamilLanguage();
			li.englishLanguage();
			li.hindiLanguage();
	}

}
