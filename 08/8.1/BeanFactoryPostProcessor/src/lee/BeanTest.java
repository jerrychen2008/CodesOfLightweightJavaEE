package lee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BeanTest
{
	public static void main(String[] args)
	{
		// ��ApplicationContex��ΪSpring����
		// �����Զ�ע��������������Bean������
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person)ctx.getBean("chinese");
		p.useAxe();
	}
}