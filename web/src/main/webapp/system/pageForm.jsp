<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> 
<delmar:message key="page.title"/>
</title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>

 <script type='text/javascript' src='../js/ea.validate.js'></script>
<style type="text/css">
	.navig img
	{
		-webkit-filter: grayscale(0%); 
		margin-top: 1px;
	}
	.navig img:hover  {
	-webkit-filter: grayscale(70%); 
	cursor: pointer;
}
</style>
</head>



<body>

<s:form id="editForm" action="page_edit" namespace='/system' theme="simple">
<s:hidden id="id" name="page.id"></s:hidden>

<table width="100%" border="0" cellspacing="0" cellpadding="5">
  <tr> 
    <td valign="top">
    	<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig">
                   	<img alt="" src="../images/ico22/create.png">

         	<img alt="" src="../images/ico22/save.png" class="testimg">

         	<img alt="" src="../images/ico22/delete.png">

         	<img alt="" src="../images/ico22/back.png" >
         	<img alt="" src="../images/ico22/next.png" >
          <delmar:message key="page.location"/></td>
         <td background="../images/top2.png" width="*"  height="32" align="right">
         
         <div class="C_S_F_L" style="padding-top: 5px">

			<c:if test="${!isFirst}">
			
				<s:submit method="getPrevionsOne" value="%{#session.resource.get('common.button.previous')}"  cssClass="input_submit"></s:submit>
			</c:if>		
			
			
			<c:if test="${!isLast}">
			<s:submit method="getNextOne" value="%{#session.resource.get('common.button.next')}"  cssClass="input_submit"></s:submit>
			
			</c:if>
		</div></td>
        </tr>
      </table>
    	<table width="100%" border="0" cellpadding="0" cellspacing="0"  class="table_blue">
        <tr align="center" valign="top"> 
          <td>
          
           
            <table width="100%" cellpadding="10" cellspacing="0" >
              <tr> 
                <td align="center"> <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="table_blue">
                <tr>
                <td>
                
                <table width="100%" border="0" cellpadding="0" cellspacing="1">
               <tr  class="query_one">
               	<td width="20%">
               	<s:label for="name" value="%{#session.resource.get('page.column.name')}"></s:label>
               	</td>
               	<td colspan="3">
               	<s:textfield name="page.name" id="name"></s:textfield>
               	</td>
				</tr>
				
				<tr  class="query_two">
				<td ><s:label for="pageUrl" value="%{#session.resource.get('page.column.pageUrl')}"></s:label></td>
							<td colspan="3">
							<s:textfield name="page.pageUrl" id="pageUrl" cssStyle="width:500px;"></s:textfield>
							</td>
							
				</tr>
						<tr  class="query_one">
							
							<td ><s:label for="descr"  value="%{#session.resource.get('page.column.remark')}"></s:label></td>
							<td colspan="3">
							<s:textfield name="page.remark" id="descr" cssStyle="width:500px;"></s:textfield>
							</td>
							
                            
						</tr>
						
					
						
						
						

                    
                <tr>
                <td colspan="4" class="td_page_right">
               			
						<s:submit method="edit" value="%{#session.resource.get('common.button.create')}"  cssClass="input_submit"></s:submit>
						<s:submit method="save" value="%{#session.resource.get('common.button.save')}" cssClass="input_submit"></s:submit>
						<c:if test="${page.id!=null}">
						<s:submit method="delete"  value="%{#session.resource.get('common.button.delete')}" cssClass="input_submit" onclick="return confirmDelete()"></s:submit>
						</c:if>
						
						<input onclick="window.location='<c:url value="/system/page_list.action"/>'"  type="button" value="<delmar:message key="common.button.back"/>"  class="input_submit" >
						
								
				
				
                </td>
                </tr>
                
                </table>
                
                
                </td>
                </tr>
                <tr>
                <td colspan="4">
                <s:actionmessage cssStyle="color:red"/>
                <img alt="Base" src="../images/base.gif">
                </td>
                </tr>
                </table></td></tr></table>
</td></tr></table></td></tr>
</table>
</s:form>







</body>

