#Author: Julian Esteban Polanco Sogamoso

@stories
Feature: Utest
  As a User, I want to register in the website UTest.com.

  @register
  Scenario: Successful Register
    Given Than Julian want to register in the website
    When He complete the first part of the register
      | FirstName      | LastName         | EmailAddress                    | BirthMonth | BirthDay | BirthYear | Languages |
      | Julian Esteban | Polanco Sogamoso | jpolancos+54@choucairtesting.com | September  | 14       | 2002      | Spanish   |
    And Complete the second part
      | City   | Zip    | Country  |
      | Soacha | 250054 | Colombia |
    And Complete the third part
      | oSComputer | VersionOSComputer | LanguageOSComputer | BrandMobile | ModelMobile | OSMobile   |
      | Windows    | 7 64-bit          | English            | Xiaomi      | Poco X3 Pro | Android 11 |
    And Complete the fourth part
      | password    | confirmPassword |
      | Julian1402* | Julian1402*     |
    Then He can se the welcome message
