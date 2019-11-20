package org.lang;

//LanguageInfo and StateDetails  inside the StateDetails class and call both classes methods

/*LanguageInfo is first class and StateDetails is second class and both are in same package. 
If you want to access both the class methods in StateDetails class first you need to change the
LanguageInfo class methods to public by default in eclispe it is private. Once changed to public
only you can able to access the LanguageInfo class in StateDetails otherwise you con't access it*/  

public class LanguageInfo {
		
	public void tamilLanguage() {
		System.out.println("TAMIL LANGUAGE");

	}

	public void englishLanguage() {
		System.out.println("ENGLISH LANGUAGE");

	}

	public void hindiLanguage() {
		System.out.println("HINDI LANGUAGE");

	}

}
