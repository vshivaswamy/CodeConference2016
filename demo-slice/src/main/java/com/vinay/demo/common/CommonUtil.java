package com.vinay.demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {

	@Autowired
	SomeCommonServiceImpl someCommonServiceImpl;

	// All other packages can call this method
	public void publicMethod() {
		someCommonServiceImpl.someServiceA(true);
	}

	// Accessible to all within common package and its subclasses
	protected void protectedMethod() {
		someCommonServiceImpl.someServiceA(false);
		privateMethod();
	}

	// Accessible only within common package
	void defaultMethod() {
		someCommonServiceImpl.someServiceA(false);
		privateMethod();
	}

	// Accessible only within this class
	private void privateMethod() {
		someCommonServiceImpl.methodB();
	}
	
	public String generateNumber(){
		String number = "";
		double d;
        for (int i = 1; i <= 16; i++) {
            d = Math.random() * 10;
            number = number + ((int)d);
            if (i % 4 == 0 && i != 16) {
            	number = number + "-";
            }
        }
		
		return number;
	}
}
