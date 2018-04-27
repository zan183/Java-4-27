package international;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class i18n {
	//java中得到记录器logger
   private final static Logger logger = LoggerFactory.getLogger(i18n.class); 
	public static void main(String[] args) {
		// WithArg();
//		locale();
		// WithTime();
		getAllLocs();

	}

	public static void locale() {
		// Locale loc = Locale.getDefault();
		// //显示的是控制面板里面语言
		// System.out.print(loc);
		Locale loc = new Locale("en", "US");
		// 如没有en_US配置文件则从当前语言和当前地区的文件显示，有的話直接显示
		ResourceBundle bundle = ResourceBundle.getBundle("international.msg", loc);
		String id = bundle.getString("id");
		System.out.print(id);
	}

	public static void placebydefine() {
		// 第一个参数：包名+基名（不用写语言和地区）
		ResourceBundle bundle = ResourceBundle.getBundle("international.msg");
		String info = bundle.getString("info");
		String info1 = MessageFormat.format(info, 1L, "王五");
		System.out.print(info1);
	}

	// 带有自定义参数的传递
	public static void WithArg() {
		String info = "学号:{0},姓名：{1}";
		String res = MessageFormat.format(info, "001", "李小");
		System.out.print(res);
	}

	// 带有時間参数的传递
	public static void WithTime() {
		// {0,date,full}:日期是2018年4月1日 星期日
		// {0,date}:日期是2018-4-1
		String info = "时间是{0,time},日期是{0,date}";
		String res = MessageFormat.format(info, new Date());
		System.out.print(res);
	}
	public void inCn(){
//	    out.println("学号");
//	    out.println("信息");
//		logger.error("学号");
//		logger.error("姓名");
	}
	public static void getAllLocs(){
	    Locale[] locs=Locale.getAvailableLocales();
	    for(Locale loc:locs){
//	    	   out.println(loc.getDisplayName(loc));  
	      logger.debug("loc is {}",loc.getDisplayName(loc));      
	    }
	  }
}
