# Task 3: Questions on Composition and Inheritance

1. Which is more dependent on the implementation details of the `SortedIntList`, composition or inheritance?

Composition. Because in InheritanceSortedIntList, the `addAll` method is implemented using the `addAll` method of the parent class. But we don't know whether the `addAll` method of the parent class calls the `add` method of the parent class or not. So, we cannot decide whether we should increment `totalAdded` manually or not. But in CompositionSortedIntList, we can see that the `addAll` method calls the `add` method of the `SortedIntList` object. So, we can increment `totalAdded` manually.


2. If the `add` method in `SortedIntList` is significantly modified or its behavior changes, which implementation is more likely to break?

Both.


3. What issues does using composition solve that might have been problematic with inheritance?

Composition facilitates adding multiple behaviors and is more dependent on the implementation details of the parent class.


4. Based on the provided implementations, when would it be more appropriate to use inheritance and when to use composition?

Use Inheritance:
- When there is a clear "is-a" relationship between two classes, meaning that one class is a specialization or subtype of another;
- When we cannot use composition

Use Composition:
- when classes need to interact with each other, but there is no clear hierarchical relationship, or when a class needs to utilize the functionality of another class without being a subtype of it


