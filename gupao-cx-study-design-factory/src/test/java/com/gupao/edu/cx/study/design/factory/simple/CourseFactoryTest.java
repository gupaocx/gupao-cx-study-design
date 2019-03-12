package com.gupao.edu.cx.study.design.factory.simple;

import com.gupao.edu.cx.study.design.factory.product.ICourse;
import com.gupao.edu.cx.study.design.factory.product.JavaCourse;
import org.junit.Test;

import static org.junit.Assert.*;


public class CourseFactoryTest {

    @Test
    public void createCourse() {
        ICourse course = CourseFactory.createCourse(JavaCourse.class);
        assertEquals(course.getCourseName(),"java");
    }
}
