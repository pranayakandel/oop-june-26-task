// Base class
class Character {
    public void attack() {
        System.out.println("The character attacks with a basic strike.");
    }

    public void ability() {
        System.out.println("The character uses a basic ability.");
    }
}

// Derived class Warrior
class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("The warrior swings a mighty sword!");
    }

    @Override
    public void ability() {
        System.out.println("The warrior uses 'Shield Block' to reduce damage!");
    }
}

// Derived class Mage
class Mage extends Character {
    @Override
    public void attack() {
        System.out.println("The mage casts a fireball!");
    }

    @Override
    public void ability() {
        System.out.println("The mage uses 'Mana Shield' to absorb damage!");
    }
}

// Main class to test the overriding and abilities
public class Game {
    public static void main(String[] args) {
        Character genericCharacter = new Character();
        Character warrior = new Warrior();
        Character mage = new Mage();

        // Generic character
        System.out.println("Generic Character:");
        genericCharacter.attack();
        genericCharacter.ability();

        System.out.println();

        // Warrior
        System.out.println("Warrior:");
        warrior.attack();
        warrior.ability();

        System.out.println();

        // Mage
        System.out.println("Mage:");
        mage.attack();
        mage.ability();
    }
}