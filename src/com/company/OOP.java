package com.company;
//<editor-fold desc="Access Modifiers">
/*
-
    Private     - only inside the class
    Protected   - can access by inherited class in the same package
    Default     - can access by inherited class outside the package also
    Public      - Everywhere
*/
//</editor-fold>
//<editor-fold desc="Static & Non-static">
/*
-
   1.Variable
    If a variable is static it belongs to class rather than to instance also known as CLASS VARIABLE
    Classname.staticVariable
   2.Method
    If a method is static it belongs to class also known as CLASS METHOD
    Classname.staticMethod()
    -The static method can not use non-static data member or call non-static method directly.
    -this and super cannot be used in static context.
   3.Static Block
    It is used to initialize the static data member.
    It is executed before the main method at the time of classloading.

*/
//</editor-fold>
//<editor-fold desc=" Constructors">
/*

    -Default
    -Parameterized
    -Copy Constructor
*/
//</editor-fold>
//<editor-fold desc="this & super">
/*
two special references each instance has
1.this
    this.variableName
    this.methodName()
    this(...) // can be used only inside the constructor
2.super
    super.parentVariable
    super.parentMethod()
    super()//only inside child constructor its added default at the first line of the constructor by compiler
*/
//</editor-fold>
//<editor-fold desc="Encapsulation">
/* DATA HIDING (Encapsulation & Abstraction)

    ENCAPSULATION
    As a rule of thumb,
    a good convention is to declare all the data members or instance variables of a class private.
    This will restrict direct access from the code outside that class.

*/
//</editor-fold>
//<editor-fold desc="INHERITANCE">
/*  INHERITANCE -IS a Relationship
            class parent{ }
            class child extends parent{}
    what does child class have?
    An object of the child class can use:
        +All non-private members defined in the child class.
        +All non-private members defined in the parent class.

    super
    super.parentVariable
    super.parentMethod()
    super()//only inside child constructor its added default at the first line of the constructor by compiler

    Types of Inheritance
        Single
        Multilevel
        Multiple
        Hierarchical
        Hybrid

    Advantages
        Code Re-usability
        DRY
        Extensibility
        Data hiding

* */
//</editor-fold>
//<editor-fold desc="POLYMORPHISM">
/*  POLYMORPHISM - many forms
    achieved using method overloading(compile time or static) and method overriding (run time or dynamic)
        Method-overriding needs inheritance and there should be at least one derived class.
        Derived class(es) must have the same declaration, i.e., access modifier, name, same parameters and same return type as the method as of the base class.
        The method in the derived class(es) must have different implementations from each other.
        The method in the base class must be overridden in the derived class.
        Base class/method must not be declared as a final class.
    *****Private and final methods can not be overridden DUE TO INHERITANCE INVOLVED*******

* */
//</editor-fold>
//<editor-fold desc="Static & DYnamic Binding">
/* $$ Static & DYnamic Binding
When type of the object is determined at compiled time(by the compiler), it is known as static binding.
If there is any private, final or static method in a class, there is static binding.

When type of the object is determined at run-time, it is known as dynamic binding.
*/
//</editor-fold>
//<editor-fold desc="Aggregation">
/*
 Aggregation & Composition
    Aggregation is a part of relationship
    -----------------------------------------------------------------------
    class Country {

    private String name;
    private int population;

    public Country(String n, int p) {
      name = n;
      population = p;
    }
    public String getName() {
      return name;
    }

}

class Person {

    private String name;
    private Country country; // An instance of Country class

    public Person(String n, Country c) {
      name = n;
      country = c;
    }

    public void printDetails() {
      System.out.println("Name: " + name);
      System.out.println("Country: " + country.getName());
    }

}
 */
//</editor-fold>
//<editor-fold desc="Composition">
/*
    -----------------------------------------------------------------------
    Composition is has a relationship
    -----------------------------------------------------------------------
            class Engine {

          private int capacity;

          public Engine(){
            capacity = 0;
          }

          public Engine(int cap) {
            capacity = cap;
          }

          public void engineDetails() {
            System.out.println("Engine details: " + capacity);
          }

        }

        class Tires {

          private int noOfTires;

          public Tires() {
            noOfTires = 0;
          }

          public Tires(int nt) {
            noOfTires = nt;
          }

          public void tireDetails() {
            System.out.println("Number of tyres: " +  noOfTires);
          }

        }

        class Doors {

          private int noOfDoors;

          public Doors() {
            noOfDoors = 0;
          }

          public Doors(int nod) {
            noOfDoors = nod;
          }

          public void doorDetails() {
            System.out.println("Number of Doors: " + noOfDoors);
          }

        }

        class Car {

          private Engine eObj;
          private Tires tObj;
          private Doors dObj;
          private String color;

          public Car(String col, int cap, int nt, int nod) {
            this.eObj = new Engine(cap);;
            this.tObj = new Tires(nt);;
            this.dObj = new Doors(nod);

            color = col;
          }

          public void carDetail() {
            eObj.engineDetails();
            tObj.tireDetails();
            dObj.doorDetails();
            System.out.println("Car color: " + color);
          }

        }

        class Main {

          public static void main(String[] args) {
            Car cObj = new Car("Black", 1600, 4, 4);
            cObj.carDetail();
          }
        }
    -----------------------------------------------------------------------
*/
//</editor-fold>
public class OOP {
    static{System.out.println("static block is invoked");}

}

