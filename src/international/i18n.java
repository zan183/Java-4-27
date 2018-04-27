package international;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class i18n {
	//java�еõ���¼��logger
   private final static Logger logger = LoggerFactory.getLogger(i18n.class); 
	public static void main(String[] args) {
		// WithArg();
//		locale();
		// WithTime();
		getAllLocs();

	}

	public static void locale() {
		// Locale loc = Locale.getDefault();
		// //��ʾ���ǿ��������������
		// System.out.print(loc);
		Locale loc = new Locale("en", "US");
		// ��û��en_US�����ļ���ӵ�ǰ���Ժ͵�ǰ�������ļ���ʾ���е�Ԓֱ����ʾ
		ResourceBundle bundle = ResourceBundle.getBundle("international.msg", loc);
		String id = bundle.getString("id");
		System.out.print(id);
	}

	public static void placebydefine() {
		// ��һ������������+����������д���Ժ͵�����
		ResourceBundle bundle = ResourceBundle.getBundle("international.msg");
		String info = bundle.getString("info");
		String info1 = MessageFormat.format(info, 1L, "����");
		System.out.print(info1);
	}

	// �����Զ�������Ĵ���
	public static void WithArg() {
		String info = "ѧ��:{0},������{1}";
		String res = MessageFormat.format(info, "001", "��С");
		System.out.print(res);
	}

	// ���Еr�g�����Ĵ���
	public static void WithTime() {
		// {0,date,full}:������2018��4��1�� ������
		// {0,date}:������2018-4-1
		String info = "ʱ����{0,time},������{0,date}";
		String res = MessageFormat.format(info, new Date());
		System.out.print(res);
	}
	public void inCn(){
//	    out.println("ѧ��");
//	    out.println("��Ϣ");
//		logger.error("ѧ��");
//		logger.error("����");
	}
	public static void getAllLocs(){
	    Locale[] locs=Locale.getAvailableLocales();
	    for(Locale loc:locs){
//	    	   out.println(loc.getDisplayName(loc));  
	      logger.debug("loc is {}",loc.getDisplayName(loc));      
	    }
	  }
}
