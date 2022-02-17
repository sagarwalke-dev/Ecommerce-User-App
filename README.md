## Report of Sales And Inventory Management System:
 •	Customer report : We can generate all the reports of  Customer in this
 
 •	Sales report : Generate reports related to Sales
 
 •	Payment report : All  Payment reports will be available in this section
 
 •  Purchasing report : You can generate filtered reports of  Purchasing
 
 •	You can generates the report of Purchasing, Customer, Inventory
    Sales, Supplier, Payment has facility for dynamic search. So you can        	filter the records run time.
    
 •  PDF reporting has been integrated for exporting of the report for Customer,  	Sales, Payment modules.
 
 •  You can create the CSV reports for Customer, Purchasing, Sales.
  
## Modules of Sales And Inventory Management System:
•	Customer module : We can manage all the operations related to Customer from 					this module

•	Sales module : This module is normally developed for managing the Sales 					operations

•	Payment module : All the operations realated to Payment will be managed by 					  					Payment

•	Purchasing module : This module manages Purchasing functionalities

•	Inventory module : Inventory modules performs all the create, read, update 						and delete operations of Inventory

•	Supplier module : It manages all the functionalities of Supplier

## Modules

#### Inventory module
###### 1. Add Inventory
		Endpoint: /inventory/addStock
		Method:   POST
		Request: 
				{
				}
		Response: 
				{
				message: "stock",
				statusCode:200
				}

###### 2. Update Inventory
		Endpoint: /inventory/updateStock
		Method:   POST
		Request: 
				{
				stockId:123
				}
		Response: 
				{
				message: "stock",
				statusCode:200
				}
