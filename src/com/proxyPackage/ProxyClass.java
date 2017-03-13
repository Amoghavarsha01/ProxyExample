package com.proxyPackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

import com.mainClassPackage.MainClass;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

public class ProxyClass {
	public static <T> T  getProxyInstance(Class<T> clazz){
		SampleInvocationHandler sampleInvocationHandler = new SampleInvocationHandler();
		T proxy = (T)Proxy.newProxyInstance(ProxyClass.class.getClassLoader(), new Class[]{clazz}, sampleInvocationHandler);
		return proxy;
	}
	
	private static class SampleInvocationHandler implements InvocationHandler {
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("Inside SampleInvocationHandler invoke method!!!!");
			long minuteOfTheDay = Calendar.getInstance().getTimeInMillis();
			System.out.println(minuteOfTheDay);
			if(minuteOfTheDay % 2 == 0){
				System.out.println(minuteOfTheDay);
				MainClass mainClass = new MainClass(10,101,10);
				return mainClass.getEmployeeRetirementYear();
			}
			else{
				return getRetirementYear();
			}
			
		}
	}
	
	private static int getRetirementYear(){
		return 50;
	}
}
