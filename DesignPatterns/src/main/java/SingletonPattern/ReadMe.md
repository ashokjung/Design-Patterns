
#   Singleton Pattern
    Singleton is a creational design pattern that lets you ensure that a 
    class has only one instance, while providing a global access point to
    this instance.

## Concept
    Only One instance created  
    Guarantees control of a resource        
    Lazily Loaded  
    Thread Safe

## Examples 
      Runtime  
      Logger   
      Spring Beans  
      Graphics Manager  
      Database Connections


## Design Consideration
    Class is responsible for the lifecycle  
    Static in Nature  
    Needs to be thread Safe  
    Private Instance  
    Private Constructor  
    Requires No Parameter for the Constructor  

## Everyday Example - Runtime Environment

    Runtime singletonRuntime = Runtime.getRuntime();
    singletonRuntime.gc();
    System.out.println(singletonRuntime);
    
    Runtime anotherInstance = Runtime.getRuntime();
    System.out.println(anotherInstance);
    if(singletonRuntime==anotherInstance) {
    System.out.println("They are the same instance");
    }

## Lazy Load 
    This line of code will try to instantiate the class on the runtime

    private static DbSingleton instance = new DbSingleton();

    If we dont initate in the first place we can have a Lazy Load 

    private static DbSingleton instance = null

    If we choose for the Lazy load , this can be substantial improvement in application performance 

## Thread Safe
    We make the class as thread safe by using the  volatile keyword as shown below.

    private static volatile DbSingleton instance = null;

##  Private Constructor
    Having a Private Constructor would ensure the enduser cannot instiate the class using new keyword

    We can also extend the private construtor to ensure the reflection cannot be used 

         private DbSingleton(){
           if(instance!=null){
               throw new RuntimeException("Use getInstance() method to create ");
           }
       }


## Singleton Summary
