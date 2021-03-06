
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.core.service;

import java.util.List;

import com.delmar.core.model.Table;
import com.delmar.core.model.TableColumn;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-01-09 10:48:25
 */
public interface TableService extends CoreService<Table> {

	/**
	 * @param ids
	 */
	void deleteTables(Integer[] ids);

	/**
	 * @param table
	 * @param columns
	 * @return
	 */
	Table saveTable(Table table, List<TableColumn> columns);



}