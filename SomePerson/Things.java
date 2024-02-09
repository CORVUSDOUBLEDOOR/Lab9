package SomePerson;

public class Things implements Nameable{
    private String name;
    private String HowToUse;
    public Things(String name, String howToUse) {
        this.name = name;
        HowToUse = howToUse;
    }
    public String getName() {
        return name;
    }
    public String getHowToUse() {
        return HowToUse;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHowToUse(String howToUse) {
        HowToUse = howToUse;
    }
}
