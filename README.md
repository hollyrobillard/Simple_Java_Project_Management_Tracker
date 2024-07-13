# Simple Java Project Management Tracker

## Problem Overview
Project managers are responsible for continuously tracking the execution of projects for scope, time and budget as well as monitoring risks. At any given time, a project manager may be asked to give a status update on any of their projects, including recalling historical information on these projects. For those project managers who oversee multiple simultaneous projects, it can be a challenge to remember these details for all projects. I will create a program to solve this knowledge management problem. When executed, this program will prompt the project manager to decide whether they would like to provide a new status update or recall a previous status update. If they would like to add a new status update, the project manager will be prompted to input the date, project name, scope status, timeline status, budget status, and known risks. If they would like to pull a historical status, the project manager will be prompted to select the name of the project. They will then be shown the date of the status update, scope status, timeline status, budget status, and known risks for all status updates associated with the project. By storing and recalling project statuses, the project manager will be able to respond to status inquires in a timelier manner with greater accuracy.

## Scenarios

Scenario 1: Project manager inputs a new project
1.	Select option to input a new project from main menu
2.	Display current list of projects 
3.	Confirm that the project does not already exist (new one should be added)
4.	Input name of the project
5.	Save name of the project
6.	Returns to main menu

Scenario 2: Project manager wants to input a new project, but determines it already exists
1.	Select option to input a new project from main menu
2.	Display current list of projects 
3.	Exit this function without adding a new project name (new one should not be added)
4.	Returns to main menu

Scenario 3: Project manager adds a new status update
1.	Select option to input a new status update from main menu
2.	Display list of current project names and select the project name
3.	Input date
4.	Input scope status
5.	Input timeline status
6.	Input budget status
7.	Input known risks
8.	Display confirmation that status update was successfully added
9.	Returns to main menu

Scenario 4: Project manager wants to pull all historical statuses for a project
1.	Select option to recall historical status from main menu
2.	Display list of current project names and select the project name
3.	Display scope status, timeline status, budget status, and known risks for the project
4.	Returns to main menu

Scenario 5: Project manager wants to exit the program
1.	Select option to exit program from main menu
