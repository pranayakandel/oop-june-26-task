// Base class
class Instrument {
    public void playSound() {
        System.out.println("The instrument plays a sound.");
    }
}

// Derived class: Piano
class Piano extends Instrument {
    @Override
    public void playSound() {
        System.out.println("The piano plays a soft and elegant melody.");
    }
}

// Derived class: Guitar
class Guitar extends Instrument {
    @Override
    public void playSound() {
        System.out.println("The guitar strums a rhythmic chord.");
    }
}

// Derived class: Violin
class Violin extends Instrument {
    @Override
    public void playSound() {
        System.out.println("The violin produces a smooth and emotional tone.");
    }
}

// Main class to demonstrate polymorphism
public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        // Loop through each instrument and play its sound
        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}