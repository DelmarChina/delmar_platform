/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.sys.dao;

import java.util.List;

import com.delmar.sys.model.Javabean;
import com.delmar.sys.model.Page;
import com.delmar.core.dao.CoreDao;

/**
 * @author 刘大磊 2015-01-13 09:38:51
 */
public interface JavabeanDao extends CoreDao<Javabean> {
	List<Javabean> selectJavabeanByPrivileges(Integer userId,String operator);
}
