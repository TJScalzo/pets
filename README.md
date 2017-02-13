# pets
Introduction to inheritance using `Pet` class as a starting point for a hierarchy:
- Here we will add class which extend `Pet` such as `Dog`.
- Each of these classes will have an is-a relationship with `Pet`.
- There will also be a class `Zoo` with a has-a or uses relationship with Pet and any sub-class of `Pet`.

### Challenge 1
1. Look at the "generic" `Pet` class I have given you via Github and try it out in BlueJ. It has the following:
	- Fields:
 - `name`: - A String to represent the name of the Pet i.e "Fluffy"
 - Constructors:
 - A default that sets the name to the very boring "default pet name"
 - Another that takes the name as a String parameter
	- Methods:
 - Accessor for name
 - Method called `speak` which returns a very boring String "default Pet sound"

**(If you did not get the `Pet` from Github just create a new BlueJ project and copy it from the last page in this doc.)**

2. Come up with an original animal which extends `Pet` **i.e Dog extends Pet**
 - The sub-class should contain the following:
 1. A default constructor - i.e public Dog() where you make up a default name i.e "fido"
 2. A constructor that takes a String parameter for the name- i.e. public Dog(String theName)
 3. A method for making noise which replaces `speak` of the super-class `Pet`
3. TEST YOUR sub-class THOROUGHLY - MOST IMPORTANT PART OF THIS EXERCISE

Here are some tests for you to see if you have done it correctly and help you understand inheritance in Java:
	<br>**Test #1:** Create an object using the default constructor for your sub-class and look inside the object you created to see it's fields. What do you see? If you see more than 1 name field you have not used Inheritance correctly. You have created a shadow field you do not need. Fields from the super-class are inherited and should NOT be duplicated in sub-classes. Fix this!
 <br>**Test #2:** Look at what you have inside the { } for your default constructor. If you are trying to set the name field you are probably having a problem. Since the name field is in the super-class Pet, the question is how to we set it's value because it is PRIVATE to your class. Should we make it public? ABSOLUTELY NOT!
<br>The answer lies in the constructors. Since constructors are PUBLIC you CAN use the default constructor from the super-class. BUT you refer to it as `super()` not `Pet()`. Super always means the class just above the one you are in. So in the constructors for your sub-class add code to call the constructors via `super()`
<br>Get things working so you can create an object from your sub-class and put the name of your choice into the name field in the object.
	<br>**Test #3:** Now that your objects get created correctly, right-click and try your method. You should have ONLY one accessor method for name NOT two. Just like the field you don't need to add it because it is inherited and you do NOT want to change how it works. AND when you right click on the object in Bluej, you look for method under ***"inherited from Pet"***. Try out `getName()` and make sure it works.
	<br>**Test #4:** Finally, for the `speak` method you DO want to change how it behaves from how it behaves in `Pet`. You no longer want "default Pet sound." So you need to OVERRIDE speak by creating another method spelled exactly the same as the one in the super-class. If you spelt speak differently or called it something else, change it to be exactly the same as in super-class. If you do it right it should look like this when you when you right-click on the sub-class object in BlueJ.
<br>Notice that the speak from `Pet` says it has been "redefined" which is another term for overridden. Get speak working correctly.

IF your class passes all these tests, congratulations - you have successfully used inheritance in Java!


### Challenge 2
Create another class called `Zoo` in the same project as `Pet` and your sub-class of `Pet`.
<br>`Zoo` should have the following:
 - A field called theZoo which is an array of `Pet`s
 - A default constructor which creates and an array of length 10 that contains 5 `Pet` objects and 5 objects of your sub-class.
 - A method called `soundOff()` which loops through the array `theZoo` and prints the result of a call to speak on each object in the array

TEST THOROUGHLY IN BLUEJ

### Challenge 3
Add a second constructor to the `Zoo` class which takes an int as input for the number of `Pet`s in the zoo array.
<br>Use a loop in the constructor to create either `Pet` objects or objects from your sub-class of Pet.
Make it a 50/50 chance on which object gets created and put into the array. (`Math.random() < 0.5`)

TEST THOROUGHLY IN BLUEJ

### Challenge 4
Create a loud version of your sub-class which extends your existing sub-class. For example, a `loudDog` which when it speaks it says whatever `Dog` says twice. MOST IMPORTANTLY, if the manner in which the class above (i.e. `Dog`) speaks changes, the class extending it (i.e. `loudDog`) will NOT have to be updated. It will always just works as is - saying whatever `Dog` currently speaks twice in row. You will need to use `super` to do this but this time you will use `super` to call a method. NOTE: You only use `super` on a method when that method has been overridden - i.e. `super.speak()` refers to the speak in the class above (i.e. `Dog`) while `speak()` is the speak in the sub-class (i.e. `LoudDog`).

### Challenge 5
Look back at the `Pet` class. Do we ever really want the method speak in `Pet` to be actually called and return the String "default pet sound"? Or do we just want to force it to be overridden (redefined) in sub-classes with a better version that actually returns a sound that makes sense such as "bow wow"? Java has an answer for this called making a method **abstract**. When you make a method **abstract** you NO LONGER provide any body for the method. And once a class has at least one **abstract** method,  the whole class must be declared as **abstract**. Complete the following and **TEST THOROUGHLY IN BLUEJ**:
1. Change the speak method in the 1 class to be abstract:
  ```Java
  public abstract String speak();
  ```
	**Notice there is no body {} and there is just the method signature with a ; at the end.**
2. Make the `Pet` class abstract by changing its signature to:
```Java
public abstract class Pet
```
3. Think of another **abstract** method to add to the `Pet` class which all sub-classes should override. Add it to `Pet` and override it in your sub-class.
4. Once you make the `Pet` class abstract, the `Zoo` class will no longer work because in it you are making arrays of `Pet` objects. Fix this by changing your arrays to be made of your equivalent to `Dog` and `loudDog` objects instead of `Pet`'s and `Dogs`.
5. Add a method to your `Zoo` class which calls this new method on every object in the `theZoo` array.
6. Should we make `getName()` abstract - why or why not?
7. Can you create an object from an abstract class? Try it with `Pet` and see. Why do constructors exist in an abstract class such as `Pet`? What do non-abstract methods such as` getName()` still exist in an abstract class such as `Pet`?


### Challenge 6 (Interfaces)
This challenge is part of a separate project in BlueJ because it's all about interfaces. Therefore, it's part of a separate repo on GitHub. Go look at [this README](https://github.com/TJScalzo/Practice_with_Interfaces#interfaces-challenge-6).
