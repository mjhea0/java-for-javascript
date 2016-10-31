# Java for JavaScript Developers

## Why Java?

1. **Fast**: Java is fast! To execute a program you must first compile it down to byte code. The Java Virtual Machine (JVM) then interprets the byte code much like how a JavaScript engine (like v8) interprets JavaScript. However, byte code runs faster since it is much closer to the native language of the computer.
1. **Strict.** Java is great for large development teams since (a) the language itself is much stricter than JavaScript and (b) errors are generally caught earlier in the compilation phase.
1. **Popular**: It's the most widely taught programming language. Plus, Java developers are typically the highest paid.

## Hello World

JavaScript:

```javascript
console.log('Hello World!');
```

Java:

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

Save this in a new file called *Hello.java*. The file name *must* be the same as the public class.

### How do we run a Java program?

Unlike JavaScript, we can't just run the code as is. It's a two-step process:

```sh
$ javac Hello.java
$ java Hello
Hello World!
```

The first command compiles the source code down to the byte code, while the second executes the code.

### What's happening?

Let's jump back to the code...

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

First, we defined a `public` (available to anyone) class called `Hello`. Then we defined a `public` method called `main`:

1. `public` - a type of method that anyone can call
1. `static` - a static method is part of class, but we do not need to create a instance to call it
1. `void` - indicates to the compiler that this method does not return a value
1. `args` - name of the parameter
1. `String[]` - value of the parameter, an array of strings

The main method is executed when the file is ran. Let's pass in some arguments:

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0] + "!");
  }
}
```

Compile then run:

```sh
$ javac Hello.java
$ java Hello Java
Hello Java!
```

## Data Types

Since JavaScript is dynamically-typed you don't have to declare function or variable types. JavaScript engines just figure it out. Java, on the other hand, is a statically-typed language. You have to explicitly declare the types of variables, parameters, and return values. Further, you cannot change a type once it's been declared.

Java has primitive and reference types. Primitives are the most basic building blocks, while reference types are based on a class made up of primitives.

- Primitives: `int`, `long`, `float`, `double`, `boolean`, `char`, `byte`, `short`
- Reference types: `String`, `Scanner`, `Random`, `Die`, `int[]`, `String[]`

## Variables

Again, you must specify a type when declaring a variable:

```java
public class Sum {
  public static void main(String[] args) {
    int num = 2;
    System.out.println(num);
  }
}
```

Compile then run:

```sh
$ javac Sum.java
$ java Sum
2
```

Variables declared inside of a method are local to that method and are called *local variables*. *Instance variables* are available anywhere in a class and can be used in any non-static method.

## Classes

JavaScript utilizes prototypes to create reusable behavior, while Java utilizes classes.

```java
public class Person {

  public String name;

  public Person(String name) {
    this.name = name;
  }

  public String name() {
    return this.name;
  }

  public static void main(String[] args) {
    Person teacher = new Person("Michael");
    System.out.println(teacher.name());
  }

}
```

Take note of this like - `Person teacher = new Person("Michael");`. Here, we invoked the constructor to create a new instance. The constructor has the same name, `Person`, as the class.

What else is new here? The `name()` method is not `static` (so it needs to be instantiated to use) and the appearance of `this`...  

### Methods (instance vs static)

- Static methods: Part of the class. Do not have to be instantiated to use.
- Instance methods: Must be instantiated to use.

### `this`

In Java `this` is always refers back to the current instance.
