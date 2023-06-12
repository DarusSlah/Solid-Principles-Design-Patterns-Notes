# Solid-Principles-Design-Patterns-Notes
Design Patterns in Java Notes 

Design Pattern 

A solution to a problem in a context. 

An example of an pattern? 

I'm in a restaurant, ready to ask for the check 

I forgot my wallet at my house 

Run out of the restaurant while the waiters are not watching 

 

Important aspects of patterns  

Recurring problem 

Reusable solution  

Name 

Design Pattern  

A Reusable and named solution to a recurring problem in a context. 

 

OOP Building Blocks  

Abstraction  

Essential details 

Hiding complexity 

In java:  

Interfaces  

Abstract classes 

 

Encapsulation 

Information hiding 

Separate behavior that changes 

 

Inheritance 

Inherits from another class: 

Methods  

Properties 

Avoid duplicated code 

In Java:  

 Extending a class  

Implementing an interface 

 

Polymorphism 

Subclass stands in for the superclass 

Actual object type is decided at runtime 

SOLID Principles  

Single responsibility  

Open-closed  

Liskov substitution 

Interfaces segregation 

Dependency injection 

Other Principles  

Don’t repeat yourself (DRY) 

Encapsulate what changes  

Favor composition over inheritance 

Programming to an interface, not an implementation 

Principles VS. Patterns 

You don’t have to start with principles  

Principles – Low level knowledge 

Patterns – High Level knowledge 

Proven solutions 

Pattern classification 

Purpose 

Creational 

Abstract factory  

Builder 

Singleton 

Prototype 

Factory method 

 

Behavioral 

Visitor  

Observer 

Chain of Responsibility 

State 

Mediator 

Memento 

Template Method 

Command 

Iterator 

Strategy 

 

Structural 

Decorator  

Bridge  

Proxy 

Composite  

Flyweight  

Adapter 

Facade  

Why should learn patterns  

Game rules are not enough 

Knowledge  

In football  

Playbook  

Coach patterns capture expert knowledge 

Well-designed Software is: 

Flexible Easy to maintain  

Reusable 

 

 
Design Pattern Benefits 

 
 

Patterns are about reusability 

Find the appropriate design 

﻿﻿Find classes and interfaces 

﻿﻿Determining object granularity 

Communication and documentation 

﻿﻿Shared vocabulary 

﻿﻿Precise and complete 

 
 

Problems with This Design 

 
 

Violates the Liskov substitution principle 

It's not flexible 

- And if we need to support animated GIFs? 

 
 

Strategy Pattern 

Defines a family of algorithms, encapsulates each one, and makes them interchangeable. 

Strategy lets the algorithm vary independently from clients that use it. 

 
 

Change a part of a system independently of all other parts 

Swap out behavior at run-time 

 
 

The Strategy Pattern Is a Mix Of: 

 
 

Encapsulating what changes 

Favoring composition over inheritance 

Open-close principle 

Programming to interfaces 

 
 

Object Behavioral Patterns 

Visitor 

Strategy 

Observer 

Chain of Responsibility 

Command 

State 

Mediator 

Iterator 

Memento 

 
 

 
 

Behavioral Patterns You Should Know 

Strategy and State 

Command 

Observer 

Template method 

 
 

A Strategy Is.. 

A plan 

An approach 

An algorithm 

 
 

 
 

Multiples Strategies Have.. 

Same 

- Inputs 

Outputs 

Different 

Implementations 

 
 

Abstract Methods and Hooks 

 
 

Abstract Methods 

﻿﻿Required 

﻿Steps that must be customized 

Hooks 

﻿﻿Optional 

﻿﻿Abstract class may provide a default implementation 

 
 

Creational Patterns You Should Know 

 
Singleton 
Factory and Abstract Factory 
Builder 

 
 

Problems to Be Solved by the Implementation 

Reflection 

Serialization 

Class loaders 

 
 

Types of Factories 

Simple factory 

Factory method 

Abstract factory 

 
 

The Facade Pattern 

Provides a simplified interface to use subsystem classes 

- It doesn't encapsulate subsystem classes 

It may provide additional functionality 

It decouples a client from the subsystem 

 
 

Common Uses of a Proxy 

 
 

Remote Calls 

Security 

Cache 

Virtual 

 
 

How Is Proxy Related to Other Patterns? 

Facade 

Decorator 

Adapter 

 
 
 
 
 SOLID principles are the foundation on we can build clean, maintainable architectures. 

Problems appear when SOLID principles are not used: 

Code Fragility – tendency of software to break in many places every time it is changed. 

Code Rigidity –tendency for software to be difficult to change, even in simple ways. Every change causes a cascade of subsequent changes in independent modules. 

Rigidity and Fragility are symptoms of high technical debt. 

 

Technical Debt – the cost of prioritizing fast delivery over code quality for long periods of time. 

 

The choice you have to make:  

Fast Delivery  

Easiest fix/change  

Fast  

Poor written code  

 

Code Quality  

Takes more time  

Adds a bit of complexity 

Maintainable  

 

Technical Debt Facts  

No matter how good the team is, debt will accumulate over time  

Left uncontrolled, it will kill your project  

The key is to keep it under control 

 

Controlling Technical Debt 

Write code  

Pay Debt (Refactor) 

Write More Code  

Pay Debt (Refactor again) 

Cycle continues 

 

SOLID Principles  

Acronym for 5 software design principles that help us to keep technical debt under control. 

Single Responsibility Principle 

Open/Closed Principle 

Liskov Substitution Principle 

Interface Segregation Principle 

Dependency Inversion Principle  

 

Top Benefits of SOLID Code  

Easy to understand and reason about  

Changes are faster and have a minimal risk level 

Highly maintainable over long periods of time 

Cost effective 

 

Single Responsibility Principle  

Every function, class or module should have one and only one reason to change. 

 

Examples of Responsibilities 

Business logic 

User Interface  

 Persistence  

Logging 

Orchestration 

Users 

 

A Habit Software engineers need to develop: 

Always identify the reason to change that your components have and reduce them to a single one. 

Why use Single Responsibility Principle? 

It makes code easier to understand, fix, and maintain 

Classes are less coupled and more resilient to change 

More testable Design 

 

Symptoms of not using SRP 

Code is more difficult to read and reason about  

Decreased quality due to testing difficulty  

Side effects  

High coupling  

Coupling  

The level of inter-dependency between various software components 

Open closed Principle  

Classes, Functions, and modules should be closed for modifications, but open for extension. 

Closed for modification 

Each new feature should not modify existing source code 

Open for extension  

A component should be extendable to make it behave in new ways 

Why Should You Apply OCP? 

New features can be added easily and with minimal cost 

Minimizes the risk of regression bugs  

Enforces decoupling by isolating changes in specific components works along with SRP 

 Progressively Applying the OCP  

Start small 

Make changes inline  

Bug fixes can be implemented this way 

More changes  

Consider inheritance  

 

Many changes/ dynamic decisions 

Consider interfaces and design patterns like Strategy 

API  

A contract/Agreement between different software components on how they should work together. 

Key Point 

A public framework or API is under your control. But clients might use it in ways that you aren’t aware of. 

 

Best Practices for changing APIs 

Do not change existing public contracts: data classes, signatures 

Expose abstractions to your customers and let them add new features on top of your framework 

If a breaking change is inevitable, give your clients time to adapt 

 

Liskov Substitution Principle  

If S is a subtype of T, then object of type T in a program may be replaced with objects of type S without modifying the functionality of the program. 

Relationships  

Is A 

Square is kind of rectangle  

An ostrich is a bird  

Is Substitutable by  

Is the class rectangle fully substituted by the class square? 

 

Incorrect relationships between types cause unexpected bugs or side effects. 

 

Apply the LSP in a Proactive Way  

Make sure that a derived type can substitute its base type completely  

Keep base classes small and focused  

Keep interfaces lean 

 

Interface Segregation Principle 

Clients should not be forced to depend on methods that they do not use. 

The word “interface” in the principle name does not strictly mean a java interface. 

The ISP Reinforces Other Principles  

By keeping interfaces small, the classes that implement them have a higher chance to fully substitute the interface 

Classes that implement small interfaces are more focused and tend to have a single purpose 

Benefits of Applying the ISP 

Learn interfaces dependencies on unused members and reduce code coupling 

Code becomes more cohesive and focused  

It reinforces the use of the SRP and LSP 

Symptoms of interface pollution 

Interfaces with lots of methods  

Interfaces with low cohesion 

Client throws exception instead of implementing method 

Client provides empty implementation  

Client forces implementation and becomes highly coupled  

Fixing interfaces pollution 

Your own code  

Breaking interfaces is easy and safe due to the possibility to implement as many interfaces as we want 

External legacy code  

You can’t control the interfaces in the external code, so you use design patterns like “Adapter”. 

Dependency Inversion Principle  

High level modules should not depend on low level modules; both should depend on abstractions. 

Abstractions should not depend on details. 

Details should depend upon abstraction. 

 
High level Modules  

Modules written to solve real problems and use cases  

They are more abstract and map to the business domain 

What software should do  

Low Level Modules  

Contain implementation details that are required to execute the business polices 

That are considered the “plumbing” or “internals” of applications 

How the software should do various tasks 

Examples of Low Level Modules  

Logging  

Data access 

Network communication  

IO 

Abstraction 

Something that is not concrete. 

Something that you can not “new” up. In java applications, we tend to model abstractions using interfaces and abstract classes. 

Dependency Injection  

A technique that allows the creation of dependent object outside of a class and provides those objects to a class.  

 

Inversion of Control  

Inversion of Control is a design principle in which the control of object creation, configuration, and lifecycle is passed to a container or framework. 

You don’t “new” up objects  

They are created by someone else (IoC container) 

Control of object creation is inverted  

It's not the programmer, but someone else who controls the objects 

It make sense to use it for some object in an application (services, data access, controllers) 

For others (entities, value objects) it doesn’t 

IoC Container Benefits  

Makes it easy to switch between different implementations at runtime  

Increased program modularity 

Manages the lifecycle of objects and their configuration 

Spring bean  

Objects used by your application and that are managed by the Spring IoC container. They are created with the configuration that you supply to the container. 
