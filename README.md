# Sop-2

## What is Anti-pattern?
Anti pattern is a type of software development, which is opposite to design patterns that have no problem-solving patterns like design patterns. anti pattern is appropriate for jobs that are not complex.


## Creatational Design Pattern
The basic form of object creation could result in design problems or in added complexity to the design, which increase flexibility and reuse of existing code.
### Singleton
It's pattern that you can create only one object. how does it work?  
It will set private constructor on the class and create unique attribute for checking.  
It sets some method to be public static for create constructor. after that when it's created, it'll set unique to be true.  


### Phototype
When you want to clone something from some object, but you don't know how to assign attribute or do the same thing for many times.   
This pattern will solve this problem, so how does it work? you have to create interface cover all of class that you want.  
And you have to create some method to clone it, so when you want to clone some object you can create new object and call that method.  
espectially for Java, there is Clone method to clone someting, you just import to your class that you want to clone it.  

### Object Pool
An object pool is a container which contains a specified amount of objects. 
When an object is taken from the pool, it is not available in the pool until it is put back. 
Objects in the pool have a lifecycle: creation, validation and destroy.

Most of this pattern, it'll use on Client-Server or somthing that has many request.  
This pattern will solve about request from client or users who send request something.  
When many requests has sent to server, it may make server down.  
Object Pool organize users for use somthing and reduce traffic on network.  

### Functional Programming
There are 2 types, first is Pure function and the last is Impure function. so what is it?  
- Pure Function is function that has less 1 parameter.  
It's function that doesn't involve environment. What is that mean?
It means when you assign some input to pure function, it has to send output same value that you expect.  
- Impure Function is oppsite from Pure Function.  
It invovles environment. It's function that use global variable. It can't do test when you do like that. 



# LAB Service Discovery
