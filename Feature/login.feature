

Feature: 	Test letcode site
#Backgournd:Given open the browser  --> backgournd is used for common scenario not duplicated in the secenrio
 #  @ is used for tag concept to run sepecific scenario
 @smoke
  Scenario: Test Login function
    Given open the browser
    
    When enter the username and password 
    And click  on the SubmitButton
    Then Verify the Current Title
    
    
   #@sanity
    #Scenario: Test Login function
    #
    #And max browser
    #When enter the username and password 
    #And click  on the SubmitButton
    #Then Verify the Current Title
    
    

 