# Groovy NullPointerException Bug

This repository demonstrates a common Groovy bug related to improper null handling in a method.
The `MyClass.myMethod` method fails to handle null input correctly, leading to a `NullPointerException` when a null value is passed as a parameter.

## Bug Description
The `myMethod` method attempts to call the `length()` method on the `param` parameter without checking if `param` is null. If `param` is null, this will result in a `NullPointerException`.

## Bug Solution
The solution involves adding an explicit null check before attempting to call the `length()` method. If `param` is null, the method returns a default value (in this case, 0) to prevent the exception.

## How to reproduce
1. Clone the repository
2. Run the script `bug.groovy` with a null input.  You'll observe the NullPointerException
3. Run the script `bugSolution.groovy` with a null input. You'll observe it correctly handles null and doesn't throw an exception. 
