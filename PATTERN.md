For mouseClicked();, I would implement the State Pattern.

These are my reasons.

Other patterns.

So among all the patterns in the Head First Programming book, I was either going to choose a strategy pattern, a state pattern or a compound pattern of some sort. The compound pattern quickly became a past memory as although it might work, it's not really practical.

Then it came down to strategy pattern vs state pattern. And to choose state pattern versus strategy pattern these were the problems I encountered with strategy pattern:
    Strategies only handle a single specific task. And so while doing improvements I was doing, I noticed that the strategy pattern make future improvements harder although not by much.
    I am doing different things based on the "state it is in" as in that while I am in SelectNewItem state, I am doing something different than ChoosingActor. To explain what I mean by this is that the state is like what the object is doing right now and using a strategy pattern from my understanding deals with the object doing the task which I presume allows for overriding methods which we dont really use here.
    strategy pattern, but because the strategies need to replace each other and refer heavily to the host object, it seems like state, not strategy
    And finally, it seemed as those that we just wanted to change the behavior of mouseClicked() based on what we want it to do which sounds just about right for State Pattern intent.