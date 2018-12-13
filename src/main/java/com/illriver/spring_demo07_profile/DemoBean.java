package com.illriver.spring_demo07_profile;

/**
 * 示例bean
 * @author Pactera
 *
 */
public class DemoBean {
	private String content;
	public DemoBean(String content) {
		super();
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String conteent) {
		this.content = conteent;
	}
}
