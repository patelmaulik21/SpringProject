package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import server.CalcServerIntr;

public class CalcClient
{   CalcServerIntr clc=null;
	public static void main(String[] args) 
	{
		CalcClient c=(CalcClient) getFactory().getBean("calcClient");
		c.callOperation();
		
	}
	
	private  void callOperation() 
	{
		System.out.println("ADD:"+clc.add(5,4));
		System.out.println("sub:"+clc.sub(5,4));
		System.out.println("mul:"+clc.mul(5,4));
		System.out.println("div:"+clc.div(5,4));
	}
	public CalcServerIntr getClc() {
		return clc;
	}
	public void setClc(CalcServerIntr clc) {
		this.clc = clc;
	}
	public static BeanFactory getFactory()
	{
		Resource r=new FileSystemResource("bean.xml");
		BeanFactory b=new XmlBeanFactory(r);
		return b;
		
	}
	
}
