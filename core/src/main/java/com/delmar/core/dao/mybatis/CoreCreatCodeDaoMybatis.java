/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                                * 
 * email:liua@delmarchina.com						                               *
 *****************************************************************************/

package com.delmar.core.dao.mybatis;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.delmar.core.dao.CoreCreatCodeDao;
import com.delmar.core.model.CoreCreatCode;

/**
 * @author 刘大磊 2015-07-31 10:10:10
 */
@Repository("coreCreatCodeDao") 
public class CoreCreatCodeDaoMybatis extends CoreDaoMyBatis<CoreCreatCode> implements CoreCreatCodeDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.core.mybatis.sql.CoreCreatCodeMapper";
	}


	public void updateMaxValue(CoreCreatCode coreCreatCode)
	{
		sqlSessionTemplate.update(getSqlName()+".updateMaxValue",coreCreatCode);
	}
	
	public Integer getMaxValue(String code, Integer clientId)
	{
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("code",code);
		param.put("clientId", clientId);
		return sqlSessionTemplate.selectOne(getSqlName()+".getMaxValue",param);
	}
	

}
