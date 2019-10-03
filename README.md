# OOPLab

#Lab-01
OOP Java Lab1: Classes and Objects
Fall 2019 (GCU - DCS)
Instructors: Muhammad Safyan/Fatima Mushtaq
Task-1: Basic Introduction to using BlueJ as an IDE - How do we create a class in BlueJ.

- How to add a method to a class?
- What is a Constructor?
- Where does the program start to run?
- Write a simple program called FirstProgram.java that prints the string “Hello World”.
  Task-2: Classes and Objects Exercise
  Part a) As we have established basic familiarity with using BlueJ. Let’s start with an
  exercise:

1. Create a class named as Book with the following attributes:

- Book:
- title: String
- author: String
- price: double
- quantity: int

2. Add a constructor with all the attributes of the class Book. (Hint: It should look like
   Book(name, author, price, quantity)
3. Add the getter and setter methods for the class Book.
4. Add another method called void display() that prints out all the values of the
   attributes.
5. Create another class called Main which will be your runner/test program. Add a main
   method to this class.
   Inside the Main Class/Main Method:
6. Create an object of type Book with an empty constructor/default constructor. [What
   error do you get and try to resolve it with the suggestion from BlueJ][2 points]
7. Create two instances of type Book and set it’s attributes using the setter methods.
8. Create another two instances of type Book using the argument constructor.
9. Call the display method of class Book for each object.
10. Instead of giving four different calls to display() method for each Book instance, use
    an array to store Book instances and write the call to display() method only once. [3
    Points]
    Part b) Now create a class named ‘Author’ with the following attributes: - Author:

- name: String
- email: String

2. Add an argument constructor with all the attributes of the Author.
3. Add the getter/setters methods for the attributes.
4. Add a method as boolean updateEmail(newEmail) for the class Author.
   (While implementing think of the single responsibility principle!) [1 Point]
5. Also add a method called void display() that prints out all the values of the attributes.
6. Compile to see there are no issues with your code.
   Now, go back to the Main class.
7. Create two different instances of type Author using the argument constructor and
   display it’s values using the display method.
   Part c) Change class Book.author attribute from String to the Author type as:
   Book:

- title: String
- author: Author
- price: double
- quantity: int

1. Compile your code and fix all the problems which just occurred due to the change of
   type from String to Author. [2 Point]
2. Notice the change in diagram between the classes Book and Author and Interpret for
   yourself the new relationship formed between the two classes. [2 Points]
   Part d) Draw Class Diagram and Object Diagram for the above problem: Book
   and Author
   Book:

- title: String
- author: Author
- price: double
- quantity: int
  Author:
- name: String
- email: String

#Lab-02
OOP Java Lab2: Object Interaction, Self Reliance, User Input
Fall 2019 (GCU - DCS)
Instructors: Muhammad Safyan/Atif Ishaq/Fatima Mushtaq
Task-1: Object Interaction (Continued from Lab-1)
Part a) From Lab1, recall that class Book and Author are two separate classes. Reuse the code the from the classes and only change class Book.author attribute from
type String to Author as:
Book:

- title: String
- author: Author
- price: double
- quantity: int

1. Compile your code and fix all the problems which just occurred due to the change of
   type from String to Author. [2 Point]
2. Notice the change in diagram between the classes Book and Author and Interpret for
   yourself the new relationship formed between the two classes. [2 Points]
3. Use of keyword this i.e. Self Reference. this is a reference to the current object — the
   object whose method or constructor is being called. The most common reason for using
   the this keyword is because a field has the same name as a parameter in the method or
   constructor.
   Task-2: User Interaction: Build a Number Guessing Game. [3 Points]
   In this task, we will get to use the input scanner to build a game for guessing a
   number, where the computer will generate a random number between 1-100, and the
   user gets 10 guesses to find out what that number is. When the game first starts, it
   should print a few sentences explaining what's going on. It should print the below lines:

- A number is randomly chosen between [1, 100]
- Now, it’s your turn to guess the number, you have 10 guesses.
- Your first guess is:
  To implement the logic of the game, follow these steps:
- Generate a random number between 1-100.
- Create a loop that asks the user to guess a number.
- Read the user's input and compare it to the random number.
- Let the user know if the guessed number was greater than or less than the
  random number.
- If they guessed the number right end the loop and tell them they've won.
- If they used up all 10 guesses end the loop and tell them they've lost.
  Task-3: Create a Java Program responsible for storing and managing Phone
  Contacts [5 Points]
  Let’s start by creating a class that's responsible for storing all contact information of a single
  person, it will look something like this:
  class Contact {
  String name;
  String phoneNumber;
  }
  Create a class called ContactsManager for managing all contacts as:
  class ContactsManager {
  Contact [] myContacts;
  int contactsCount;
  }
  Follow the instructions below to write your program:

1. The contactsCount starts from 0 and will increment every time we add a new contact later.
2. The myContacts array needs to be initialized using the new keyword and we chose to
   reserve enough space in the array to store up to 500 contacts.
3. Add a method to class ContactsManager named as:
4. addContacts(String name, String phoneNumber)
5. Add a method to class ContactsManager for searching a contact by name as:
6. Contact searchContacts(String name)
7. Write an driver program called Main and create a ContactsManager object called
   myContactsManager using the default constructor
8. Create a new Contact variable
9. Set the name to a friend's name
10. Set the phoneNumber field to their phone number
11. Call the addContact method in myContactsManager to add that contact
12. Add three more different Contacts
13. Search for a contact using the method searchContact and print out their phone number
