package no1;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class I18n {
  
	public static void main(String[] args) {
	       Properties properties = System.getProperties();
	        Iterator i = properties.entrySet().iterator();
	        while (i.hasNext()) {
	            Map.Entry entry = (Map.Entry) i.next();
	            Object key = entry.getKey();
	            Object value = entry.getValue();
	            System.out.println(key + "=" + value);
	        }
	 
	        System.out.println("===================");
	        Map map = System.getenv();
	        Iterator it = map.entrySet().iterator();
	        while (it.hasNext()) {
	            Entry entry = (Entry) it.next();
	            System.out.print(entry.getKey() + "=");
	            System.out.println(entry.getValue());
	        }
	        System.out.println("===================");
	        System.out.println(System.getProperty("catalina.home"));
	}
}
