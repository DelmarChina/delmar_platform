/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                   *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                           *
 *****************************************************************************/
package com.delmar.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.delmar.sys.dao.ClientDao;
import com.delmar.sys.dao.OrgDao;
import com.delmar.sys.model.Client;
import com.delmar.sys.model.Org;

/**
 * @author 刘大磊 2014年12月19日 上午11:16:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrgDaoTest {
	@Autowired
	OrgDao orgDao;
	@Autowired
	ClientDao clientDao;
	@Test
	public void testCase()
	{
		Client client=clientDao.selectByExample(null).get(0);
		Org org=new Org();
		org.setName("青岛德玛国际物流有限公司");
		org.setRemark("德玛集团青岛分公司");
		org.setValue("delarqd");
		org.setSysClientId(client.getId());
		//orgDao.save(org);
		System.out.println("orgid="+org.getId());
		org=new Org();
		org.setName("上海德玛国际物流有限公司");
		org.setRemark("德玛集团上海分公司");
		org.setValue("delarqd");
		org.setSysClientId(client.getId());
		//orgDao.save(org);
		
		System.out.println("orgid="+org.getId());
		
		
		
	
	}

}
