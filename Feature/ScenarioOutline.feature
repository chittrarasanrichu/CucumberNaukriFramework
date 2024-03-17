#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Hotel test
  I going to test the hotel.com



  @tag2
  Scenario Outline: Location Testing
    Given launch the browser "<URL>" 
    When Enter the location"<LOCO>"
    And click on search button
    Then verify the result

    Examples: 
      | URL |LOCO| 
      |https://in.hotels.com/?locale=en_IN&siteid=300000036&semcid=HCOM-IN.B.GOOGLE.BT-c-EN.GT&semdtl=a118251106631.b1142893986578.g1kwd-70666411.e1c.m1Cj0KCQiAyeWrBhDDARIsAGP1mWQNz21k1qGGQfSkheA0QGzAousken0F0ohAAhenfWJ_XJUo5mjtDCQaArTqEALw_wcB.r17178453d941252bedac29a2f614e6bf5ca5132de1916fb27cd259738a6d6b337.c1vK0sb6-nJ_tWidZoUMrM7g.j11007809.k1.d1624808590126.h1e.i1.l1.n1.o1.p1.q1.s1.t1.x1.f1.u1.v1.w1&gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWQNz21k1qGGQfSkheA0QGzAousken0F0ohAAhenfWJ_XJUo5mjtDCQaArTqEALw_wcB|chennai|
