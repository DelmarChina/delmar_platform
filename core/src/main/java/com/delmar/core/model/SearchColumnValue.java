/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                               * 
 * email:liua@delmarchina.com						                              *
 *****************************************************************************/
package com.delmar.core.model;

/**
 * @author 刘大磊 2015年1月15日 下午3:45:59
 */
public class SearchColumnValue {
	public SearchColumnValue()
	{
		
	}
	
	public SearchColumnValue(String relOper,String value,String link,SearchColumn searchColumn)
	{
		this.relOper=relOper;
		this.value=value;
		this.link=link;
		this.searchColumn=searchColumn;
	}
	
	private String relOper;
	private String value;
	private String showValue;
	private String link;// or and
	private SearchColumn searchColumn;
	private Integer searchColumnId;
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null) return false;
		if(!(obj instanceof SearchColumnValue))return false;
		
		
		SearchColumnValue scv=(SearchColumnValue)obj;
		boolean result=(relOper==scv.relOper||relOper!=null&&relOper.equals(scv.relOper))
				&&(value==scv.value||value!=null&&value.equals(scv.value))
				&&(link==scv.link||link!=null&&link.equals(scv.link))
				&&(searchColumnId==scv.searchColumnId||searchColumnId!=null&&searchColumnId.equals(scv.searchColumnId));
		
		return result;
		//return ;
	}
	
	public SearchColumn getSearchColumn() {
		return searchColumn;
	}
	public void setSearchColumn(SearchColumn searchColumn) {
		this.searchColumn = searchColumn;
	}
	public String getRelOper() {
		return relOper;
	}
	public void setRelOper(String relOper) {
		this.relOper = relOper;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public Integer getSearchColumnId() {
		return searchColumnId;
	}

	public void setSearchColumnId(Integer searchColumnId) {
		this.searchColumnId = searchColumnId;
	}

	public String getShowValue() {
		return showValue;
	}

	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}
}
