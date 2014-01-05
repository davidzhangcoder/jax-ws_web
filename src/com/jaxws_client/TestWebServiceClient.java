package com.jaxws_client;

import javax.xml.ws.BindingProvider;

import com.jaxws_client.generated.TestWebServiceImpl;
import com.jaxws_client.generated.TestWebServiceImplService;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	TestWebServiceClient.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Sep 1, 2013 8:44:58 PM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Sep 1, 2013    david      1.0        1.0 Version  
 */

public class TestWebServiceClient
{
	public static void main(String[] args)
	{
		//在同一个Service的不同调用之间保持会话
		//test-commit-1
		TestWebServiceImpl service = new TestWebServiceImplService().getTestWebServiceImplPort();
		
		((BindingProvider)service).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);

		System.out.println( service.webServiceMethod1() );
		System.out.println( service.webServiceMethod1() );
		System.out.println( service.webServiceMethod1() );
		System.out.println( service.webServiceMethod1() );
		System.out.println( service.webServiceMethod1() );
		
	}
}
