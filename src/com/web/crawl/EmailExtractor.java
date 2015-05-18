package com.web.crawl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.web.dto.UrlMailResponse;

public class EmailExtractor {

	public static ArrayList<UrlMailResponse> responseList = new ArrayList<UrlMailResponse>();

	private ArrayList<String> findValidEmail(String rawText) {
		ArrayList<String> emailList = new ArrayList<String>();

		Matcher m = Pattern.compile(
				"[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(
				rawText);
		while (m.find()) {
			emailList.add(m.group());
		}

		return emailList;
	}

	public ArrayList<UrlMailResponse> extractEmail(String urls) {

		String[] urlsArray = urls.split(",");
		Crawler crawler = null;
		ArrayList<UrlMailResponse> mailResponseArray = new ArrayList<UrlMailResponse>();

		for (String url : urlsArray) {

			url = url.replace("\n", ",").replace(" ", "");
			ArrayList<String> emailList = new ArrayList<String>();

			crawler = new Crawler();
			emailList = findValidEmail(crawler.crawlWeb(url));

			System.out.println("URL : " + url + "\nemail list : " + emailList);

			UrlMailResponse urlMailResponse = new UrlMailResponse();
			urlMailResponse.setUrl(url);
			if (emailList.size() == 0) {
				emailList.add("No email Found.");
				urlMailResponse.setEmail(emailList);
			} else {
				urlMailResponse.setEmail(emailList);
			}
			mailResponseArray.add(urlMailResponse);

		}

		return mailResponseArray;

	}

}