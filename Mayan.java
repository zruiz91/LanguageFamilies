//Mayan, a child class of Language modeled after the Mayan language family.

public class Mayan extends Language {

    Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    // override the getInfo method originally declared in the Language Class

    @Override
    public void getInfo() {

        System.out.println(
                this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");

        System.out.println("The language follows the word order: " + this.wordOrder);

        System.out.println("Fun fact: " + this.name + "is an ergative language.");

    }
}
