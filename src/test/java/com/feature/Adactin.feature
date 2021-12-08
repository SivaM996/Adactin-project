Feature: Hotel booking in adactin applictaion
@AD1
Scenario Outline: Login page
Given user Launching The Application
When user Entering The "<UserName>" In The UserName Field
And user Entering The "<Password>" In The Password Field
Then user Click On The Login Page And It Navigates To The Search Hotel

Examples:
|UserName|Password|
|karthick|kannan|
|SivaM996|shivashiva12345|
|SivaM996|shivashiva12345|

Scenario: Search Hotel Page
When user Select The Hotel Location 
And user Select The Hotel 
And user Select The "Super Deluxe" Type
And user Select The Number Of Rooms
And user Clearing The Default Date And Entering The required Date In The CheckIn Field
And user Clearing The Default Date And Enterinf The required Date In The CheckOut Field
And user Select the Adult Per Room
And user Select The Children Per Room
Then User Click On The Search Button And It Navigates To The select Hotel

Scenario: Select Hotel Page
When user Click On The Select Radio Button
Then User Click On The Continue Button And It Navigates To The Book A Hotel

Scenario: Book A Hotel Page
When user Entering The First Name In The First Name Field
And user Entering The Last Name In The Last Name Field
And user Entering The Billing Address In The Billing Address Field
And user Entering The Credit Card Number In The Credit Card Field
And user Selecting The Credit Card Type
And user Selecting The Month In The Expiry Date Field
And user Selecting The Year In The Expiry Year Field
And user Entering The cvv Number In The Cvv Number Field
Then user Click On The Book Now Button And It Navigates To The Booking confirmation Page
  

Scenario: Booking Confirmation Page
When user Click On The My Itienary Button
Then and Navigated To Booked Itinerary Page

Scenario: Booked Itinerary Page
When user Click on Order Id 
And user Click On The Cancel Selected Button And Alert is Popped up
And user Click On Ok On The Alert Box And Booking Is Cancelled 
Then user Click On The Logout Button And Successfully Logged Out 


 