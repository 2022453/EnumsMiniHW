/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumsminihw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//https://github.com/2022453/EnumsMiniHW

/**
 *
 * @author paulooliveira
 */
public class EnumsMiniHW {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        //create a list to store all the names
        List<String> allNames = new ArrayList<>();
        
        
        //file reader
        File file = new File ("MOCK_DATA.csv");
        
        
        
        // print their name using scanner also try / catch to get errors.
        try (Scanner scanner = new Scanner (file)) {
            
            while (scanner.hasNext()){
                    String line = scanner.nextLine();
                        allNames.add(line);
                        
//                         System.out.println(line);
                    
            }
                         
                          
        } catch (FileNotFoundException e) {
    
              System.out.println("File not found");
        
             
              
              
                     }
    
        
        // size and number of teams.
    int teamSize = 6;
    int numberOfTeams = 20;
    
    // mix the names before starting creating the teams
    Collections.shuffle(allNames); 
    
    
    // list to store the teams.
    List<List<String>> teams = new ArrayList<>();
    
    
    // array for the team' names. 
        String[] teamNames = { 
            "Team A",
            "Team B",
            "Team C",
            "Team D",
            "Team E",
            "Team F",
            "Team G",
            "Team H",
            "Team I",
            "Team J",
            "Team K",
            "Team L",
            "Team M",
            "Team N",
            "Team O",
            "Team P",
            "Team Q",
            "Team R",
            "Team S",
            "Team T",
            };
    
    
    for(int i = 0; i < numberOfTeams; i++) { 
        
        
        //list of each team
        List<String> team = new ArrayList<>();
        
        
        //select a team name from the array based on the index 
        String teamName = teamNames [i % teamNames.length];
        team.add(teamName);
        
        
        // add team members to the team
        while(team.size() < teamSize && !allNames.isEmpty()) { 
            String member = allNames.remove(0);
            team.add(member);
   
        }
        
        
        //add the team to the list of team.
        teams.add(team);
    }
    
    // print the team names and their members.
            for (int i = 0; i < teams.size(); i++){ 
            List<String> team = teams.get(i);
            System.out.println("team Name: " + team.get(0));
            
        
        
        for (int t = 1; t < team.size(); t++) { 
            System.out.println("Member " + (t) + ":" + team.get(t));
        }
        
            
            }
    }

}
  
