# Battleship
Command line game for two players, with each player placing 5 ships and trying to sink their opponents on 10 X 10 grid.

## Things learned

Used enums to keep type the different ships.



### Details

Third project created for JetBrains Academy Java Developer course - medium level project.

### How to play

Players place their 5 ships of various lengths on a 10 X 10 grid.  There must be one space between the ships.
Then players take turns trying to sink their opponants ships

### Sample input and output:

Player 1, place your ships on the game field

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Aircraft Carrier (5 cells):

> F3 F7

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Battleship (4 cells):

> A1 D1

  1 2 3 4 5 6 7 8 9 10   
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ ~ ~  
C O ~ ~ ~ ~ ~ ~ ~ ~ ~  
D O ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Submarine (3 cells):

> J7 J10

Error! Wrong length of the Submarine! Try again:

> J10 J8

  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ ~ ~  
C O ~ ~ ~ ~ ~ ~ ~ ~ ~  
D O ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ O O O  

Enter the coordinates of the Cruiser (3 cells):

> B9 D8

Error! Wrong ship location! Try again:

> B9 D9

  1 2 3 4 5 6 7 8 9 10    
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ O O O  

Enter the coordinates of the Destroyer (2 cells):

> E6 D6

Error! You placed it too close to another one. Try again:

> I2 J2

  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ O ~ ~ ~ ~ ~ ~ ~ ~  
J ~ O ~ ~ ~ ~ ~ O O O  
 
Press Enter and pass the move to another player
...
Player 2, place your ships to the game field

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
  
Enter the coordinates of the Aircraft Carrier (5 cells):

> H2 H6

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ O O O O O ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
 
Enter the coordinates of the Battleship (4 cells):

> F3 F6

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ O O O O O ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
 
Enter the coordinates of the Submarine (3 cells):

> H8 F8

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ O ~ ~  
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
  
...

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
C ~ ~ ~ ~ ~ ~ ~ O ~ ~  
D ~ ~ ~ O O O ~ O ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ O ~ ~   
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
  
Press Enter and pass the move to another player ...  

  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-  
  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~   
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
F ~ ~ O O O O O ~ ~ ~   
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
I ~ O ~ ~ ~ ~ ~ ~ ~ ~   
J ~ O ~ ~ ~ ~ ~ O O O  
  
Player 1, it's your turn:

> I3

You missed!
Press Enter and pass the move to another player ...  
  
1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-  
  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
C ~ ~ ~ ~ ~ ~ ~ O ~ ~   
D ~ ~ ~ O O O ~ O ~ ~   
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
F ~ ~ O O O O ~ O ~ ~  
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~   
I ~ ~ M ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
  
Player 2, it's your turn:

> A1

You hit a ship!
Press Enter and pass the move to another player ...