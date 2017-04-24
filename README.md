# SOLID: Single Responsibility Principle (SRP)

*Every class should have a single responsibility. There should never be more than one reason to change.*


> Tip: One of the easiest indications of multiple responsibilities is the presence of the word "and" when describing a class.

## Problem

- Choose one of the provided SRP violations below at a time.
- How does the code violate the SRP?
- Draw a class diagram of the current implementation.
- How could you solve the problem?
- Draw a class diagram of the solution, using established design patterns.
- Solve the chosen problem using TDD and Bypass Surgery Refactoring.

## SRP Violations

### a) Restaurant

You have been provided the legacy code for `Item` and `RestaurantBill` in an untested codebase that violates Single Responsibility Pattern (SRP). Make `RestaurantBill` not violate SRP.

Working in a TDD fashion, and keeping the SRP in mind, work through the list and make the following things easily changable:

- Tax rate.
- Tip rate.
- The way that an itemized receipt is formatted.
- The way that a total is computed with tax and tip (perhaps tip becomes post-tax, or tax is applied after tip).
- The `RestaurantBill` takes care of printing itself out to the standard out stream. What if the output target changed and became a file?
- `Item` is either a misnomer or has shared responsibility. Some people hold pretty extreme views on this subject. Nonetheless, does an `Item` need to know about a quantity? Or is that a different entity?


> Package: `com.galvanize.curriculum.xp.osrp.restaurant`

## Testing

Since we are working with legacy code with no tests, the first test should simply assert that the existing output does not change during our refactoring (this [article](http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println) demonstrates how to integration test if a part of the application is writing to `stdout`). Then, as units are refactored out, use TDD and write unit tests to drive the implementation of the units.
