package list;

import java.util.ArrayList;
import java.util.Locale;

public class List {

	public static void main(String[] args) {
//		ArrayList nums=new ArrayList();
//		nums.add("1");
//		nums.add("2");
//		String[] r={"3","4"};
//		nums.add(r);
////		org.hsqldb.server.Server.main(new String[0]);
//		System.out.print(nums);
		
		ArrayList<String[]> n1 = new ArrayList<String[]>();
		String[] row1={"zhangsan","1233","man"};
		n1.add(row1);
		String[] row2={"lisi","569","woman"};
		n1.add(row2);
		for(String[] r1:n1){
			System.out.println(r1[0]);
		}
		
		Locale[] locs = Locale.getAvailableLocales();
		for(Locale loc:locs){
//			用该国语言子显示国家名
//			System.out.println(loc.getDisplayCountry(loc));
			System.out.println(loc.getDisplayCountry());
		}
		
		
	}

}
