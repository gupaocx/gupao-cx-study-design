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

# 二、单例模式
## 饿汉式单例
- 特点  
类加载时就会实例化一个全局唯一的对象
- 缺点  
1. 正因为类加载的时候就会实例化一个全局唯一的对象，会造成资源浪费（因为可能用不到这个对象）
## 懒汉式单例
- 特点  
与饿汉式相反，等到使用时才实例化对象
- 缺点  
1. 利用了synchronized保证只实例化一个对象，降低了性能
## 静态内部类单例
- 特点    
1. 利用静态内部类只有类加载的时候，内部类才会被实例化的特性，来创建实例化对象
2. 此种方法比较高效
## 注册式单例
- 特点  
利用容器去存储（与spring中的单例是一致的）
## ThreadLocal(线程内单例)
- 特点  
利用ThreadLocal来保证每个线程中的对象只有一个
## 单例的破坏方式以及如何预防
- 使用反射破坏单例  
  - 使用反射方式强制实例化对象  
  ~~~
  Class<?> clazz = LazyInnerClassSingleton.class;
  Constructor c = clazz.getDeclaredConstructor(null);
  c.setAccessible(true);
  Object o1 = c.newInstance();
  Object o2 = c.newInstance();
  System.out.println(o1 == o2);
  ~~~
  - 解决方法 无参构造中添加判断，并做异常处理 
  ```
  private LazyInnerClassSingleton(){
      if(LazyHolder.LAZY != null){
         throw new RuntimeException("不允许创建多个实例");
      }
  }
  ```
- 使用序列化破坏单例
  - 使用序列化反序列化来实例化对象
  ``` java
  public class SeriableSingletonTest {
      public static void main(String[] args) {
          SeriableSingleton s1 = null;
          SeriableSingleton s2 = SeriableSingleton.getInstance();
          FileOutputStream fos = null;
          try {
              fos = new FileOutputStream("SeriableSingleton.obj");
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(s2);
              oos.flush();
              oos.close();
              FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
              ObjectInputStream ois = new ObjectInputStream(fis);
              s1 = (SeriableSingleton)ois.readObject();
              ois.close();
              System.out.println(s1);
              System.out.println(s2);
              System.out.println(s1 == s2);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
  }
  ```
  
  - 解决方法(重写readResolve方法)
  ```
  private  Object readResolve(){
      return  INSTANCE;
  }
  ```

# 三、原型模式

## 适用场景
1. 类初始化消耗性资源较多
2. new产生的一个对象需要非常繁琐的过程（数据准备、访问权限）
3. 构造函数比较复杂
4. 循环体里生产大量对象时，可读性下降
## 优点
1. 原型模式比直接new对象性能搞
2. 简化了创建过程
## 缺点  
1. 必须配备克隆方法
2. 对clone出的对象进行复杂改造风险性很大

# 四、 代理模式
## 作用  
保护目标对象和增强目标对象，降低耦合
## 缺点
造成请求处理变慢以及增加系统的复杂性
## 思考题
为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？  
因为在class文件中，这些个数都是用4位16进制表示的，所以最大值是2的16次方-1 

