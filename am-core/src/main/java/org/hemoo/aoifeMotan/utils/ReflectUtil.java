package org.hemoo.aoifeMotan.utils;

import org.hemoo.aoifeMotan.agency.CustomInvocationHandler;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;


/**
 * Created by sunjiawei on 2017/4/12.
 */
public class ReflectUtil  {

//    private String name ="jiawei sun";

    public void getName(){
        System.out.println("first method");
    }
    public int cal(int a, int b){
        System.out.print("相加结果："+(a+b));
        return a+b;
    }

    // 修改数组大小
    public static Object arrayInc(Object obj, int len) {
        Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr, len);
        int co = Array.getLength(obj);
        System.arraycopy(obj, 0, newArr, 0, co);
        return newArr;
    }
    // 打印
    public static void print(Object obj) {
        Class<?> c = obj.getClass();
        if (!c.isArray()) {
            return;
        }
        System.out.println("数组长度为： " + Array.getLength(obj));
        for (int i = 0; i < Array.getLength(obj); i++) {
            System.out.print(Array.get(obj, i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws  Exception{


        //10.0. 通过反射取得并修改数组的信息和数组大小
//        int[] temp = { 1, 2, 3, 4, 5 };
//        Class<?> demo = temp.getClass().getComponentType();
//        System.out.println("数组类型： " + demo.getName());
//        System.out.println("数组长度  " + Array.getLength(temp));
//        System.out.println("数组的第一个元素: " + Array.get(temp, 0));
//        Array.set(temp, 0, 100);
//        System.out.println("修改之后数组第一个元素为： " + Array.get(temp, 0));

        //10.1.通过反射取得并修改数数组大小
        int[] temp = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] newTemp = (int[]) arrayInc(temp, 15);
        print(newTemp);
        String[] atr = { "a", "b", "c" };
        String[] str1 = (String[]) arrayInc(atr, 8);
        print(str1);

/**
        //9. 在泛型为Integer的ArrayList中存放一个String类型的对象。
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, "Java反射机制实例。");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // 8.动态代理
         ReflectUtil reflectUtil = new ReflectUtil();
        String name = reflectUtil.getClass().getClassLoader().getClass().getName();
        System.out.println("类加载器： "+name);
        CustomInvocationHandler demo = new CustomInvocationHandler();
//        Subject sub = (Subject) demo.bind(new RealSubject()); //subject项目接口，RealSubject()项目真实类，实现项目接口
//        String info = sub.say("Rollen", 20);
//        System.out.println(info);

         *
         Class<?>  one = Class.forName("org.hemoo.aoifeMotan.utils.ReflectUtil");
        //7. 通过反射操作one类中的属性
        Object obj = one.newInstance();
        // 可以直接对 name 的属性赋值
        Field field = one.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "Java反射机制");
        System.out.println(field.get(obj));

        //6.通过反射操作one类的方法
        // 调用TestReflect类中的reflect1方法
        Method method = one.getMethod("getName");
        method.invoke(one.newInstance());
        // Java 反射机制 - 调用某个类的方法1.
        // 调用TestReflect的reflect2方法
        method = one.getMethod("cal", int.class, int.class);
        method.invoke(one.newInstance(), 20, 3);

        //5.获取某类的全部方法
        Method[] xx = one.getMethods();
        for (Method m:xx){
            Class<?> returnType = m.getReturnType();//获取返回类型
            Class<?> para[] = m.getParameterTypes();//所有参数类型
            int temp = m.getModifiers();//权限修饰符
            System.out.println("返回类型："+returnType.getName()+" ,权限修饰符："+Modifier.toString(temp)+".");
        }

        //4.获取某类的全部属性
        Field[] xx = one.getDeclaredFields();//获取one类的所有属性
        for (Field f: xx){
            int mo = f.getModifiers();//权限修饰符
            String priv = Modifier.toString(mo);
            Class<?> ftype = f.getType();
            if (ftype == Date.class)
            {
                System.out.println("该类是日期类型");
            }
            System.out.println("属性权限修饰符: "+priv+" ，属性类型："+ftype.getName());
        }
        Field[] parentxx = one.getFields();//获取one类父类或者实现接口的所有属性


        //3.获取one类的父类和接口
        Class<?> superOne = one.getSuperclass();//获取one类的父类
        Class<?> impleOne[] = one.getInterfaces();//获取one类的接口


        //2. 实例化CLASS对象
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("org.hemoo.aoifeMotan.utils.ReflectUtil");
        class2 = new ReflectUtil().getClass();
        class3 = ReflectUtil.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());


        //1.获取当前类的包名和类名
        ReflectUtil reflect = new ReflectUtil();
        String result = reflect.getClass().getName();
        System.out.println("run time: "+result);
         **/
    }
}
