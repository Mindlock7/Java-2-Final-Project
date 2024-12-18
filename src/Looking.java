import java.util.Objects;

public class Looking {

    // Method to save time having to add help hint
    // after all text manually
    public void helptext() {
        System.out.println("\n" +
                "Use 'HELP' for a list of commands.");
    }

    // Method to save time having to add item not found message
    // after all text manually
    public void notfound() {
        System.out.println("Unable to look at what was entered.\n" +
                "Check your spelling and try again, or pick a new object.");
        helptext();
    }

    // Method that attempts to interpret noun to
    // give more detail about something in the room
    public void lookat(String noun, String location) {

        // Using location to know what rooms objects are being viewed
        switch (location) {

            case "livingroom":

                // Creates a series of if statements to go through
                // each object available in the room and compare it
                // to the users input noun

                if (noun.equals("couch")){
                    System.out.println("You dig into  the cushions of the  couch, finding nothing but lint and dust. Not\n" +
                            "even  loose change, which is odd.  You  check  under  the couch   as well, still\n" +
                            "finding nothing but dust.");
                    helptext();
                }
                // Checks for every applicable variable of the item
                else if (noun.equals("coffee")
                        || noun.equals("glass")
                        || noun.equals("glasscoffeetable")
                        || noun.equals("coffeetable")
                        || noun.equals("table")) {
                    System.out.println("It’s a glass  coffee table, at least you  don’t  have to check under it to see\n" +
                            "there’s nothing there.");
                    helptext();
                }
                else if (noun.equals("fireplace") || noun.equals("fire")){
                    System.out.println("You saunter  over to the fireplace, enjoying the warmth but finding nothing. The\n" +
                            "holder for the pokers are empty, sadly");
                    helptext();
                }
                else if (noun.equals("cactus")){
                    System.out.println("You eye up  the cactus, and wonder how  sharp  it truly is. As you discover, the\n" +
                            "answer is very.");
                    helptext();
                }
                else if (noun.equals("grandfatherclock")
                        || noun.equals("grandfather")
                        || noun.equals("clock")
                        || noun.equals("grand")) {
                    System.out.println("You look  at the grandfather clock,  ticking  away as its pendulum  swings. The\n" +
                            "clock  face is missing it’s hands, rendering  it  entirely useless for its main\n" +
                            "purpose.");
                    helptext();
                }
                else if (noun.equals("bearskinrug")
                        || noun.equals("bearskin")
                        || noun.equals("rug")
                        || noun.equals("bear")) {
                    System.out.println("You look down  at the bearskin rug, feeling like there’s nothing it could do for\n" +
                            "you to get you out of this place, but  as  you’re about to look away,  you see a\n" +
                            "glimmer of light reflect from one of its  teeth. Curious, you bend down and look\n" +
                            "into its mouth. Inside is a small key, not large enough  for a door, but maybe a\n" +
                            "chest or something.");
                    helptext();
                }
                else if (noun.equals("windows") || noun.equals("window")){
                    System.out.println("Inspecting the  windows closer, there’s some sort of sealant between the boards,\n" +
                            "almost like brick laying mortar or something.  A saw would lose its teeth trying\n" +
                            "to go through something like that");
                    helptext();
                }
                else if (noun.equals("bookshelf") || noun.equals("book")){
                    System.out.println("Looking through  the bookshelf, there’s  lots  of interesting titles  that stand\n" +
                            "out.  “How to Love a Cat   101,”  “862 Useless  Facts You’ll   Never Use,” “John\n" +
                            "Dingle’s Dangling in Dingletown,”  and more. As interesting as all of the titles\n" +
                            "are,  you pull  each and every book  on  the shelf and discover  that there’s no\n" +
                            "hidden bookcase doorway, it’s just your regular bookshelf.");
                    helptext();
                }
                else if (noun.equals("shelf") || noun.equals("shelves")){
                    System.out.println("The shelves hold a lot of trinkets and picture frames, but as you get closer and\n" +
                            "truly look at them, you realize that the pictures in the frames are the showcase\n" +
                            "stock pictures they  put in them at  the  store, and the trinkets all still have\n" +
                            "tags on them. This is more unsettling somehow than if they  were actual trinkets\n" +
                            "of value to somebody…");
                    helptext();
                }
                else if (noun.equals("frontdoor")
                        || noun.equals("front")
                        || noun.equals("door")) {
                    System.out.println("A solid oak door, locked and sealed tight, reinforced with iron in various parts\n" +
                            "of the door. There’s no breaking this down without some sort of tool.");
                    helptext();
                }

                // If noun doesnt match an object in the room
                // runs method to display message
                else{
                    notfound();
                }

            case "diningroom":
                if (noun.equals("table")) {
                    System.out.println("The table  is well built and  sturdy,  definitely a valuable piece. You look\n" +
                            "underneath the table, and just like the top, find nothing of use");
                    helptext();
                }
                else if (noun.equals("china") || noun.equals("chinahutch")){
                        System.out.println("Looking at the  china hutch, you find nothing of use in its top cabinets, mainly\n" +
                                "just dust. Looking down below though, there’s two larger cabinet doors that have\n" +
                                "a padlock tightly constricting the handles.  It   requires  4 digits to  open, 4\n" +
                                "digits that you, believe it or not, don’t happen to have.");
                        helptext();
                }
                else if (noun.equals("chandelier")) {
                    System.out.println("You study  the chandelier with squinted   eyes,  hurting your retinas.  Once you\n" +
                            "start seeing spots, you decide to start feeling  around with your hands, finding\n" +
                            "nothing but burning hot incandescent bulbs to scald your fingers on.");
                    helptext();
                }
                else if (noun.equals("news") || noun.equals("newspaper")){
                    System.out.println("Looking down  at the newspaper, you’re  disappointed  to see the  comics section\n" +
                            "missing.  You do still have   the main  piece  holding the   large bold headline\n" +
                            "though, which reads “MISSING PEOPLE DISAPPEARING EACH WEEK, NONE FOUND.” Reading\n" +
                            "a few sentences below that, you discover your own name, sending chills down your\n" +
                            "spine colder than shards of glass in a Wisconsin winter.");
                    helptext();
                }
                else{
                    notfound();
                }

            case "kitchen":
                if (noun.equals("cup")
                    || noun.equals("cupboard")
                    || noun.equals("cupboards")) {
                System.out.println("You start  throwing open every cupboard  in   the room, eager to  find something\n" +
                        "inside of them, but who would’ve guessed that the most  obvious spot in the room\n" +
                        "had nothing inside? Not you I guess.");
                helptext();
                }
                else if (noun.equals("counter") || noun.equals("countertop")){
                    System.out.println("You run  your fingers along the  smooth  countertop, feeling the cool granite as\n" +
                            "you look at it for any etchings or clues,  coming up with nothing  other than an\n" +
                            "old sticky spill of some sort");
                    helptext();
                }
                else if (noun.equals("fridge")) {
                    System.out.println("You try pulling  the fridge open, but the door doesn’t want to budge at all. You\n" +
                            "pull harder, but nothing happens. You look  for  a lock of some kind but there’s\n" +
                            "nothing  there. Stumped, you look around  on the  fridge, still  finding nothing\n" +
                            "anywhere. You let your imagination run  wild for a second due to  the pure shock\n" +
                            "of the fridge not opening,  coming  up with crazy ideas such  as they superglued\n" +
                            "the  fridge shut, or there’s somehow a really strong vacuum inside, or there’s a\n" +
                            "really big  magnet pulling on the door,  but  realizing how unlikely all of this\n" +
                            "is, you continue onwards");
                    helptext();
                }
                else if (noun.equals("metalpetbowls")
                        || noun.equals("petbowls")
                        || noun.equals("metalbowls")
                        || noun.equals("metal")
                        || noun.equals("bowls")
                        || noun.equals("pet")) {
                    System.out.println("Looking down  at the metal bowls, you  quickly  realize it’s for pets. There’s a\n" +
                            "name engraved into each bowl, one  saying “Mr  CuddleMuffins”, the  other saying\n" +
                            "“Ragnar  the Deathbringer.” Unsure  if   that’s another cat or   some unheard of\n" +
                            "beast, you decide to leave the empty bowls alone.");
                    helptext();
                }
                else if (noun.equals("sink")) {
                    System.out.println("Looking  into  the kitchen sink,  you’re   grateful  there’s no  leftover dishes\n" +
                            "inside. Then again, if a dirty  knife was left behind, you’re  sure you wouldn’t\n" +
                            "have minded.");
                    helptext();
                }
                else if (noun.equals("oven")) {
                    System.out.println("You open up the crusty oven, peeking in to see if there’s anything of use. There\n" +
                            "are  stains  of various dishes left  behind   in  the  oven, none   of which are\n" +
                            "identifiable at this point. Finding nothing of use, you decide to move on.");
                    helptext();
                }
                else if (noun.equals("door")
                        || noun.equals("basement")
                        || noun.equals("basementdoor")) {
                    System.out.println("You walk over  to the door and try  the  knob. Locked. There’s a  keyhole in the\n" +
                            "knob, but as you look the large door up  and down,  you realize that even if you\n" +
                            "did  have the key, there’s a  board nailed into the frame along  the top edge of\n" +
                            "the door, which would prevent  it  from opening. From under the gap  in the door\n" +
                            "comes  a  stagnant cold, suggesting it’s   a  staircase  down to  a stone-walled\n" +
                            "basement   on  the other  side.   Peeking  under the door, you   see nothing but\n" +
                            "darkness.");
                    helptext();
                }
                else{
                    notfound();
                }

            case "masterbedroom":
                if (noun.equals("bed")) {
                    System.out.println("A large cozy  bed. Looking at it makes  you  realize just how much you miss your\n" +
                            "own. Realizing that that probably shouldn’t be your most prevalent  thought, you\n" +
                            "thoroughly search it, both above and underneath, finding nothing.");
                    helptext();
                }
                else if (noun.equals("dresser")) {
                    System.out.println("You begin rummaging through every drawer in the dresser, finding socks and pants\n" +
                            "and shirts, but nothing inside of them, and nothing else inside of the drawers.");
                    helptext();
                }
                else if (noun.equals("mirror")) {
                    System.out.println("You look at  the mirror, seeing yourself  and  the room inside of it. Curious if\n" +
                            "it’s a one way mirror, you hold your finger  up  against it like  the videos you\n" +
                            "saw online told you to, but you forgot if there’s meant to be a gap between your\n" +
                            "finger  or not in the mirror. Now feeling foolish, you quickly  drop your finger\n" +
                            "and move along.");
                    helptext();
                }
                else if (noun.equals("night") || noun.equals("nightstand")){
                    System.out.println("Inspecting the nightstand reveals a drawer and a cabinet beneath it. You try the\n" +
                            "drawer but  it wont budge, presumably  having  something to do with  the keyhole\n" +
                            "next to the handle. You open the  cabinet beneath the drawer but there’s nothing\n" +
                            "useful inside, just some magazines.");
                    helptext();
                }
                else if (noun.equals("shagrug")
                        || noun.equals("rug")
                        || noun.equals("shag")) {
                    System.out.println("You look down  at the rug on the  floor,  a shag rug that you  wonder how anyone\n" +
                            "honestly finds it to be a nice piece to put  in your  home. Not only is it ugly,\n" +
                            "but it clearly traps any disgusting substance it can get a hold of.");
                    helptext();
                }
                else{
                    notfound();
                }

            case "bathroom":
                if (noun.equals("vent")) {
                    System.out.println("You peer into the vent, not expecting much, but to your surprise, there’s a very\n" +
                            "obvious bright red button sitting in the vent. While you’re unsure of why its so\n" +
                            "obvious that there’s  a button in there or what it does, what you are sure of is\n" +
                            "you have no way to press it with  your  fingers, seeing as the slits in the vent\n" +
                            "are way too tiny, and its bolted down tight.");
                    helptext();
                }
                else if (noun.equals("toilet")) {
                    System.out.println("You  look  at the toilet, inspecting  it   for  anything useful. Nothing  on the\n" +
                            "outside, nothing in the upper tank,  and even if there was  something inside the\n" +
                            "bowl, after lifting the lid  and  seeing what remains on the sides  of the bowl,\n" +
                            "you know you wouldn’t reach your hand in there anyways…");
                    helptext();
                }
                else if (noun.equals("sink")) {
                    System.out.println("It’s a  sink. It probably does  sink  related things. Sink related things don’t\n" +
                            "help you right now, so you ignore the sink.");
                    helptext();
                }
                else if (noun.equals("mirror")) {
                    System.out.println("You look  into the mirror, noticing just  how weathered and tired you look. Bags\n" +
                            "under your eyes, dirt smudging into your   clothing… before you can  notice more\n" +
                            "shameful details you look away.");
                    helptext();
                }
                else if (noun.equals("bath") || noun.equals("bathtub")){
                    System.out.println("A traditional  bathtub, staining yellow from  iron  build up. Nothing is inside.\n" +
                            "Well,  nothing besides air and  probably  floating dust,  because  if  there was\n" +
                            "literally nothing, well, that’d cause quite the situation, where-  (you play out\n" +
                            "a  useless  situation in  your  head  on  what would happen if literally nothing\n" +
                            "consumed  that space before realizing just how  much  time you’re wasting  on an\n" +
                            "empty bathtub).");
                    helptext();
                }
                else{
                    notfound();
                }

            case "masterbedroombathroom":
                if (noun.equals("postitnote")
                    || noun.equals("postit")
                    || noun.equals("note")
                    || noun.equals("post")) {
                System.out.println("You look  at the note on  the   mirror,  reading ‘Don’t forget  Jack’s birthday,\n" +
                        "11/28.’ You’re unsure what to make of this, but you can take it with you in case\n" +
                        "it’s needed for something.");
                helptext();
                }
                else if (noun.equals("emptypillbottle")
                        || noun.equals("pillbottle")
                        || noun.equals("bottle")
                        || noun.equals("empty")
                        || noun.equals("pill")) {
                    System.out.println("The classic  orange pill bottle. Nothing’s  inside  and the label contains no\n" +
                            "useful information.");
                    helptext();
                }
                else if (noun.equals("toilet")) {
                    System.out.println("The traditional porcelain throne. You inspect it, even removing the top cover to\n" +
                            "the tank, but nothing strikes you as useful.");
                    helptext();
                }
                else if (noun.equals("shower")) {
                    System.out.println("The walk in  shower is empty apart  from the shower head and the handle, neither\n" +
                            "of which aiding you in any way.");
                    helptext();
                }
                else if (noun.equals("medicinecabinet")
                        || noun.equals("medicine")
                        || noun.equals("cabinet")) {
                    System.out.println("Opening the medicine cabinet, you find it to be empty shelves.");
                    helptext();
                }
                else if (noun.equals("sink")) {
                    System.out.println("After looking down the drain and pulling on everything you can, you dictate that\n" +
                            "the sink has nothing useful to provide.");
                    helptext();
                }
                else{
                    notfound();
                }

            case "basement":
                if (noun.equals("piping")) {
                System.out.println("The piping  along the wall appears to   be  mainly for water,  running along the\n" +
                        "walls  until it reaches somewhere it needs to rise. There  appears to  be no hot\n" +
                        "water  heater though, meaning there’ll  be   no hot showers in this  place for a\n" +
                        "while…");
                helptext();
                }
                else if (noun.equals("mudfloor")
                        || noun.equals("mud")
                        || noun.equals("floor")) {
                    System.out.println("The floor is  slick, not soaking wet like  fresh mud but also not dusty dirt. It\n" +
                            "seems well packed down, as if it’s been walked on a lot.");
                    helptext();
                }
                else if (noun.equals("splittingaxe")
                        || noun.equals("splitting")
                        || noun.equals("axe")
                        || noun.equals("rusticsplittingaxe")
                        || noun.equals("rustic")) {
                    System.out.println("While not as  conventional as a key,  I’d  bet taking it could provide a pretty\n" +
                            "useful way to get through that front door.");
                    helptext();
                }
                else{
                    notfound();
                }

            case "closet":
                if (noun.equals("clothes")) {
                    System.out.println("The clothes appear to be mainly formal, some floral dresses, some plain dresses,\n" +
                            "a few  dress shirts here and there.   Nothing  truly  to note  from them though,\n" +
                            "unless you’d like to play dress up.");
                    helptext();
                }
                else if (noun.equals("wirehanger")
                        || noun.equals("wire")
                        || noun.equals("hanger")) {
                    System.out.println("The lone wire hanger, cast out by those fortunate enough to have clothes hanging\n" +
                            "from them,  sitting alone on the end, ignored and unused, serving no purpose as-\n" +
                            "Woah, enough personification. You recall using  these   as a kid to  pretend you\n" +
                            "were a pirate with its hook, and reach things you probably shouldn't have.");
                    helptext();
                }
                else{
                    notfound();
                }
        }
    }
}
