package com.web.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Crawler {

	private String extractHtmlText(String url) {
		String htmlText = "";
		try {
			Document d = Jsoup.connect(url).get();
			htmlText = d.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return htmlText;

	}

	private String extractRawText(String url) {
		String htmlText = extractHtmlText(url);
		String rawText = "";
		rawText = Jsoup.parse(htmlText).text();
//		System.out.println(rawText + "\n");

		return rawText;
	}

	public String crawlWeb(String url) {

		return extractHtmlText(url);
	}

}
