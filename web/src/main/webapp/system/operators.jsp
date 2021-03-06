<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>


<link rel="stylesheet" href="<c:url value="/css/displaytag.css"/>" type="text/css" media="all"/>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css" media="all"/>
  <script type='text/javascript' src='<c:url value="/js/ea.effect.js"/>'></script>
    <script type='text/javascript' src='../js/ea.validate.js'></script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body >

<s:form action="operator_list" namespace="/system"  theme="simple" >
<table width="100%" border="0" cellspacing="0" cellpadding="5">

<tr>
<td>
<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig"><delmar:message key="operator.location" /></td>
          <td class="navig" align="right"> <table id="normalQuery" cellpadding="0" cellspacing="0" border="0">
              <tr> 
                <td >
                  
                  <s:submit method="create" cssClass="input_submit" value="%{#session.resource.get('common.button.create')}"></s:submit>
                  <s:submit method="deletes" cssClass="input_submit" value="%{#session.resource.get('common.button.delete')}"></s:submit>
                 </td>
              </tr>
            </table></td>
         
        </tr>
      </table> 

<!-- <c:out value="${buttons}" escapeXml="false"/> -->
 <display:table name="sessionScope.MAP_KEY_OF_SESSION.operatorList" cellspacing="0" cellpadding="0"  requestURI=""
		    id="list" pagesize="20" class="table" export="true">
		<display:column style="width:30px;text-align:center" title="<input type='checkbox' name='selectall' onClick='selectAll(\"ids\",this);' style='margin:0px;'/>" media="html" >
		<c:if test="${list.init=='N'}">
		<input type="checkbox" name="ids"
				value="<c:out value='${list.id}'/>" style='border: none' />
		</c:if>
		</display:column>    
		<display:column  media="html csv excel xml pdf rtf" titleKey="common.label.sequence">
			   <c:out value="${list_rowNum}"/>
    	</display:column>
		     <display:column   sortable="true" media="html" titleKey="operator.column.name">
		     
		      <a href="<c:url value="/system/operator_edit.action?id=${list.id}"/>">
     				 <c:out value="${list.name}"/></a>
		     </display:column>
		     <display:column property="name" media="csv excel xml pdf rtf"
							titleKey="operator.column.name"/>
			<display:column property="value"  escapeXml="true"  sortable="true" titleKey="operator.column.value"></display:column>				
		    <display:column property="remark"  escapeXml="true"  sortable="true" titleKey="operator.column.remark"/>
		    <display:column property="init"  escapeXml="true" sortable="true" titleKey="operator.column.init"/>
		    
		    

		</display:table>




</td>
</tr>
</table>


</s:form>
</body>
</html>
