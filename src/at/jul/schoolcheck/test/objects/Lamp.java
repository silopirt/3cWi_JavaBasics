package at.jul.schoolcheck.test.objects;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Glowelement> glowelements;

    public Lamp() {
        this.glowelements = new ArrayList<>();
    }

    public void addGlowElements(Glowelement glowelement){
        this.glowelements.add(glowelement);
    }

    public void turnAllElementsOn(){
        for (int i = 0; i < glowelements.size(); i++) {
            glowelements.get(i).checkIfElementIsTurnedOn();
        }
    }
    public void turnAllElementsOff(){
        for (int i = 0; i < glowelements.size(); i++) {
            glowelements.get(i).checkIfElementIsTurnedOff();
        }
    }
    public int getOverallUsage(){
        int usage = 0;
        for (int i = 0; i < glowelements.size(); i++) {
            usage = usage + glowelements.get(i).getUsage();
        }
        return usage;
    }
    public void getAllNames(){
        for (int i = 0; i < glowelements.size(); i++) {
            System.out.println(glowelements.get(i).getName());
        }
    }

}
