# PRIMM: Recursion

In this PRIMM activity, you will learn more about the idea of recursion so that you can craft your final Art within Art projects. 

## Setup
This repo should be ready to go without any additional installation ncecessary aside from the Java extension in the GitHub codespace.

## Predict
Remember, in this section, you **do not** run the program.
1. What do you think the program is intended to do? Explain the evidence that supports your answer.
    > Your answer

2. What do you think the program actually outputs? Explain the evidence that supports your answer.
    > Your answer

## Run
Now, actually run the program.
1. What happened?
    > Your answer

2. If an error state ocurred, describe it as a syntax, run-time, or logical error. Explain why.
    Your answer

3. What is causing the error?
    > Your answer

## Investigate
### Recursion
- A method is *recursive* if it calls itself. A recursive method is defined in terms of itself.

Consider the following code:

```java
public static int mystery (int n) {
    if (n == 1)
        return 1;

    return n + mystery(n-1);
}
```

1. What does the following call return? `mystery(5)`
    > Your answer

### Why recursion?
- If a problem can be broken into smaller/simpler versions of itself, writing it recursively is a good place to start.
For example, our `mystery(5)` method adds up all of the numbers from 1 - 5 by breaking the process down into smaller versions of itself

```
mystery(4) -> 4 + mystery(3)
mystery(3) -> 3 + mystery(2)
mystery(2) -> 2 + mystery(1)
mystery(1) -> 1
```

### Recursion vs. Iteration
In general, you can convert a recursive method into an iterative one (using loops).

```java
// mystery(5) is equivalent to the following for loop
int total = 0;
for (int i = 0; i < 5; i++) {
    total += i;
}
return total
```

In general the iterative solutions are generally faster than recursion because calling a function has some computational cost or overhead.

We use recursion because sometimes it's easier to build a solution that way.

### Parts of a Recursive Method
#### Base Case
- **Most simple form of the problem that tells the recursion to stop**
- Usually an if statement at the top of the method. 
- If you don’t have a base case, you will get **infinite recursion**, which is a runtime error
- Every call to a recursive method is placed on a **call stack**. If there are too many calls on a stack, you get a **stack overflow**. (sounds familiar?)

#### Step Toward the Base Case
- After you establish your base case, you need a step(s) that **work torward getting the method input one step closer to the base case.**
- This step will typically have the recursive call.

```java
public static int mystery(int n) {
        // base case
    if (n == 1) 
        return 1;

        // step toward the base case
        // each call gets us closer to the base case of 1
    return n + mystery(n-1);
}
```

### How Does it work?
Recursion operates by building a **call stack**.
- Stack is an Abstract Data Type (ADT), which is a way of organizing data
- Think of it like an ArrayList (it could be implemented this way)
- You put items "on the stack" at the beginning. 
- Last In, First Out (LIFO)
- Once the base case is reached, it pops calls from the stack and works through them

### How to Trace a Call Stack
Consider the call `mystery(5)`. 

As we saw earlier, the call sequence for this method looks like
```
mystery(4) -> 4 + mystery(3)
mystery(3) -> 3 + mystery(2)
mystery(2) -> 2 + mystery(1)
mystery(1) -> 1
```

The call stack when we hit the base case is as follows.
```
mystery(1)
mystery(2)
mystery(3)
mystery(4)
mystery(5)
```

We then replace the values of the individual calls from the bottom up:
```
mystery(5) -> 5 + mystery(4)
mystery(4) -> 4 + mystery(3)
mystery(3) -> 3 + mystery(2)
mystery(2) -> 2 + 1 -> 3
mystery(1) -> 1
```
Then
```
mystery(5) -> 5 + mystery(4)
mystery(4) -> 4 + mystery(3)
mystery(3) -> 3 + 3 -> 6
mystery(2) -> 2 + 1 -> 3
mystery(1) -> 1
```
Then
```
mystery(5) -> 5 + mystery(4)
mystery(4) -> 4 + 6 -> 10
mystery(3) -> 3 + 3 -> 6
mystery(2) -> 2 + 1 -> 3
mystery(1) -> 1
```
Then finally,
```
mystery(5) -> 5 + 10 -> 15
mystery(4) -> 4 + 6 -> 10
mystery(3) -> 3 + 3 -> 6
mystery(2) -> 2 + 1 -> 3
mystery(1) -> 1
```

### Steps for Writing a Recursive Method
1. Identify the base Case
2. Identify the work that will bring the input closer to the base case.
3. Call the method recursively on the smaller input.

## Modify
What is the Fibonacci method missing? Fix it!

## Make
- Write a method that will calculate a specific power of 2, recursively.
- It can be defined as Pow2<sub>n</sub> = 2 * Pow2<sub>n-1</sub>
The first few values are:
- Pow2<sub>0</sub> -> 1
- Pow2<sub>1</sub> -> 2
- Pow2<sub>2</sub> -> 4
- Pow2<sub>3</sub> -> 8
- Pow2<sub>4</sub> -> 16

Calculate and print out Pow2<sub>0</sub> to Pow2<sub>20</sub>.

### Bonus
1. Generalize to any base!
2. Deal with negative integer exponents!