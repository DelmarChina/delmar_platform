/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                   *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                           *
 *****************************************************************************/
package com.delmar.core.dao.mybatis;

import org.springframework.stereotype.Repository;

import com.delmar.core.dao.IdrelatedinfoDao;
import com.delmar.core.model.Idrelatedinfo;

/**
 * @author 刘大磊 2014年12月18日 下午8:21:06
 */
@Repository("idrelatedinfoDao") 
public class IdrelatedinfoDaoMyBatis extends CoreDaoMyBatis<Idrelatedinfo>		implements IdrelatedinfoDao {
	private static final String SQLNAME="com.delmar.core.dao.IdrelatedinfoMapper";
	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {

		return SQLNAME;
	}



}
