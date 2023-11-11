<h2>INTERMEDIATE -> EXERCISE 2</h2>

**ACCOUNTING SYSTEM (BANK):**

1- Receive user input with the library *Java.Util.Scanner*.

2- Implement in console a listing with the following options:
* Create an account.
* View funds.
* Add funds.
* Withdraw funds.
* Exit *-System.exit(0)-*.

2- Create a *class* named *"Account "* with:
* Attributes *String(Holder), float(Funds)*.
* Create its *get, set and toString* methods.
* It will have 2 special methods: enter(*double:amount*), withdraw(*double amount*)
* Holder will be mandatory, funds:optional.

3- Make use of *try/catch* for possible user input errors:
* Entering an index that is not registered in the list.
* Entering values that are not expected when performing operations.

*Please note: Once a process has been performed, display the list again.

<h2>EXAMPLE:</h2>

**Console:**

```
===================
 Choose an option:
===================
1. Create account.
2. View funds.
3. Add funds.
4. Withdraw funds.
5. Exit.
-> 1
Enter a user name: dvchinx
Enter funds (optional): 0
-Account Created Successfully-
-Current Funds: 0-

===================
 Choose an option:
===================
1. Create an account.
2. View funds.
3. Add funds.
4. Withdraw funds.
5. Exit.
-> 2
Enter your user name: dvchinx
-Current Funds: 0-

===================
 Choose an option:
===================
1. Create account.
2. View funds.
3. Add funds.
4. Withdraw funds.
5. Exit.
-> 3
Enter your username: dvchinx
Funds to add: 200
-Successfully Added Funds-

===================
 Choose an option:
===================
1. Create account.
2. View funds.
3. Add funds.
4. Withdraw funds.
5. Exit.
-> 4
Enter your username: dvchinx
Funds to Withdraw: 100
-Funds Successfully Withdrawn-
-Current Funds: 100

===================
 Choose an option:
===================
1. Create an account.
2. View funds.
3. Add funds.
4. Withdraw funds.
5. Exit.
-> 5
-Thank you for choosing us, come back soon.
```
