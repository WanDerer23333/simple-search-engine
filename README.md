# Simple Search Engine
 A simple search engine based on Lucene 8, build index and search with keywords over the article dataset TDT3 which contains more than 37000 little articles.

 This is a final project of my Information Retrieve. In the project, I tried to achieve the BM25 ranking by extends the SimpleCollector class but the efficiency is bad. However, if your purpose is not far from a final task, maybe this is enough for u.
 
 To launch this project, you need Java 8+ and Maven environment on the Windows sys. Open this project in your IDE, and then unzip the tdt3.rar into directory tdt3. Do `maven install`. Now you can run the main method in BuildIndex.class to build the index, and search with keywords after running the main method in Search.class.
 
 Here are some suggested keywords:
 ```
 hurricane
 mitch george
 bill clinton israel
 "newt gingrich" down
 nba strike closed-door
 ```
