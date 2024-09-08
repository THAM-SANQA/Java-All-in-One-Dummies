
package book4.chap6;

import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 * @author thamsanqa 2024
 **/
public class Spell {

    public String name;
    public SpellType type;
    public String desc;
    public int price;

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear.", 200));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand.", 150));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something.", 300));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone.", 100));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells.", 450));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs.", 500));
        //FOR LOOPS TO PRINT 
        for (Spell spell : spells) {
            System.out.println(spell.name);
        }

        for (Spell spell : spells) {
            if (spell.type == Spell.SpellType.SPELL) {
                System.out.println(spell.name);
            }
        }
        System.out.println();
        //STREAM METHOD TO PRINT
        spells.stream().forEach(s -> System.out.println(s));

        spells.stream()
                .filter(s -> s.type == Spell.SpellType.SPELL)
                .forEach(s -> System.out.println(s));
        System.out.println();

//USING STREAM INTERFACE
        OptionalDouble avg = spells.stream()
                .mapToDouble(s -> s.price)
                .average();

        if (avg.isPresent()) {
            System.out.println("Average = " + avg.getAsDouble());
        }
        System.out.println();

        //**********PARALLEL STREAMS************
        System.out.println("First Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
        System.out.println("\nSecond Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
    }

    public enum SpellType {
        SPELL, CHARM, CURSE
    };

    public Spell(String spellName, SpellType spellType, String spellDesc, int spellPrice) {
        name = spellName;
        type = spellType;
        desc = spellDesc;
        price = spellPrice;
    }

    @Override
    public String toString() {
        return name;
    }
}
