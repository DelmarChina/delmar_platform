/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                               * 
 * email:liua@delmarchina.com						                              *
 *****************************************************************************/
package com.delmar.base.web.displaytag.decorator;

import javax.servlet.jsp.PageContext;

import org.displaytag.decorator.DisplaytagColumnDecorator;
import org.displaytag.exception.DecoratorException;
import org.displaytag.properties.MediaTypeEnum;

import com.delmar.core.web.bean.EaContext;
import com.delmar.sys.model.User;
import com.delmar.sys.service.UserService;

/**
 * @author 刘大磊 2015年3月10日 下午4:10:40
 */
public class UserDecorator  implements DisplaytagColumnDecorator {
	private UserService userService=EaContext.getBean("userService", UserService.class);
	/* (non-Javadoc)
	 * @see org.displaytag.decorator.DisplaytagColumnDecorator#decorate(java.lang.Object, javax.servlet.jsp.PageContext, org.displaytag.properties.MediaTypeEnum)
	 */
	@Override
	public Object decorate(Object arg0, PageContext arg1, MediaTypeEnum arg2)
			throws DecoratorException {

		if(arg0!=null)
		{
			Integer value=(Integer)arg0;
			StringBuilder sb=new StringBuilder("");
			User user=userService.selectByPrimaryKey(value);
			if(user!=null)
			{
				return user.getName();
			}
			else
			{
				return null;
			}
		}
		
		
		return null;
	}

}
