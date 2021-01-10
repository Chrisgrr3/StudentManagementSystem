# Student Management System Application | Email Application

This project contains an Email application and Student Database Application.

**studentDatabaseApp:**
    This application allows users to specify how many students they would like to create, input the first and last names of those students, and input the courses those students 
    are enrolled in. Each course has a set price, and upon adding a course, the student's tuition balance increases by that price. Using **payTuition()**, the user is asked
    how much the student would like to pay, and decreases the student's tuition balance by that payment. Using **viewBalance()**, users can view the tuition balance of a 
    particular student. Finally, using **showInfo()**, information about the student's account is displayed.

**emailApp:**
    This application creates an company email for an employee. The email is created based on the employee's first and last name, their department, and the set company suffix. Upon
    creation, a random password is set and displayed to the user, which they can change using the **changePassword()** method. An alternate email can be set using 
    **setAlternateEmail()**, the mailbox capacity can be set using **setMailboxCapacity()**, and user information can be displayed using **showInfo()**.
    

