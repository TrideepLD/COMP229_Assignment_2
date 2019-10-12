Planne futher improvements:

Make actors unable to walk on water
Make a return menu item : Kinda done -just need to add an undo function/feature

Make a window prompt for things such as 
    when the you select water telling you you cannot access water
    Exiting the game
Make it so when redness for all = 1.0f then you either get a prompt that you win or lose if 0.0f or just close the game either one.

Making actors unable to move on water:
    Only red actors cant move on water, blue ones can....could change layout to make it so that puppy cant fire on blue but only rabbit can to add challenging element.

    Ok so now the blue cant move on water either but they wont move after a few moves

    yea ok so final change was to remove left-most-move strategy so no actors can move on water(i think I might've remove the if statement completely so now you can actually play with the blue actors as before they would just move all the way left and you wont be able to access or fire at them.)

Prompts
    Added a prompt to allow users to decide if they wanted to exit game or keep playing. What I mean by this is when you click "End Game" It will ask you if you are sure about exiting the program.
        Bug: You cannot fire if you click end game or end turn.
    Added information prompt that tells users that they cannot move actors on water.