# WebCrawler
This is a web based email scrapper/extractor , It crawls the given url and scraps any email id it finds.</br>
It is a dynamic web application where you provide site url(or multiple sites urls with comma separated) as input and as a result it returns the list of emails scrapped from each site urls.</br>

# Technology Used :
<ul><li>Dynamic web application with struts 2 setup.</li>
<li>A java html parser ‘Jsoup’. It is a java library that is used to parse HTML document. Jsoup provides api to extract and manipulate data from URL or HTML file.</li>
<li>Email regex expression match.</li>
<li>Java for backend process.</li></ul>

# How it works :
<ul><li>On starting the crawlWeb application it opens a landing page with a text box where you need to provide site urls.</li>
<li>Provide the complete site url here( or if you wish to provide multiple site urls at once then provide it with comma(,) separated ).</li>
<li>Start the Crawler by pressing the ‘Start Crawler’ button.</li>
<li>Result will be in a tabular with two columns ‘URL’ and its corresponding scrapped ‘Email List’.</li></br>

Here you can scrap emails from any site or for any number of sites at once.The result will be list go email scrapped from respective sites/urls.</br></ul>
It does complete end to end url web page crawling even the html tags attribute values to extract email addresses out of it.

# How to Use :
<ul><li>Deploy the project war in your tomcat and restart your tomcat.</li>
<li>Browse to <pre><code>http://localhost:<tomcat-port>/CrawlWeb/ </code></pre></li>
<li>Provide url or multiple urls in the text box. If providing multiple urls then give it with comma separated (please refer below sample input format).</li>
<li>Press Start Crawler to begin email scrapping process from the provided input.</li></ul>

# Sample Input format :   
<pre><code>http://unlike.net </code> , <code> http://retreat-vinyl.de/ </code></pre>
Or some larger mail sites eg : 
<pre><code>http://mailiddatabase.blogspot.in/ </code></pre>

