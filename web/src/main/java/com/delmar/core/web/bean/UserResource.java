/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                               * 
 * email:liua@delmarchina.com						                              *
 *****************************************************************************/
package com.delmar.core.web.bean;

import java.util.Locale;
import java.util.ResourceBundle;

import com.delmar.utils.ResourceMessage;

/**
 * @author 刘大磊 2015年2月3日 上午11:06:45
 */
public class UserResource {
	private 	 ResourceBundle bundle=null;
	private Locale locale;
	/**
	 * 
	 */
	public UserResource(Locale locale) {
		
		this.locale=locale;
		bundle=ResourceBundle.getBundle(ResourceMessage.BUNDLENAME,locale);

	}
	


	public String get(String key)
	{
		
		try
		{
		  return bundle.getString(key);
		} catch (Exception e)
		{
		  return "";  	
		}
	}
	public Locale getLocaleObj()
	{
		return locale;
	}
	
	public String getLocale()
	{
		String localeStr=locale.toString();
	    String parts[] = localeStr.split("_");
	    if (parts.length == 1) return parts[0];
	    else if (parts.length == 2)
	    {
	      if(parts[1].equalsIgnoreCase("HANS")){
	         
	         return parts[0]+"_"+"CN";
	      }
	      else{
    	      return parts[0]+"_"+parts[1];
	      }
	    }
	    else if (parts.length == 3 && parts[1].equalsIgnoreCase("HANS"))
	    {
	    	return parts[0]+"_"+parts[2];
	    }
	    else 
	    {
	    	return localeStr;
	    }
	  }		

	
}
