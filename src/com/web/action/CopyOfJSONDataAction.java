package com.web.action;

import java.util.ArrayList;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.web.crawl.EmailExtractor;
import com.web.dto.UrlMailResponse;

public class CopyOfJSONDataAction extends ActionSupport {

	private String urls;

	ArrayList<UrlMailResponse> mailResponseArray = new ArrayList<UrlMailResponse>();

	public ArrayList<UrlMailResponse> getMailResponseArray() {
		return mailResponseArray;
	}

	public void setMailResponseArray(
			ArrayList<UrlMailResponse> mailResponseArray) {
		this.mailResponseArray = mailResponseArray;
	}

	public CopyOfJSONDataAction() {

	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String execute() {

		EmailExtractor emailExtractor = new EmailExtractor();
		mailResponseArray = emailExtractor.extractEmail(this.getUrls());

		System.out.println("URLS : " + this.getUrls());

		return Action.SUCCESS;
	}

}