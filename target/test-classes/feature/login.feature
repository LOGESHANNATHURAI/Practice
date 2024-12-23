 Feature:
bookcart application

Scenario:
verify the user is able to login the application

Given navigate to the bookcart demo application
And click on login Link
And enter the valid username as logesh2001 in username textfield
And enter the valid password as Logesh@2001 in the password textfield
When click on login button
Then home page should be displayed

#Scenario:
#verify the user is able to login the application

#Given navigate to the bookcart demo application
#And click on login button
#And enter the valid username as logesh2001 in username textfield
#And enter the valid password as Logesh@20 in the password textfield
#When click on login button
#But home page should be displayed

