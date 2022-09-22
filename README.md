# Friendship Yard  CLI

<img src="https://user-images.githubusercontent.com/44028966/190570263-58c269fb-bfc1-493b-a33f-5d966e746557.png" width="300" height="300"/>


<h3> A simulation of friendships between animals living in a village yard</h3>
Written in Java, following OOP principles.

You can simulate a day (or many days) of life in the village yard, consisting of a morning, lunch and evening.
In the morning, all the animals try to get rid of a friendship.
<ul>
  <li>If an animal has 3 or more friends, they have a 90% chance to succeed in ending a friendship.</li>
  <li>If an animal has less than 3 friends, they only have a 10% chance.</li>
  <li>Animals can have a best friend, whose friendship can't be broken</li>
</ul>

Lunchtime! All the animals start eating their favorite foods. Animals with the same favorite food get together to eat with each other.

<img src="https://user-images.githubusercontent.com/44028966/191714951-c26b5d85-a0b8-4924-9721-7d4891b03648.png" width="600" height="400"/>
  
Evening rolls around, all the animals try to establish a new friendship, following the same rules as ending a friendship.
<ul>
  <li>If an animal has less than 3 friends, they have a 90% chance to succeed in establishing a new friendship</li>
  <li>If an animal has 3 or more friends, the chance drops down to 10%</li>
</ul>

At the end of each day, a chart is printed displaying the friendships


See the App.java file for an example on how to get a simple simulation running.
More in-depth information about the classes can be found in the designdoc.odt file.
