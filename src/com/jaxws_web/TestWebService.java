package com.jaxws_web;

import javax.jws.WebService;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	TestWebService.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Aug 31, 2013 5:43:00 PM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Aug 31, 2013    david      1.0        1.0 Version  
 */

@WebService(name = "TestWebService", targetNamespace = "http://jaxws_web.com/")
public interface TestWebService
{
	public String webServiceMethod1();
	
	public User updateUser(User user);
}
