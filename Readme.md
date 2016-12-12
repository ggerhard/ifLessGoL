# if-less Game of Life ##

This is a Java implementation of [Conway's "Game of Life"](http://www.conwaylife.com/wiki/Conway%27s_Game_of_Life) without conditional statements (*if* or *switch*).

## Rationale

A while ago I hosted a [code retreat](http://coderetreat.org/). One of the assignment was to write a version of [Conway's "Game of Life"](http://www.conwaylife.com/wiki/Conway%27s_Game_of_Life)  that does not contain any "If"-statements (see also [Anti-IF Campaign](http://antiifcampaign.com/)), so that the participants had to come up with creative solutions. Before assigning this task, I wanted to create a proof-of-concept, to make sure that there is a solution to this problem.

## Implementation
In this example a static map is used to assign cell-states to numbers of living neighbours (see *NEXT_STATES* in *AliveState* and *DeadState*). To determine if a cell exists at a certain position, exception handling is used (see *Grid.getCellNeighbours*, *Grid.addArrayCellToListIfExisting* etc.).

However, the participants came up with two different solutions, so this is just one way to do it.

## Output

Output with a predefined 9x9 matrix (the game will loop as long as there are living cells or a maximum number of rounds is reached):

    Round 1, Living Cells: 13

        *    
       * *   
      *   *  
      * * *  
      *   *  
       * *   
        *    

    ----------------
    Round 2, Living Cells: 18

        *    
       ***   
      * * *  
     **   **
      * * *  
       ***   
        *    

    ----------------
    Round 3, Living Cells: 20

       ***   

     ** * **
     **   **
     ** * **

       ***   

    ----------------
    Round 4, Living Cells: 22
        *    
        *    
      *   *  
     *** ***
    *       *
     *** ***
      *   *  
        *    
        *    
    ----------------
    Round 5, Living Cells: 28

       * *   
     ** * **
     *** ***
    *       *
     *** ***
     ** * **
       * *   

    ----------------
    Round 6, Living Cells: 26

      *****  
     *     *
    *  ***  *
    *       *
    *  ***  *
     *     *
      *****  

    ----------------
    Round 7, Living Cells: 34
       ***   
      *****  
     *     *
    **  *  **
    **     **
    **  *  **
     *     *
      *****  
       ***   
    ----------------
    Round 8, Living Cells: 22
      *   *  
      *   *  
    **     **
      *   *  
      *   *  
      *   *  
    **     **
      *   *  
      *   *  
    ----------------
    Round 9, Living Cells: 22

      *   *  
     **   **
      *   *  
     *** ***
      *   *  
     **   **
      *   *  

    ----------------
    Round 10, Living Cells: 24

     **   **
     *** ***

     * * * *

     *** ***
     **   **

    ----------------
    Round 11, Living Cells: 24

     * * * *
     * * * *
     * * * *

     * * * *
     * * * *
     * * * *

    ----------------
    Round 12, Living Cells: 12


    ** * * **



    ** * * **


    ----------------
    Round 13, Living Cells: 0









    ----------------
