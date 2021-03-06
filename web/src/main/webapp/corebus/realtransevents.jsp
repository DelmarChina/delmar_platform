<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<link rel="Stylesheet" href="../css/displaytag.css" type="text/css" />
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
  <script type='text/javascript' src='../js/ea.effect.js'></script>
    <script type='text/javascript' src='../js/ea.validate.js'></script>
<title><delmar:message key="realtransevent.title" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body >

<s:form action="ratemaster_list" namespace="/rate"  theme="simple" >
<table width="100%" border="0" cellspacing="0" cellpadding="5">

<tr>
<td>
<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig"><delmar:message key="realtransevent.location" /></td>
          <td class="navig" align="right"> 
          <table id="normalQuery" cellpadding="0" cellspacing="0" border="0">
              <tr> 
                <td >
                
                  <input type="button"  value="<delmar:message key="common.button.search" />"  class="input_submit">
                  <delmar:operatePriv operator="create">
                  <s:submit method="create" cssClass="input_submit"  value="%{#session.resource.get('common.button.create')}" ></s:submit>
                  </delmar:operatePriv>
                  <delmar:operatePriv operator="delete">
                  <s:submit method="deletes" cssClass="input_submit"  value="%{#session.resource.get('common.button.delete')}"   onclick="return confirmListDelete('ids')"></s:submit>
                  </delmar:operatePriv>
                 </td>
              </tr>
            </table></td>
         
        </tr>
      </table> 

<!-- <c:out value="${buttons}" escapeXml="false"/> -->
 <display:table name="sessionScope.MAP_KEY_OF_SESSION.ratemasterList" cellspacing="0" cellpadding="0"  requestURI=""
		    id="list" pagesize="20" class="table" export="true">
		
		<delmar:operatePriv operator="delete">
		<display:column style="width:30px;text-align:center" title="<input type='checkbox' name='selectall' onClick='selectAll(\"ids\",this);' style='margin:0px;'/>" media="html">
		
		<input type="checkbox" name="ids"
				value="<c:out value='${list.id}'/>" style='border: none' />
				
		</display:column>
		</delmar:operatePriv>
		    
		<display:column  titleKey="common.label.sequence" media="html csv excel xml pdf rtf">
			   <c:out value="${list_rowNum}"/>
    	</display:column>
		     <display:column   titleKey="ratemaster.column.rateno" sortable="true"   media="html">
		      <a href="javascript:viewExport('<c:out value="${list.id}"/>')"><c:out value="${list.rateno}"/>
     		  </a>
		     </display:column>
		     <display:column property="rateno"  escapeXml="true"  titleKey="ratemaster.column.rateno" sortable="true" media="csv excel xml pdf rtf"></display:column>	
		     <display:column property="mode"  escapeXml="true"  titleKey="ratemaster.column.mode" sortable="true"></display:column>	
		    <display:column property="baseCarrierId"  escapeXml="true"  titleKey="ratemaster.column.carrier" sortable="true" decorator="com.delmar.base.web.displaytag.decorator.CarrierDecorator"></display:column>	
			<display:column property="commondity"  escapeXml="true"  titleKey="ratemaster.column.commondity" sortable="true"></display:column>		
			<display:column property="pol"  escapeXml="true"  titleKey="ratemaster.column.pol" sortable="true"  decorator="com.delmar.base.web.displaytag.decorator.PortDecorator"></display:column>		
			<display:column property="pod"  escapeXml="true"  titleKey="ratemaster.column.pod" sortable="true" decorator="com.delmar.base.web.displaytag.decorator.PortDecorator"></display:column>	
			<display:column property="poa"  escapeXml="true"  titleKey="ratemaster.column.poa" sortable="true" decorator="com.delmar.base.web.displaytag.decorator.PortDecorator"></display:column>	
			<display:column property="transtime"  escapeXml="true"  titleKey="ratemaster.column.transtime" sortable="true"></display:column>	
			<display:column property="frequence"  escapeXml="true"  titleKey="ratemaster.column.frequence" sortable="true"></display:column>	
		    <display:column property="created"  escapeXml="true"  titleKey="customer.column.created"  sortable="true"  decorator="com.delmar.core.web.displaytag.decorator.DateDecorator"/>
		    
		</display:table>
</td>
</tr>
</table>


</s:form>

<script type="text/javascript">
    function viewExport(id) {
       window.location='<c:url value="/crm/customer_edit.action"/>?id='+id;
    }
    highlightTableRows("list");
    
   
</script>

</body>
</html>
