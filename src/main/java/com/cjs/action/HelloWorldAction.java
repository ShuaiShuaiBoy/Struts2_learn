package com.cjs.action;

import com.cjs.entity.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 * “ª∏ˆAction¿‡
 * @author Shuaishuai
 *
 */
public class HelloWorldAction extends ActionSupport{

	private MessageStore messageStore;
	

	@Override
	public String execute() throws Exception {
		messageStore = new MessageStore();
		
		messageStore.setMessage("Hello Struts User");
		
        return SUCCESS;
    }


	public MessageStore getMessageStore() {
		return messageStore;
	}


	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
	
	
}
