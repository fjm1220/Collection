import java.util.Collection;
import java.util.ArrayList;
public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> list = new ArrayList<>();
        //1.add()将元素添加到集合中
        list.add("我");
        list.add("爱");
        list.add("Java");
        //2.size()返回集合中的元素个数
        System.out.println(list.size());
        //3.isEmpty()判断集合是否为空
        System.out.println(list.isEmpty());
        //4.remove(object e)删除集合中的元素e
        list.remove("爱");
        System.out.println(list.size());
        //5.toArray()返回一个装有所有集合元素的Object类型数组
        Object[] str = list.toArray();
        for(Object o:str)
        {
            System.out.println(o);
        }
        //forearch循环遍历集合中的元素
        for(String s:list)
        {
            System.out.println(s);
        }
        //6.clear()删除集合中的所有元素
        list.clear();
        System.out.println(list.size());
    }
}
