package java;
import java.util.*;
public class Map {
	public static void main(String []args) 
	{

	Map<Integer,String> hm=new HashMap<>();
	hm.put(1,"raj");
	hm.put(2,"rathi");
	hm.put(3,"rama");
	for(Map.Entry<Integer,String>mm:hm.entrySet())
			{
				System.out.println(mm.getKey()+""+mm.getValue());
			}
			Map<Integer,String> hm1=new HashMap<>();
			hm1.put(1,"arun");
			hm1.put(2,"shiva");
			hm1.put(3,"arvind");
			hm1.forEach((k,v)->System.out.println(k+""+v));
			
			Set<Entry<Integer,String>>s=hm.entryset();
			Iterator<Entry<Integer,String>>i=s.iterator();
			while(i.hasNext()) {
				Map.Entry<Integer,String>me=(map.Entry<Integer,String>)i.next();
				System.out.println(me.getKey()+""+me.getValue());
			}
			List<String>l=new ArrayList<>();
			l.add("apple");
			l.add("orange");
			l.add("grapes");
			l.forEach(System.out::println);
			l.forEach(ff->System.out.println(ff));
			l.stream().forEachOrdered(ss->System.out.println(ss));
			l.stream().forEachOrdered(System.out::println);
			
	}

}
