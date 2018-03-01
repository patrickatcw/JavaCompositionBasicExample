package com.me;
/*Directions
- create a single room of a house using composition
- think about the things that should be included in the room
- maybe physical parts of the house but furniture as well
- add at least one method to access an object via a getter and
then that objects public method as you saw in previous video
- then add at least one method to hide the object ex. not using  getter
but to access the object used in composition within the main class
like saw in video
*/

/*
*****NOTE: composition is about having things, as opposed to being things;
creating objects within objects.
composition is most likely to be used before inheritance!!
*/

//step 25 from checking all errors are gone in bedroom class step 24
        public class Main {

            public static void main(String[] args) {

                //step 26 creating walls, creating instances
                Wall wall1 = new Wall("West");
                Wall wall2 = new Wall("East");
                Wall wall3 = new Wall("South");
                Wall wall4 = new Wall("North");

                //step 27 ceiling instance
                Ceiling ceiling = new Ceiling(12, 55);

                //step 28 bed instance
                Bed bed = new Bed("Modern", 4, 3, 2, 1);

                //step 29 lamp instance
                Lamp lamp = new Lamp("Classic", false, 75);

                //step 30 bedroom instance
                Bedroom bedroom = new Bedroom("Patrick's", wall1, wall2, wall3, wall4,
                        ceiling, bed, lamp);

                //step 31 calling makeBed method
                bedroom.makeBed();

                //step 32 turn on lamp
                bedroom.getLamp().turnOn();

                //step 33 run program
                //result
                /*
                Bedroom -> Making bed
                Bed -> Making
                Lamp -> Turning on
                 */

            }
        }

