package com.gupao.edu.cx.study.design.factory.method;

import org.junit.Test;

import static org.junit.Assert.*;

public class ICourseFactoryTest {

    @Test
    public void createCourse1() {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        assertEquals(iCourseFactory.createCourse().getCourseName(),"java");
    }

    @Test
    public void createCourse2() {
        ICourseFactory iCourseFactory = new PythonCourseFactory();
        assertEquals(iCourseFactory.createCourse().getCourseName(),"python");
    }
}
