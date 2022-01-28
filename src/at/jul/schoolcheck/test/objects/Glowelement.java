package at.jul.schoolcheck.test.objects;


public class Glowelement {
    private String name;
    private String color;
    private int usage;
    private Boolean status;

    public Glowelement(String name, String color, int usage, Boolean status) {
        this.name = name;
        this.color = color;
        this.usage = usage;
        this.status = status;
    }


    public void checkIfElementIsTurnedOn(){
        if(status == true){
            System.out.println("Mein Name ist "+ getName()+ ". Ich bin bereits eingeschaltet.");
        }else{
            System.out.println("Schalte "+ getName() + " ein.");

            setUsage(getUsage() + 5);

            setStatus(true);
        }
    }
    public void checkIfElementIsTurnedOff(){
        if(status == false){
            System.out.println("Mein Name ist "+ getName()+ ". Ich bin schon ausgeschaltet.");
        }else{
            System.out.println("Schalte "+ getName() + " aus.");
            setStatus(false);
        }
    }


    public String getName() {
        return name;
    }


    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
}
