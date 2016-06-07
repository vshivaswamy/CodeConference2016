package com.vinay.demo.common;

import org.springframework.stereotype.Component;

@Component
class SomeCommonServiceImpl implements SomeCommonService {

	@Override
	public void someServiceA(boolean flag) {
		if(flag)
			methodA();
		else
			methodB();
	}

	private void methodA() {
		System.out.println("Method A called");
	}

	void methodB() {
		System.out.println("Method B called");
	}
}
