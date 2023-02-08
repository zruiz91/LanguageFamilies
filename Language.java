//the Language parent class, which serves as the template for all languages.

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {

        this.name = name;
        this.numSpeakers -= numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;

    }

    public void getInfo() {

        System.out.println(
                this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");

        System.out.println("The language follows the word order: " + this.wordOrder);

    }

    /*
     * . fututre deliverables
     * 
     * Build an array or ArrayList of several language objects and loop through them
     * to call getInfo().
     * Add new methods that allow users to set a specific region, change the number
     * of speakers, or modify the word order.
     * Create several more language family classes that pertain to languages you’re
     * interested in.
     * Map out the sign language families.
     * Add in further linguistic features (e.g., which genders are used, whether the
     * language is tonal, etc.).
     *
     *
     */
    public static void main(String[] args) {

        Language spanish = new Language("spanish", 3000, "all", "backwards");

        spanish.getInfo();

        Mayan kiche = new Mayan("Kiche", 4000);

        kiche.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 4000);

        SinoTibetan burmese = new SinoTibetan("Burmese", 80000);

        burmese.getInfo();
        mandarin.getInfo();
    }

}