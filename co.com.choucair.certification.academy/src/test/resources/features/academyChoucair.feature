#Autor:Gustavo
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @academy
  Scenario: Search for a automation course
    Given That Gustavo wants to learn automation at the Academy Choucair
    |   strUser    |    strPassword    |
    |   glozadaf   |    Choucair2020*  |
    When He search for the course on the Choucair Academy platform
    |           strCourse              |
    |   Workshop de automatización     |
    Then  He finds the course called
    |           strCourse              |
    |   Workshop de Automatización     |