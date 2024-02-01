package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void C1TC2TC3TC4T(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.EQUILATERAL.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void C1TC2FC3FC4F(){
        int a = 2;
        int b = 3;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.SCALENE.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
 
	@Test
	public void C1TC2FC3FC4T(){
	    int a = 2;
	    int b = 3;
	    int c=3;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.ISOSCELES.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	@Test
	public void C1TC2FC3TC4F(){
	    int a = 3;
	    int b = 2;
	    int c=3;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.ISOSCELES.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	@Test
	public void C1TC2TC3FC4F(){
	    int a = 3;
	    int b = 3;
	    int c=2;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.ISOSCELES.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	
	
	@Test
	public void C1FC2FC3FC4F(){
	    int a = 2;
	    int b = 3;
	    int c=6;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.NOT_TRIANGLE.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2FC3FC4T(){
	    int a = 7;
	    int b = 3;
	    int c=3;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.NOT_TRIANGLE.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2FC3TC4F(){
	    int a = 3;
	    int b = 7;
	    int c=3;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.NOT_TRIANGLE.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2TC3FC4F(){
	    int a = 3;
	    int b = 3;
	    int c=7;
	    triangle.classifyTriangle(a,b,c);
	    String expected =Triangle_Types.NOT_TRIANGLE.toString();
	    String result = triangle.get_type().toString();
	    assertEquals(expected, result.toString());
	}
}  