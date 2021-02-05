# Iterator-Desiign-Pattern


QUESTION:

It’s the year 2023, and the Göktürk 3 satellite is in orbit. You work as a data
analyst for the Turkish Space Agency. The satellite transmits data as 2D arrays of integers. You are
tasked with coding two iterator classes for these data: one iterator that will print a 2D array spirally
clockwise and another one that will print it spirally anti-clockwise, both starting at the top left
element.

1  2  3  4
5  6  7  8 
9  10 11 12
13 14 15 16

Example: if the data is
the first iterator should iterate it in the order: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 and the second
iterator as 1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7. Code in java one of these iterators, and provide a
main class showing it in action. Do not implement the remove method of the iterator.



REPORT:
If there is more than 1 satellite in the future, I gave a list of satellites to include it in the system.
To detect different satellites in a single list, these satellites are listed with satellite interface.
There is a possibility to show the satellite's information in 2 ways clockwise and counterclockwise.
I created these with createClockwiseIterator and createAntiClockwiseIterator.These methods return
their own iterator.When the system wanted to show information, I produced random information and
showed it in 2 ways.

