package com.web.dto;

import java.util.ArrayList;

public class UrlMailResponse {
	private String url;
	private ArrayList<String> emailList;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList<String> getEmailList() {
		return emailList;
	}

	public void setEmail(ArrayList<String> emailList) {
		this.emailList = emailList;
	}
}
