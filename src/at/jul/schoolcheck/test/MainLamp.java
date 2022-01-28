package at.jul.schoolcheck.test;

import at.jul.schoolcheck.test.objects.Glowelement;
import at.jul.schoolcheck.test.objects.Lamp;

public class MainLamp {
    public static void main(String[] args) {
        Glowelement glowelementOne = new Glowelement("Element blue", "blue",2, false);
        Glowelement glowelementTwo = new Glowelement("Element red", "red",1, true);
        Glowelement glowelementThree = new Glowelement("Element green", "green",2, true);
        Glowelement glowelementFour = new Glowelement("Element yellow", "yellow",7, false);


        Glowelement glowelementNotInUse = new Glowelement("NotInUse","green",4,false);


        Lamp lamp = new Lamp();

        lamp.addGlowElements(glowelementOne);
        lamp.addGlowElements(glowelementTwo);
        lamp.addGlowElements(glowelementThree);
        lamp.addGlowElements(glowelementFour);

        lamp.turnAllElementsOn();
        lamp.turnAllElementsOff();
        System.out.println(lamp.getOverallUsage());
        lamp.getAllNames();
    }
}
