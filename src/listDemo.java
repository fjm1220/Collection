import java.util.*;
public class listDemo {
    public static void main(String[] args) {
        //构造List对象
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //1.增：增加元素boolean add(E e)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(6);
        list2.add(7);
        //打印list中的元素
        System.out.println(list1);
        //2.指定位置添加元素
        list1.add(1,5);
        //3.尾插集合中的全部元素
        list1.addAll(list2);
        System.out.println(list1);
        //4.删：E remove(int index)删除指定位置元素
        list1.remove(1);
        System.out.println(list1);
        //5.boolean remove(Object o)删除遇到的第一个指定元素
        list1.remove(Integer.valueOf(7));
        System.out.println(list1);
        //6.查:E get(int index)获取下标index位置的元素
        int num = list1.get(2);
        System.out.println("index为2的元素为："+num);
        //7.改：E set(int index,E element)将下标index位置元素设为element
        list1.set(0,100);
        System.out.println("修改之后的集合元素"+list1);
        //8.集合中的元素个数size()
        System.out.println(list1.size());
        //9.判断指定元素是否在集合中boolean contains(Object o)
        System.out.println(list1.contains(100));
        //10.返回第一个o所在的下标int indexOf(Object o)
        System.out.println(list1.indexOf(100));
        //11.返回最后一个o所在的下标int lastindexOf(Object o)
        System.out.println(list1.lastIndexOf(100));
        //12.截取 List<E> subList(int start,int end)
        List<Integer> res = list1.subList(0,3);
        System.out.println(res);
        //13.构造新的集合
        List<Integer> list3 = new ArrayList<>(list2);
        System.out.println(list3);
        list2.set(1,8);
        System.out.println("list2:"+list2);
        System.out.println("list3:"+list3);
        //14.遍历List中的元素
        for(int n:list1)
        {
            System.out.println(n);
        }
    }
}
