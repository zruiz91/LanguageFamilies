//SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.

public class SinoTibetan extends Language {

    SinoTibetan(String name, int numSpeakers) {

        super(name, numSpeakers, "Asia", "subject-object-verb");

        // if name contains the string "Chinese" then switch the wordOrder variables
        // value

        if (name.contains("Chinese")) {

            this.wordOrder = "subject-verb-object";

        }

    }
}
