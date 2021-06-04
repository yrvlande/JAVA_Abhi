package javaRevision2017.customAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestCustomAnnotation {
	
	@TestDetails(author = "Yash", description = "desc", group = {"a", "b"})
	public void method1 () {
		
	}
	
	
	
	public static void main(String args[]) {
		Class c1 = TestCustomAnnotation.class;
		Method[] m = c1.getMethods();
		for (Method m1 : m) {
			//System.out.println(m1);
			if (m1.getName().equals("method1")) {
				Annotation[] ann = m1.getAnnotations();
				System.out.println(ann[0].annotationType().getMethods()[0].getName());
			}
		}
	}

}
