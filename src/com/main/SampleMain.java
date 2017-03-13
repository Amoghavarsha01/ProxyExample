package com.main;

import java.lang.reflect.Proxy;

import com.mainClassPackage.MainClass;
import com.mainClassPackage.MainInterface;
import com.proxyPackage.ProxyClass;

public class SampleMain {

	public static void main(String[] args) {
		MainInterface mainInterface = ProxyClass.getProxyInstance(MainInterface.class);
		mainInterface.getEmployeeRetirementYear();
	}

}
