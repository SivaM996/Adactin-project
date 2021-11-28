package com.testng.features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transform_class implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		//connect the annotation and retry analyser class
		annotation.setRetryAnalyzer(Retry.class);
	}

	
	
}
