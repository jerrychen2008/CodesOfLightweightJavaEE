package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
		// 以CLASSPATH路径下的配置文件创建ApplicationContext
		AbstractApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		// 获取容器中的Bean实例
		Person p = ctx.getBean("chinese" , Person.class);
		p.useAxe();
		// 为Spring容器注册关闭钩子
		ctx.registerShutdownHook();
	}
}