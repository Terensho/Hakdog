public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Papa Smurf";
        knight.sayMyName();
        knight.sayMyStrenght();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrenght();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Dragon";
        thief.sayMyName();
        thief.sayMyStrenght();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character Archer = new Character();

        Archer.strength = 5;
        Archer.agility = 5;
        Archer.intelligence = 5;
        Archer.name = "Hakdog";
        Archer.sayMyName();
        Archer.sayMyStrenght();
        Archer.sayMyAgility();
        Archer.sayMyIntelligence();
    }
}