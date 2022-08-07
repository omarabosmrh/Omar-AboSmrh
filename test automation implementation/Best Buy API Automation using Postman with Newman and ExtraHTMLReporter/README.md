# AutomationBestBuyAPIs-
# APIAutomationTestforBestBuy
automate api testing for BestBuy Collection using postman and newman and extrahtml reporter

# 1)list of api test cases 

- Validate the keys with the Min. and Max range of APIs (e.g maximum and minimum length)
- Keys verification. If we have JSON, XML APIs we should verify it’s that all the keys are coming.
- Have a test case to do XML, JSON Schema validation.
- Verify the Parse the Response data
- Verify the JSON Schema validation, Verify the Field Type,Verify the Mandatory Fields
- Valid Response headers & Negative Testcases response
- Verify that how the APIs error codes handled.
- Verify the response HTTP status code.
- Valid Response payload
- Chaining Request verification.
- Verification of APIs with Data parameters.
- End to End CRUD flows
- Database Integrity Test Cases
- File Upload Testcases



# I Can work with 3 Methods to automate API Tests:-
- Rest Assured with TestNG,Java..etc.
- Robot Framework with (selenium,python).
- Postman Using Newman and NodeJS with ExtraHTML Reporter.


# i used Postman & Newman ,NodeJS with ExtraHTML Reporter.
as Postman allows you to add any number of tests for each API.
and for Examples:-
- Response body should be in the correct format
pm.test("Response body should be in the correct format", function() {
    pm.expect(jsonResponse.id).to.be.a('Number');
    //pm.expect(jsonResponse.id).to.have.lengthOf(7);
    pm.expect(jsonResponse.name).to.be.a('string');
    pm.expect(jsonResponse.type).to.be.a('string');
    pm.expect(jsonResponse.price).to.be.a('Number');
    pm.expect(jsonResponse.upc).to.be.a('string');
    pm.expect(jsonResponse.shipping).to.be.a('Number');
    pm.expect(jsonResponse.description).to.be.a('string');
    pm.expect(jsonResponse.model).to.be.a('string');
    pm.expect(jsonResponse.url).to.be.a('string');
    pm.expect(jsonResponse.image).to.be.a('string');
    pm.expect(jsonResponse.createdAt).to.be.a('string');
    pm.expect(jsonResponse.categories).to.be.a('array');
});

---------------------------------------------------------

- Automatically check that the status code is 200/201/400 .. etc
pm.test("Status code is 200", function () 
    pm.response.to.have.status(200);
});{
---------------------------------------------
- Check on a specific header in the response
pm.test("Content-Type is present", function () 
    pm.response.to.have.header("Content-Type");
});{
---------------------------------------------------
- Check that the response time is bigger/smaller than a certain time
pm.test("Response time is less than 200ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(200);
});
------------------------------------------------
- Check that the response contains a specific string
pm.test("Body matches string", function () {
    pm.expect(pm.response.text()).to.include("createdAt");
});
--------------------------------------------------
- Check that the response totally equal to a specific string
In this case it will pass if you send the request and the response body totally equal to the word "CreatedAt"
- Check that the JSON Response has a correct value for a specific key.
pm.test("Your test name", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.job).to.eql("leader");
});
--------------------------------------------
So now we can add automated tests for all our APIs to ensure that our responses are correct and met the desired results.

------------------------------------

# Steps:-

-  1) install NodeJS(latest version).

- 2) then run this commands in terminal:-

- git clone https://github.com/bestbuy/api-playground/
- cd api-playground
- npm install
- npm start

-----------------------
#  Best Buy API Playground started at http://localhost:3030

- 3) then open http://localhost:3030/swagger.json and import  "http://localhost:3030/swagger.json" to postman 


- and go to cmd
and install newman

- 5) put test scripts in postman and save

- 6) npm install -g newman


- 7) run package newman run .\Best Buy API Playground.postman_collection.json

- and for nice report: npm install -g newman-reporter-html
-  for reporter extrahtml: npm install -g newman-reporter-htmlextra

 - 8) newman run ".\Best Buy API Playground.postman_collection.json" -r htmlextra

-----------------------------------------------------
# Or in 4 steps:-
- 1) You can import  Best Buy API Playground.postman_collection.json to Postman
- 2) then install newman npm install -g newman 
- 3) extrahtmlreporter npm install -g newman-reporter-htmlextra
- 4) and finally run and enjoy with Result!: newman run ".\Best Buy API Playground.postman_collection.json" -r htmlextra

------------------------
# My Report, Test Script Result, the collection json, and the tests attached with the project folder.
