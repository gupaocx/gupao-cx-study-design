package com.gupao.edu.cx.study.design.factory.method;

import com.gupao.edu.cx.study.design.factory.product.ICourse;
import com.gupao.edu.cx.study.design.factory.product.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new PythonCourse();
    }
}
