The project where 4 test user stories created for Upayments were tested.

Cases created for 4 user stories:

**Case 1** - Verify Add Product functionality with valid username & password
|Step                          |Test Data| Expected Result| Actual Result|Status|
|-------------------------------|-----------------------------|-----------------------------|-----------------| -----------------|
|Navigate to login page|            |able to see the login page            |as expected|pass|
|Enter valid username & password|username: htest@emailaddress.com password:123456            |credentials can be entered            |as expected|pass|
|Click on login button|            |user can be logged and  see dashboard            |user succesfully logged|pass|
|Click Store button on left nav          |           |User should be able to see the child items.| as expected|pass|
|Click on the Product under Store on left navigation          |            |can be navigate to product page| as expected|pass|
|Click on the Add Product button          |            |can be navigate to add product page| as expected|pass|
|Click on the Upload Images button          |![enter image description here](https://imgyukle.com/f/2022/12/09/JgPA96.png)            |can be select and upload product image| as expected|pass|
|Enter English Product Name         |Empty Box            |can be enter EN product name| as expected|pass|
|Enter Arabic Product Name         |Empty Box            |can be enter AR product name| as expected|pass|
|Enter English Product Description         |this is a empty box            |can be enter EN product description| as expected|pass|
|Enter Arabic Product Description         |this is a empty box            |can be enter AR product description| as expected|pass|
|Select Country Origin         |AU            |Can be select country origin| as expected|pass|
|Enter Sku |111            |Can be enter sku value| as expected|pass|
|Select weight Unit |gram            |Can be select weight unit| as expected|pass|
|Select length Unit |millimeter            |Can be select length unit| as expected|pass|
|Enter weight value|1            |Can be enter weight value| as expected|pass|
|Enter length dimension|222            |Can be enter length dimension| as expected|pass|
|Enter width dimension|222            |Can be enter width dimension| as expected|pass|
|Enter height dimension|400            |Can be enter height dimension| as expected|pass|
|Enter video url|https://youtube.com            |Can be enter video url| as expected|pass|
|Select product category|gift            |Can be select product category| as expected|pass|
|Enter price|100            |Can be enter product price| as expected|pass|
|Enter sale price|150            |Can be enter product sale price| as expected|pass|
|Enter item code|1232321|Can be enter product item code| as expected|pass|
|Enter Available quantity|25000            |Can be enter available quantity| as expected|pass|
|Enter daily quantity limit|1000            |Can be enter daily quantity limit| as expected|pass|
|Click on the Submit Button|            |User should be able to click submit button and see message that the product was created successfully.|product created successfully and message appeared|pass|

**Case 2** - Verify Search Product functionality with valid username & password
|Step                          |Test Data| Expected Result| Actual Result|Status|
|-------------------------------|-----------------------------|-----------------------------|-----------------| -----------------|
|Navigate to login page|            |able to see the login page            |as expected|pass|
|Enter valid username & password|username: htest@emailaddress.com password:123456            |credentials can be entered            |as expected|pass|
|Click on login button|            |user can be logged and  see dashboard            |user succesfully logged|pass|
|Click Store button on left nav          |           |User should be able to see the child items.| as expected|pass|
|Enter the word to be searched in the search input|   Empty Box         |Can be enter word to be searched| as expected|pass|
|Click on the search button|            |Can be click search button and user should be able to see results containing the word I'm looking for in search results| as expected|pass|

**Case 3** - Verify Edit Product functionality with valid username & password
|Step                          |Test Data| Expected Result| Actual Result|Status|
|-------------------------------|-----------------------------|-----------------------------|-----------------| -----------------|
|Navigate to login page|            |able to see the login page            |as expected|pass|
|Enter valid username & password|username: htest@emailaddress.com password:123456            |credentials can be entered            |as expected|pass|
|Click on login button|            |user can be logged and  see dashboard            |user succesfully logged|pass|
|Click Store button on left nav          |           |User should be able to see the child items.| as expected|pass|
|Enter the word to be searched in the search input|   Empty Box         |Can be enter word to be searched| as expected|pass|
|Click on the search button|            |Can be click search button and user should be able to see results containing the word I'm looking for in search results| as expected|pass|
|Click the edit button in to the result|         |Can be click edit button and user navigate to the edit product page| as expected|pass|
|Delete the current price |   |Can be delete current price in the price input| as expected|pass|
|Enter current new price to the price input | 200  |Can be enter new price to the price input| as expected|pass|
|Click on the Submit Button|            |User should be able to click submit button and see message that the Product updated successfully|product updated successfully and message appeared|pass|

**Case 4** - Verify Delete Product functionality with valid username & password
|Step                          |Test Data| Expected Result| Actual Result|Status|
|-------------------------------|-----------------------------|-----------------------------|-----------------| -----------------|
|Navigate to login page|            |able to see the login page            |as expected|pass|
|Enter valid username & password|username: htest@emailaddress.com password:123456            |credentials can be entered            |as expected|pass|
|Click on login button|            |user can be logged and  see dashboard            |user succesfully logged|pass|
|Click Store button on left nav          |           |User should be able to see the child items.| as expected|pass|
|Enter the word to be searched in the search input|   Empty Box         |Can be enter word to be searched| as expected|pass|
|Click on the search button|            |Can be click search button and user should be able to see results containing the word I'm looking for in search results| as expected|pass|
|Click the delete button in to the result|         |Can be click delete button and and user should be able to see dialog window for confirmation| as expected|pass|
|Click OK button on dialog window          |           |can be click OK button and see message that the Success| as expected|pass|
