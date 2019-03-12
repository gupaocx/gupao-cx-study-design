# 一、工厂模式
## a.简单工厂模式
简单工厂模式是由一个工厂类通过传入参数，来构造对应的实例，简单工厂模式是不符合开闭原则的
![image](https://github.com/gupaocx/gupao-cx-study-design/blob/master/uml/factory/simple/CourseFactory.gif)
## b.工厂方法模式
工厂模式是由一个抽象工厂类提供创建实例的接口，然后由具体实例对应的工厂创建对应的实例
![image](https://github.com/gupaocx/gupao-cx-study-design/blob/master/uml/factory/method/ICourseFactory.gif)
## c.抽象工厂模式
抽象工厂模式是指声明一个接口，用于创建一系类产品或者具有依赖关系的实例，而不需要明确具体类
![image](https://github.com/gupaocx/gupao-cx-study-design/blob/master/uml/factory/abstract/AuthFactory.png)

# 二、原型模式