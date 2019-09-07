#Repository
This project has an implementation of Chain of Responsibilities Design Pattern using ATM 
cash withdraw operation. 
The main chain design pattern is used to process counting of currency of different types 
like 2000, 1000, 500, 200 & 100. 
Here order for counting currency of different types currency has taken in to consideration from 
highest currency to lowest currency while withdrawing money. 
So to cater each request with validating available cash in the ATM machine and user requirement.

Default balance for customer is 30000

************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
1
Please enter amount to deposit:
80000
Your money deposited successfully!
Available balance: 110000
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
75000
-----------------------
2000*37=74000
1000*1=1000
-----------------------
TOTAL=75000
Available balance: 35000
ATM cash: ATMCash{currency100=50, currency200=50, currency500=50, currency1000=49, currency2000=13}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
25000
-----------------------
2000*12=24000
1000*1=1000
-----------------------
TOTAL=25000
Available balance: 10000
ATM cash: ATMCash{currency100=50, currency200=50, currency500=50, currency1000=48, currency2000=1}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
2200
-----------------------
2000*1=2000
200*1=200
-----------------------
TOTAL=2200
Available balance: 7800
ATM cash: ATMCash{currency100=50, currency200=49, currency500=50, currency1000=48, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
800
-----------------------
500*1=500
200*1=200
100*1=100
-----------------------
TOTAL=800
Available balance: 7000
ATM cash: ATMCash{currency100=49, currency200=48, currency500=49, currency1000=48, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
6000
-----------------------
1000*6=6000
-----------------------
TOTAL=6000
Available balance: 1000
ATM cash: ATMCash{currency100=49, currency200=48, currency500=49, currency1000=42, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
1
Please enter amount to deposit:
50000
Your money deposited successfully!
Available balance: 51000
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
3
Available balance:51000
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
50000
-----------------------
1000*42=42000
500*16=8000
-----------------------
TOTAL=50000
Available balance: 1000
ATM cash: ATMCash{currency100=49, currency200=48, currency500=33, currency1000=0, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
1
Please enter amount to deposit:
45000
Your money deposited successfully!
Available balance: 46000
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
39000
ATM is out of cash. Unable to dispense.
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
30500
-----------------------
500*33=16500
200*48=9600
100*44=4400
-----------------------
TOTAL=30500
Available balance: 15500
ATM cash: ATMCash{currency100=5, currency200=0, currency500=0, currency1000=0, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
450
Please enter valid options between 1 to 4.
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
450
Please enter amount multiple of 100.
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
600
Please enter valid options between 1 to 4.
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
600
ATM is out of cash. Unable to dispense.
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
500
-----------------------
100*5=500
-----------------------
TOTAL=500
Available balance: 15000
ATM cash: ATMCash{currency100=0, currency200=0, currency500=0, currency1000=0, currency2000=0}
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
2
Please enter amount to withdraw:
100
ATM is out of cash. Unable to dispense.
*****************************
************ATM Cash Dispenser Machine*************
Deposit: 1
Withdraw: 2
Check Balance: 3
Exit: Please press any key.
Please enter your option:
4
Thanks for visiting.

Process finished with exit code 0
