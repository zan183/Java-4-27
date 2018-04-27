package no1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class ShowLocal extends ActionSupport {
	Locale[] loc;
    Map<String,String> locMaps = new HashMap<String, String>();
    
	public Map<String, String> getLocMaps() {
		return locMaps;
	}

	public Locale[] getLoc() {
		return loc;
	}

	public void setLoc(Locale[] loc) {
		this.loc = loc;
	}
	@Override
	public String execute(){
		loc = Locale.getAvailableLocales();
		for(Locale l:loc)
		{
			//""+l把l转换城字符串类型
			locMaps.put(l.getLanguage()+"_"+l.getCountry(), l.getDisplayName(l));
//			locMaps.put(""+l.getDefault(), l.getDisplayName(l));
		}
		return SUCCESS;
	}
}
