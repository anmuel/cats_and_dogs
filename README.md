# cats_and_dogs
Proof of Concept for avoiding if/else in OOP

This small code snipplet example is supposed to be a simple demonstration about how to remove *all* case-statements in object oriented languages using object oriented techniques and patterns.

## How to read

The refactoring steps can be followed by checking out commits and reviewing their diffs.

1. ugly init: [01866f5](https://github.com/anmuel/cats_and_dogs/commit/01866f5dae305f6e07d4b0780b3bfaa51ea9d32b)
2. extract cat and dog subclass and removing external string-type injection: [e1fe3c6](https://github.com/anmuel/cats_and_dogs/commit/e1fe3c66689ddaf501dce305baa5534b375ee888)
3. extract Eat Strategy with subclasses and moving out "magic numbers and strings" to a configuration file: [f28005be](https://github.com/anmuel/cats_and_dogs/commit/f28005beb834214dd3899d93f7c0bfb0a50aa201)

## Background

The project itself was used in an internal developer workshop at my company.

It was inspired by [a talk by Jim Gay at the Rubyconf 2014 about the Eastern Principle](http://confreaks.tv/videos/rubyconf2014-eastward-ho-a-clear-path-through-ruby-with-oo).

Java was chosen to demonstrate that the principles are not dependent on any specific language.
