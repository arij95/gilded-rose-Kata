# My solution in Java for the GildedRose-Refactoring-Kata


### Run the Text Fixture from Command-Line

```
./gradlew -q text
```

### Specify Number of Days

For e.g. 10 days:

```
./gradlew -q text --args 10
```

## Refactoring Explanation

First, I started by fixing the GildedRose Test and change the test name from foo to updateQuality.

Then, quickly scanning the code, I invert if conditions and add comments to each bloc for better understanding the code and its functionality.

###Refactoring:

The first thing that jumps out at me is to change the for loop to foreach loop so I can change items[i] to item:

for (int i = 0; i < items.length; i++) {
if (!items[i].name.equals("Aged Brie")

for (Item item : items) {
if (!item.name.equals("Aged Brie")

My next step is extracting constants for item names to make the code more understandable.
The code is a bit tricky to read, but I think that first enhance is to use a switch statement depending on the item category in place of all the if loops to make the code much cleaner.

Then, I think that we have a code fragment that can be grouped together. For that, I use a strategy to move this code to a separate new classes and methods and replace the old code with a
call to the method. I create an interface CategoryStrategy and implement all the reusable code in it using default methods .
Finally, I created a separate class for each item category which implement CategoryStrategy interface.

