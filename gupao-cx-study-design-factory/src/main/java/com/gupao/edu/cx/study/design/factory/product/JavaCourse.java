package com.gupao.edu.cx.study.design.factory.product;

import com.gupao.edu.cx.study.design.factory.product.ICourse;

public class JavaCourse implements ICourse {
    public String getCourseName() {
        return "java";
    }
}
