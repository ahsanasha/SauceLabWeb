@CheckProducts
Feature: Checking items
  As a user, I want to able to see the item details

  Background:
    Given User is already on home page

  @PositiveCase @CheckDetail @DetailBackpack
  Scenario: User check backpack detail
    When User clicks on the backpack label
    Then User will be navigates to the backpack detail
      | productName         | price |
      | Sauce Labs Backpack | $29.99 |
#
  #@PositiveCase @CheckDetail @DetailBaikeLight
  #Scenario: User check bike light detail
    #When User clicks on the bike light label
    #Then User will be navigates to the bike light detail
      #| productName           | price |
      #| Sauce Labs Bike Light | $9.99 |
#
  #@PositiveCase @CheckDetail @DetailBoltTShirt
  #Scenario: User check bolt t-shirt detail
    #When User clicks on the bolt t-shirt label
    #Then User will be navigates to the bolt t-shirt detail
      #| productName             | price  |
      #| Sauce Labs Bolt T-Shirt | $15.99 |