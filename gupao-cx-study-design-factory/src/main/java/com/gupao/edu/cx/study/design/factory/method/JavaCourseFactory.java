package com.gupao.edu.cx.study.design.factory.method;

import com.gupao.edu.cx.study.design.factory.product.ICourse;
import com.gupao.edu.cx.study.design.factory.product.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new JavaCourse();
    }
}
