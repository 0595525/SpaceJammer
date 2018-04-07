								
			  	  	  	                  __________________________________
					    	  	                |	     SPACE JAMMER README       |
					  	  	                  |________________________________|

	This is a gaming application. Launching the gaming software is initialised by a start button. The game starts at scene with an object 
controlled by user using keyboard keys, possessing capabilities to move left, right, up, down on screne(respective to keyboard keys). In addition, 
user controlled object has ability to shoot bullets to kill the enemies which are randomly generated and posses an uncontrolled motion towards 
bottom of screne and destroying every enemy gives user a score. The user controlled object has only one lifeline(chance of play the game). If the 
user misses an enemy and enemy touches the bottom of screen or the user controlled object touches the enemy, the game over screne comes up and the
objecs do not move. Software stores data on scores and keeps track of high scores. 

_______________ 
Getting Started
_______________
The program is suitable for both Windows and Mac laptops and desktops. To get a copy of the project up and running on your local machine for 
development and testing purposes, simply download the zip file from public git repository and extract the folder. After the folder is extracted, 
there will be executable java files. Open the executable files using Eclipse or any preferable software to run .java files. User will need java 
software to execute files for the program. End of program installation is marked by executable .java files opening. Once the files successfully open,
run the program and it will come up with the graphic user interface, with the start button for game.

_________________
Running the tests
_________________
Few tests were run for the program to make sure the functionality of all the objects and sequence. The first test was to see if clicking on start 
button successfully opens up to the assigned stage. Second test was to see if the user controlled object was able to shoot bullets. Thirdly, does 
the enemy appear in random fashion and posses the motion in forward direction. Fourth was to see if the bullets shot from user controlled object
when touch the enemy, does the enemy gets destroyed and raises the score. Fifth test to check when the enemy touches user controlled object or 
reaches the bottom of screen, does it stop the game and brings over the screen for game-over. These tests helped understand the minute functionality 
of the program and allows to check on the specifications. The program cleared all the tests sucessfully and was submitted further.

__________
Built With
__________
Java Application - inherited to get the features for user input and output controller in form of keyboard keys
javafx library - imported to generate user interface
sql library - imported to transfer sql commands from java to execute in sqlite
SQlite-JDBC - program used for storing database

This would be the first version of this program, hence named 1.0. For further updates on the program, user can keep touch with git repository

_______
Authors
_______
Jiaxuan Lu - Lead Programmer
Shushmita Das - Database Handler
Namrata Lamba - Documenter
Fiona Ibhazoboa - Tester

Professor Alaadin Addas approved the project proposal under certain ceriteria and provided the required guidance through out the project.

_______
License
_______
This project is licensed under the Proprietary software licenses. This retains the copyright of program, only right to perform and right to display 
assigned to user. For further details, see https://en.wikipedia.org/wiki/Proprietary_software

_______________
Acknowledgments
_______________
With this, we would like to thank Professor Alaadin for being the inspiration and guidance throughout. 
