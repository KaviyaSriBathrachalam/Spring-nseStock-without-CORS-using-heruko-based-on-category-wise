# Spring-nseStock-without-CORS-using-heruko

NSESTOCK-WITHOUT-CORS-NEW-CAT    1.GIT(controller class) -> 2.HEROKU  -> 3. STSCKBLITZ(service class)

NSESTOCK will run only with cors plugin this is connected with web store... 
without cors plugin from online , we are writing a spring application and in that putting nse website link in controller class.
with spring also in our company we cannot open public website... so putting this spring into heroku and running that into stackbiltz servicer class.

2. In heroku if you run it will not run because we have request mapping value=showNseData in the end like


https://nsestock-witout-cors-new-cat.herokuapp.com/category/cnxPharma


https://nsestock-witout-cors-new-cat.herokuapp.com/category/nifty


https://nsestock-witout-cors-new-cat.herokuapp.com/category/cnxEnergy
(this link comes from latestPrices1(this.eventUrl+category).... this url is running in heroku

