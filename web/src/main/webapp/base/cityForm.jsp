<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><delmar:message key="city.title"/></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
<link rel="Stylesheet" href="../css/displaytag.css" type="text/css" />
 <script type='text/javascript' src='../js/ea.validate.js'></script>
  <script type='text/javascript' src='../js/ea.util.js'></script>
 <script type='text/javascript' src='../js/ea.effect.js'></script>
  <script type='text/javascript' src='../dwr/interface/cityDwr.js'></script>
 <script type='text/javascript' src='../dwr/engine.js'></script>
<script type="text/javascript" src="<c:url value="/js/jquery-1.4.2.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/jquery-ui-1.8.5.custom.min.js"/>"></script>
<link rel="Stylesheet" href="../css/smoothness/jquery-ui-1.8.5.custom.css" type="text/css" />
 <script type="text/javascript">
 

 $(document).ready(function() {

	 
	 DWREngine.setAsync(false); 

	 $('#relateCityName').autocomplete(
							{
								source : function(request, response) {
									var availableTags = [];
									var value = $("#relateCityName").val();
									cityDwr.getCityList(value, function(data) {
			
										for (var i = 0; i < data.length; i++) {
											var vendor = data[i];
											vendor.label=data[i].name;
											vendor.value=data[i].name;
											availableTags.push(vendor);
										}

									});
									
									response(availableTags);
								},
								select : function(event, ui) {
									$("#relateCityId").val(ui.item.cityId);
									$("#relateCityName").val(ui.item.name);

								}
							});
		//parentCityName parentId
				$('#parentCityName').autocomplete(
							{
								source : function(request, response) {
									var availableTags = [];
									var value = $("#parentCityName").val();
									cityDwr.getCityList(value, function(data) {
			
										for (var i = 0; i < data.length; i++) {
											var vendor = data[i];
											vendor.label=data[i].name;
											vendor.value=data[i].name;
											availableTags.push(vendor);
										}

									});
									
									response(availableTags);
								},
								select : function(event, ui) {
									$("#parentId").val(ui.item.cityId);
									$("#parentCityName").val(ui.item.name);

								}
							});


				
	                  $("input[@type='text']").each(
	                          function(){
	                              $(this).keypress( function(e) {
	                                      var key = window.event ? e.keyCode : e.which;
	                                      if(key.toString() == "13"){
	                                                  return false;
	              
	                                     }
	                              });
	                          });
	             
 
 
 });
	</script>
</head>



<body>

<s:form id="editForm" action="city_edit" namespace='/base' theme="simple">
<s:hidden id="id" name="city.id"></s:hidden>

<table width="100%" border="0" cellspacing="0" cellpadding="5">
  <tr> 
    <td valign="top">
    	<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig"><delmar:message key="port.location"/></td>
         <td background="../images/table_page_bg.gif" width="*"  height="26" align="right">
         
         <div class="C_S_F_L">
			<c:if test="${!isFirst}">
			
				<s:submit method="getPrevionsOne" value="%{#session.resource.get('common.button.previous')}"   cssClass="input_submit"></s:submit>
			</c:if>		
			<c:if test="${!isLast}">
				<s:submit method="getNextOne" value="%{#session.resource.get('common.button.next')}"   cssClass="input_submit"></s:submit>
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
               	<s:label for="code" value="%{#session.resource.get('city.column.code')}"  ></s:label>
               	</td>
               	<td colspan="3">
               	<s:textfield name="city.code" id="code"></s:textfield>
               	</td>
				</tr>
				   <tr  class="query_two">
               	<td width="20%">
               	<s:label for="cname" value="%{#session.resource.get('city.column.cname')}"  ></s:label>
               	</td>
               	<td colspan="3">
               	<s:textfield name="city.cname" id="cname"></s:textfield>
               	</td>
				</tr>
               <tr  class="query_one">
               	<td width="20%">
               	<s:label for="levelint" value="%{#session.resource.get('city.column.levelint')}"  ></s:label>
               	</td>
               	<td colspan="3">
               	<s:textfield name="city.levelint" id="levelint"  cssStyle="width:300px;"></s:textfield>
               	</td>
				</tr>
				<tr  class="query_two">
               	<td width="20%">
               	<s:label value="%{#session.resource.get('city.column.parentCity')}"  for="parentId"></s:label>
               	</td>
               	<td colspan="3">
               	      	<s:hidden name="city.parentId" id="parentId" ></s:hidden>
       					<s:textfield name="city.parent.name" id="parentCityName"  cssStyle="width:300px;"></s:textfield>
               	</td>
				</tr>
				<tr  class="query_one">
               	<td width="20%">
               	<s:label value="%{#session.resource.get('city.column.relateCity')}"  for="relateCityId"></s:label>
               	</td>
               	<td colspan="3">
               	<s:hidden name="city.relateCityId" id="relateCityId" ></s:hidden>
               	<s:textfield name="city.relateCity.name" id="relateCityName"  cssStyle="width:300px;"></s:textfield>
               	</td>
				</tr>
						<tr  class="query_two">
							
							<td ><s:label for="remark"  value="%{#session.resource.get('common.label.remark')}"  ></s:label></td>
							<td colspan="3">
							<s:textfield name="city.remark" id="remark" cssStyle="width:500px;"></s:textfield>
							</td>
							
                            
						</tr>
			
						
						
						

                    
                <tr>
                <td colspan="4" class="td_page_right">
               			
						<s:submit method="edit" value="%{#session.resource.get('common.button.create')}"   cssClass="input_submit"></s:submit>
						<s:submit method="save" value="%{#session.resource.get('common.button.save')}"  cssClass="input_submit"></s:submit>
						<c:if test="${city.id!=null}">
						<s:submit method="delete"  value="%{#session.resource.get('common.button.delete')}"  cssClass="input_submit" onclick="return confirmDelete()"></s:submit>
						</c:if>
						
						<input onclick="window.location='<c:url value="/base/city_list.action"/>'"  type="button" value="<delmar:message key="common.button.back"/>"  class="input_submit" >
						
								
				
				
                </td>
                </tr>
                
                </table>
                
                
                </td>
                </tr>
                <tr>
                <td colspan="4">
                
                <!-- table 页 bgn -->
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr> 
            <td width="90" height="26" align="center" background="../images/table_page_1.gif">
            <delmar:message key="common.label.internationalization"/>
            </td>
           	<td background="../images/table_page_bg.gif" width="*"  height="26"><div class="C_S_F_L">
			&nbsp;
		</div></td>
              </tr>
            </table>
             <!-- table 页 end -->   
                
                </td>
                
                </tr>
                
                <tr>
                <td colspan="4">
                <!-- table bgn -->
                
                
                
                            <table width="100%" cellpadding="10" cellspacing="0" >
              <tr> 
                <td align="center"> <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="table_blue">
                <tr>
                <td>
<table   border="0"  cellpadding="0" cellspacing="0" class="table">
					<thead >
						<th>
								<delmar:message key="language.column.code"/>
						</th>
						<th>
							<delmar:message key="language.column.name"/>
						</th>
						<th>
							<fmt:message key="common.label.remark"/>
						</th>
					</thead>
					<tbody>
						<s:iterator value="cityTrlList" status="st">
								<tr  class="<s:property value="#st.index%2==0?'odd':'even'"/>">
						<td>
							<s:hidden name="%{'cityTrlList['+#st.index+'].id'}" />
							<s:textfield name="%{'cityTrlList['+#st.index+'].language'}" readonly="true"></s:textfield>	
						</td>
						<td>
							<s:textfield name="%{'cityTrlList['+#st.index+'].name'}" cssStyle="width:300px"></s:textfield>	
						</td>
						<td>
						<s:textfield name="%{'cityTrlList['+#st.index+'].remark'}"></s:textfield>	
						</td>
						</s:iterator>
					
					</tbody>
</table>			
				</td>
				</tr>
				</table>
				</td>
				</tr>
				</table>
	</td>
		</tr>
                
                </table>
                
                
                
                <!-- table end -->
                </td>
                </tr>
                
                
                <tr>
                <td colspan="4">
                <s:actionmessage cssStyle="color:red"/>
<s:fielderror />  
<s:actionerror/>
                </td>
                </tr>
                </table></td></tr></table>
</td></tr></table></td></tr>
</table>
</s:form>







</body>
</html>
