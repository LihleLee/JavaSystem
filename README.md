Account and Book Manager

A simple console-based Java application that manages user accounts and a book collection. This project demonstrates core Object-Oriented Programming (OOP) principles, including classes, inheritance, polymorphism, exception handling, and collection usage.

Table of Contents:
Features
Technologies
Project Structure
Setup
Usage
Classes Overview
Example Usage
Contributing

Features:
Account Management: Supports creation of two account types, Student and Admin, each with unique properties.
Book Management: Allows adding books to a collection with title, author, and ISBN.
Display Information: Provides options to display all accounts and all books.
Error Handling: Gracefully handles invalid inputs and unexpected user errors.

Technologies
Java: Built with Java SE, demonstrating fundamental OOP concepts.
Collections: Uses ArrayList to manage collections of accounts and books.
Project Structure

AccountBookManager/
├── Account.java           # Superclass for account-related functionality
├── StudentAccount.java    # Subclass for student-specific accounts
├── AdminAccount.java      # Subclass for admin-specific accounts
├── Book.java              # Book class representing a book entity
└── Main.java              # Main class containing program logic and user interface
Setup
Prerequisites: Ensure you have Java JDK installed. Check by running:


java -version
Clone the repository or create the project files in your directory.

Compile the classes:
javac *.java

Usage:
To start the application, run the Main class:
java Main

Menu Options:
Create Student Account: Adds a new student account with a username, password, and student ID.
Create Admin Account: Adds a new admin account with a username, password, and admin level.
Add Book: Adds a new book to the collection with a title, author, and ISBN.
Display All Accounts: Displays information for all created accounts.
Display All Books: Displays information for all added books.
Exit: Exits the application.

Classes Overview:
Account (Superclass)
Contains common attributes (username, password) and a placeholder method displayRole() to be overridden.

StudentAccount (Subclass)
Extends Account and adds a studentID attribute.
Overrides displayRole() to display role-specific information.

AdminAccount (Subclass)
Extends Account and adds an adminLevel attribute.
Overrides displayRole() to display role-specific information.

Book
Contains attributes (title, author, isbn) with a method displayInfo() for printing book details.

Main
Controls user interaction, input handling, and menu navigation.
Includes exception handling for invalid input and organizes program flow.

Example Usage
plaintext

Options:
1. Create Student Account
2. Create Admin Account
3. Add Book
4. Display All Accounts
5. Display All Books
6. Exit

Enter your choice: 1
Enter username: john_doe
Enter password: secret123
Enter student ID (integer): 1001
Student account created successfully.

Enter your choice: 5
Book List:
Title: Java Basics
Author: John Smith
ISBN: 978-1234567890
