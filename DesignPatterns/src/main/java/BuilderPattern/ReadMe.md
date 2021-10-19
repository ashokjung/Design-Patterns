Builder Pattern is used , where we would like to handle construction 
of Objects that may contain lots of parameter & we would like to 
make Object Immutable once we are done constructing the Object.

## Concept 

###* Handles Complex Constructor 
When Considering a Builder , we would like to consider if the construction of an object is
complex

###* Large Number of Parameters
 A lots of setters and guarantying how the Objects gets build is quite difficult.

###* Immutability
  we can enforce Immutability once the Construction of Object is finished , which we cannot do 
  with a bunch of Getters & Setters

###* Examples from Java 8 
      - StringBuilder
      - DocumentBuilder
      - Locale.Builder


## Design Consideration

    * Flexible over telescopic Construtor
    * Static Inner Class , this will return instance of the class.
    * Calls Appropriate Constructor ,as no telescopic Constructors are found.
    * Negates the need for exposed Setters

## Everyday Example - StringBuilder

StringBuilder builder = new StringBuilder();
builder.append("This is an example");  
builder.append("of the builder pattern");  
builder.append("It has methods to implement");  
builder.append("42");  
System.out.println(builder.toString());  

 
