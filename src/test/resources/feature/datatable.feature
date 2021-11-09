@Data
Feature: Data table

  #Scenario Outline: Title of your scenario outline
    #Given I have to navigate to "<website>"
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  | website                |
      #| name1 |     5 | success | The Internet HerokuApp |
      #| name2 |     7 | Fail    | flipkart               |

  Scenario: data table
    #Given I want to write a step with name1
    #When I check for the 1 in step
    #Then I verify the super in step
    Given I have to navigate using data table
    	|user1|pass1|
    	|user2|pass2|
    	
     
