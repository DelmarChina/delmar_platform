/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                               * 
 * email:liua@delmarchina.com						                              *
 *****************************************************************************/
package com.delmar.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.delmar.core.service.LanguageService;
import com.delmar.utils.DmLog;

/**
 * @author 刘大磊 2015年7月28日 上午11:20:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AdviceExceptionTest {
	DmLog log=DmLog.getLogger(AdviceExceptionTest.class);
	@Autowired
	LanguageService peopleService;
	@Test
	public void testAdviceException()
	{
		log.debug("test begin");
		try
		{
		peopleService.update(null);
		}
		catch(Exception e)
		{
			
		//	log.error(e.getMessage(), e);
		}
		log.debug("test end");
	}
}
