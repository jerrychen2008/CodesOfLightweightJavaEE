<%--
��վ: <a href="http://www.crazyit.org">���Java����</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2016, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!-- �����ǩ�⣬ָ��mytagǰ׺�ı�ǩ��
	��http://www.crazyit.org/mytaglib�ı�ǩ�⴦�� -->
<%@ taglib uri="http://www.crazyit.org/mytaglib" prefix="mytag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>�Զ����ǩʾ��</title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body bgcolor="#ffffc0">
<h2>������ʾ�����Զ����ǩ�е�����</h2>
<mytag:fragment>
	<jsp:attribute name="fragment">
	<%-- ʹ��jsp:attribute��ǩ����fragment��������ע�Ͳ��ܷ���fragment�ڣ� -->
		<%-- �����Ƕ�̬��JSPҳ��Ƭ�� --%>
		<mytag:helloWorld/>
	</jsp:attribute>
</mytag:fragment>
<br/>
<mytag:fragment>
	<jsp:attribute name="fragment">
		<%-- �����Ƕ�̬��JSPҳ��Ƭ�� --%>
		${pageContext.request.remoteAddr}
	</jsp:attribute>
</mytag:fragment>
</body>
</html>