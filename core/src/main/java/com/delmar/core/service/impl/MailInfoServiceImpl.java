/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delmar.core.dao.MailInfoDao;
import com.delmar.core.model.MailInfo;
import com.delmar.core.service.MailInfoService;
import com.delmar.core.dao.CoreDao;
import com.delmar.core.service.impl.CoreServiceImpl;

/**
 * @author 刘大磊 22015-03-25 09:20:22
 */
@Service("mailInfoService")
public class MailInfoServiceImpl extends CoreServiceImpl<MailInfo> implements
		MailInfoService {
	@Autowired
	private MailInfoDao mailInfoDao;
	/* (non-Javadoc)
	 * @see CoreService.CoreServiceImpl#getCoreDao()
	 */
	@Override
	protected CoreDao<MailInfo> getCoreDao() {
		return mailInfoDao;
	}
	public void deleteMailInfoList(Integer[] ids)
	{
		if(ids!=null)
		for(Integer id:ids)
		{
			mailInfoDao.deleteByPrimaryKey(id);
		}
	}
	
	public List<MailInfo> getPendingMail()
	{
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("accessString", " beFinish=0 ");
		
		return this.selectByExample(param);
	}
	
	public void updateMailFinishStatus(Integer id)
	{
		mailInfoDao.updateMailFinishStatus(id);
	}
	
}
