# Sop-2

## What is Anti-pattern?


## Creatation Design Pattern
### Singleton
It's pattern that you can create only one object. how does it work?  
It will set private constructor on the class and create unique attribute for checking.  
It sets some method to be public static for create constructor. after that when it's created, it'll set unique to be true.  


### Phototype
When you want to clone something from some object, but you don't know how to assign attribute.   
This pattern will solve this problem, so how does it work? you have to create interface cover all of class that you want.  
And you have to create some method to clone it, so when you want to clone some object you can create new object and call that method.  
