package com.gupao.edu.cx.study.design.factory.simple;

import com.gupao.edu.cx.study.design.factory.product.ICourse;

public class CourseFactory {

    public static ICourse createCourse(Class clazz){
            try {
                if(null != clazz) {
                    return (ICourse) clazz.newInstance();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
    }

}
