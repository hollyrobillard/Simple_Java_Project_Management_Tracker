import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner keyboardInput = new Scanner(System.in);
    ArrayList<String> projectNames = new ArrayList<>();
    ArrayList<String[]> projectStatuses = new ArrayList<String[]>();
    boolean mainLoop = true;
    int mainMenuSelection;
    int addProjectSelection;
    int addStatusSelection;
    String projectForHistory;

    System.out.println("Welcome to your project management knowledge repository!");
    System.out.println();
    
    while(true){
      //Main menu screen
      System.out.println("Main Menu");
      System.out.println("\tOption 1: Add a new project");
      System.out.println("\tOption 2: Add a new status update");
      System.out.println("\tOption 3: Recall all historical status updates for a project");
      System.out.println("\tOption 0: Exit program");
      System.out.print("Input the option number to get started: ");

      //Store main menu selection
      mainMenuSelection = input.nextInt();

      //Cases based on main menu selection
      switch(mainMenuSelection){

      //Handle Option 1: Add a new project
      case 1:
          System.out.println();
          System.out.println("Your current list of projects are:");
          System.out.println(projectNames);
          System.out.println();

          //Validate that PM wants to move forward or exit
          System.out.println("Would you still like to add a new project?");
          System.out.println("\tOption 1: Yes");
          System.out.println("\tOption 2: No");
          System.out.print("Input the option number you would like to move forward with: ");
          addProjectSelection = input.nextInt();

          //Handle selection - add a new project or exit
          switch(addProjectSelection){

            //Add new project
            case 1:
              System.out.println();
              System.out.println("Let's add a new project!");
              System.out.print("Enter the project name: ");
              String projectName = keyboardInput.nextLine();
              projectNames.add(projectName);
              System.out.println();
              System.out.println("You added " + projectName + " to your list of projects!\n");
              break;

            //Exit and do not add new project
            case 2:
              System.out.println();
              System.out.println("Okay! We won't add a new project. Let's return to the main menu.\n");
              break;

            //Inform PM that their selection is invalid
            default :
              System.out.println();
              System.out.println("This is not a valid selection. Please try again.\n");
          
          }
          break;

      //Handle Option 2: Add a new status update
      case 2: 
          System.out.println();
          System.out.println("Your current list of projects are:");
          System.out.println(projectNames);
          System.out.println();
          System.out.println("Which project would you like to add a status update to?");
          System.out.print("Input the position number of the project you would like to add a status update to: ");
          addStatusSelection = input.nextInt();
          addStatusSelection--;

          //Validate that the selected project is in the array
          if (addStatusSelection > -1 && addStatusSelection <= projectNames.size()) {
            System.out.println();
            System.out.println("You selected " + projectNames.get(addStatusSelection) + "\n");

          //Collect additional status information
          String[] tempStatus = new String[6];
          tempStatus[0] = projectNames.get(addStatusSelection);
          System.out.print("\nInput date in MM/DD/YY format: ");
          tempStatus[1] = keyboardInput.nextLine();
          System.out.print("\nInput scope status (On Track or Off Track): ");
          tempStatus[2] = keyboardInput.nextLine();
          System.out.print("\nInput timeline status (On Track or Off Track): ");
          tempStatus[3] = keyboardInput.nextLine();
          System.out.print("\nInput budget status (On Track or Off Track): ");
          tempStatus[4] = keyboardInput.nextLine();
          System.out.print("\nInput known risks: ");
          tempStatus[5] = keyboardInput.nextLine();
          
          //Add new, full status update
          projectStatuses.add(tempStatus);
          System.out.println("\nYou added the following status:\n" + Arrays.toString(projectStatuses.get(projectStatuses.size()-1)) + "\n");
          }
          else {
            System.out.println("This is not a valid selection. Please try again.\n");
          }
          break;

      //Handle Option 3: Recall all historical status updates for a project
      case 3:
          System.out.print("\nWhich project would you like to see past status updates for?");
          projectForHistory = keyboardInput.nextLine();

          //Loop through the previous status and pull all the status updates for the selected project
          for (int i = 0; i < projectStatuses.size(); i++) {
            String[] statusList = projectStatuses.get(i);
            for (int j = 0; j < statusList.length; j++) {
              if (statusList[j].equals(projectForHistory)) {
                System.out.println(Arrays.toString(projectStatuses.get(i)));
              }
            }
          }
          System.out.println();
          break;

      //Handle Option 0: Exit program
      case 0: 
          System.out.println();
          System.out.println("Thank you for using the project management knowledge repository! Goodbye!");
          System.exit(0);
          break;

      //Handle invalid selection
      default :
          System.out.println();
          System.out.println("This is not a valid menu option. Please select another.\n");
          break;

      }
    }
  }
}
