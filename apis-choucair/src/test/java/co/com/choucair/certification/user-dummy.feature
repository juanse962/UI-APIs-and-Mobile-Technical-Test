Feature: Testing Dummy API using Karate DSL

  Background:

    * url baseUrl

    * def templatePost = read('classpath:co/com/choucair/certification/utils/post_request.json')
    * def templateUpdate = read('classpath:co/com/choucair/certification/utils/update_request.json')
    * def rnd = Math.floor(Math.random() * (max - min + 1) + min)

    * set templatePost.data.id = rnd
    * set templatePost.data.name = name + rnd
    * set templatePost.data.salary = rnd
    * set templatePost.data.age = rnd
    * set templateUpdate.name = name
    * set templateUpdate.salary = rnd
    * set templateUpdate.age = rnd


  Scenario: Get employees
    Given path 'employees'
    When method Get
    Then assert responseStatus == 200 || responseStatus == 429


  Scenario: Create employee
    Given path 'create'
    And header Content-Type = 'application/json'
    And request templatePost
    When method Post
    Then assert responseStatus == 200 || responseStatus == 429


  Scenario: Update an employee
    Given path 'update/' + rnd
    And header Content-Type = 'application/json'
    And request templateUpdate
    When method Put
    Then assert responseStatus == 200 || responseStatus == 429


  Scenario: Delete an employee
    Given path 'delete/' + rnd
    When method Delete
    Then assert responseStatus == 200 || responseStatus == 429
