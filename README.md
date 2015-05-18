# WebCrawler
This is a web based email scrapper/extractor , It crawls the given url and scraps any email id it finds.

It is a dynamic web application where you and provide site url(or multiple sites urls with comma separated) as input and as a result it returns the list of emails scrapped from each site urls.

Technology Used :

1. Dynamic web application with struts 2 setup.

2. A java html parser ‘Jsoup’. It is a java library that is used to parse HTML document. Jsoup provides api to extract and manipulate data from URL or HTML file.

3. Email regex expression match .

4. Java for backend process.



How it works :

1. On starting the crawlWeb application it opens a landing page with a text box where you need to provide site urls.

2. Provide the complete site url here( or if you wish to provide multiple site urls at once then provide it with comma(,) separated ) .

3. Start the Crawler by pressing the ‘Start Crawler’ button.

4. Result will be in a tabular with two columns ‘URL’ and its corresponding scrapped ‘Email List’.



Here you can scrap emails from any site or for any number of sites at once.The result will be list go email scrapped from respective sites/urls.

It does complete end to end url web page crawling even the html tags attribute values to extract email addresses out of it.



How to Use :

1. Deploy the project war in your tomcat and restart your tomcat. 

2.Browse to http://localhost:<tomcat-port>/CrawlWeb/

3.Provide url or multiple urls in the text box. If providing multiple urls then give it with comma separated (please refer below sample input format).

4. Press Start Crawler to begin email scrapping process from the provided input.



Sample Input format :   

http://unlike.net , http://retreat-vinyl.de/ 

Or some larger mail sites eg : http://mailiddatabase.blogspot.in/

