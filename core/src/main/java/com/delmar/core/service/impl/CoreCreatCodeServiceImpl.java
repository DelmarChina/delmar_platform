/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.core.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delmar.core.dao.CoreCreatCodeDao;
import com.delmar.core.dao.CoreDao;
import com.delmar.core.model.CoreCreatCode;
import com.delmar.core.service.CoreCreatCodeService;

/**
 * @author 刘大磊 22015-07-31 10:10:10
 */
@Service("coreCreatCodeService")
public class CoreCreatCodeServiceImpl extends CoreServiceImpl<CoreCreatCode> implements
		CoreCreatCodeService {
	@Autowired
	private CoreCreatCodeDao coreCreatCodeDao;
	/* (non-Javadoc)
	 * @see CoreService.CoreServiceImpl#getCoreDao()
	 */
	@Override
	protected CoreDao<CoreCreatCode> getCoreDao() {
		return coreCreatCodeDao;
	}
	public void deleteCoreCreatCodeList(Integer[] ids)
	{
		if(ids!=null)
		for(Integer id:ids)
		{
			coreCreatCodeDao.deleteByPrimaryKey(id);
		}
	}
	
	
	
	public Integer getMaxValue(String code, Integer clientId)
	{
		Integer maxValue=coreCreatCodeDao.getMaxValue(code,clientId);
		if (maxValue==null)
		{
			CoreCreatCode coreCreatCode=new CoreCreatCode();
			coreCreatCode.setClientId(clientId);
			coreCreatCode.setCode(code);
			coreCreatCode.setMaxvalue(10000);
			
			coreCreatCodeDao.insert(coreCreatCode);
			maxValue=10000;
		}
		else
		{
			CoreCreatCode coreCreatCode=new CoreCreatCode();
			coreCreatCode.setClientId(clientId);
			coreCreatCode.setCode(code);
			coreCreatCode.setMaxvalue(maxValue+1);
			
    		coreCreatCodeDao.updateMaxValue(coreCreatCode);
		}
		
		
		return maxValue;
		
	}
	
	
	public void updateMaxValue(CoreCreatCode coreCreatCode)
	{
		coreCreatCodeDao.updateMaxValue(coreCreatCode);
	}

}
