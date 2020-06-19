import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //1.put()添加指定的k-v到Map中
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        map.put("发表时间","1918年");
        //2.int size()返回键值对的数量
        System.out.println(map.size());
        //3.判断是否为空
        System.out.println(map.isEmpty());
        //4.v get(Object k)根据指定的k查找对应的v
        String title = map.get("标题");
        System.out.println(title);
        //5.v getOrDefault(Object k,v defaultvalue)根据指定的k查找对应放入v,没有找到用默认值代替
        System.out.println(map.getOrDefault("内容","精彩"));
        //6.containsKey(Object key)判断是否包含key
        System.out.println(map.containsKey("作者"));
        //7.containsValue(Object value)判断是否包含value
        System.out.println(map.containsValue("鲁迅"));
        //8.Set<Map.Entry<k,v>> entrySet()返回所有键值对
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println(entry);
        }

    }
}
