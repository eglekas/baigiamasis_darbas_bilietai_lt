# Automation test for https://www.bilietai.lt

## Link to the page - https://www.bilietai.lt



### LoginTests
* Test 1(PositiveLogin)
1. Input valid email
2. Input valid password
3. Click on banner
4. Click on button login
5. Check if username appeared




* Test 2(NegativeLogin)
1. Input valid email
2. Input false password
3. Click on banner
4. Click on button login
5. Check if message "Neteisingas slaptazodis..." appeared




### ChangePasswordTest
* Test 3(testChangePassword)
1. Click on banner
2. Click on button "Pamirsau slaptazodi"
3. write valid email
4. Click on banner
5. Click on button reset password
6. Check for message updated password



### SearchBarTest
* Test 4(testSearchBar)
1. Click on search bar
2. Write Text "Plaukimas baidaremis Vilniuje"
3. Click on button search
4. Check message of selected activity appeared




### ShoppingBasketTest
* Test 5(testShoppingBasket)
1. Click on search bar
2. write text "Plaukimas baidaremis Vilniuje"
3. Click on button search
4. Click on selected activity
5. Click on button buy
6. Click on button add
7. Click on button choose ticket
8. Click on button correct
9. Click on input bar
10. Input email
11. Click on button pay
12. Click on button bank name
13. Click on button pay
14. Click on button agree
15. Click on button name of bank
16. Check message of selected bank login title
 