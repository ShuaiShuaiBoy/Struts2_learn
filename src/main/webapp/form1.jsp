<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h5><i>text:</i><s:property value="text"/></h5>

<h5>
    <i>listText:</i>
    <br>
    <s:iterator value="listText" status="sta" begin="be" end="e" step="ste" var="v">
        <s:property value="#v"/>                
        <br>
    </s:iterator>
</h5>

<h5>
    <i>mapText:</i>
    <br>
    <s:property value="mapText.map1"/>                
    <br>
    <s:property value="mapText.map2"/>                
    <br>
    <s:property value="mapText.map3"/>                
    <br>
    <s:property value="mapText.map4"/>                
    <br>
</h5>


<h5>
    <i>student:</i>
    <br>
    <s:property value="student.city.name"/>
</h5>

<s:form>
    <input type="text" name="student.city.name" value="<s:property value="student.city.name"/>">
    <s:text name="student.city.name"></s:text>
    <s:radio list="listText" key="listText"></s:radio>
</s:form>

<s:debug></s:debug>



</body>
</html>