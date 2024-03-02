/**
 * The PokemonDB class searches and sorts Pokemon Objects. Additionally
 * this is the Driver class which is used to the test the code of
 * the other classes.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class PokemonDB {
    /**
     * This is the main method which makes use of the other classes
     * and its respective methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon(null, 42, null, 100);
        //System.out.println("P1 NAME " + p1.getName());
        //System.out.println("P1 HEALTH " + p1.getHealth());
        //System.out.println("P1 STRENGTH " + p1.getStrength());
        p1.setName("A");
        p1.setType(new Water());
        //System.out.println("P1 TYPE " + p1.getType());
        Pokemon p2 = new Pokemon("B", new Grass());
        //System.out.println("P2 NAME " + p2.getName());
        //System.out.println("P2 HEALTH " + p2.getHealth());
        //System.out.println("P2 STRENGTH " + p2.getStrength());
        //System.out.println("P2 TYPE " + p2.getType());
        Pokemon p3 = new Pokemon(p2);
        //System.out.println("P3 NAME " + p3.getName());
        //System.out.println("P3 HEALTH " + p3.getHealth());
        //System.out.println("P3 STRENGTH " + p3.getStrength());
        //System.out.println("P3 TYPE " + p3.getType());
        p3.setHealth(49);
        Pokemon p4 = new Pokemon("C", 100, new Fire(), 64);
        p4.setType(new Water());
        Pokemon p8 = new Pokemon("C", 100, new Fire(), 64);
        //System.out.println("P4 NAME " + p4.getName());
        //System.out.println("P4 HEALTH " + p4.getHealth());
        //System.out.println("P4 STRENGTH " + p4.getStrength());
        //System.out.println("P4 TYPE " + p4.getType());
        //System.out.println(p1.compareTo(p4));
        //System.out.println(p4.getType().type());

        Pokemon p5 = new Pokemon("D", 74, new Fire(), 64);
        Pokemon p6 = new Pokemon("E", 12, new Fire(), 64);

        System.out.println("COMPARING " + p8.compareTo(p4));
        System.out.println("P1 " + p1);
        System.out.println("P2 " + p2);
        System.out.println("P3 " + p3);
        System.out.println("P4 " + p4);
        System.out.println("P5 " + p5);
        System.out.println("P6 " + p6);

        Pokemon[] pokemons = {p1};
        //System.out.println(findPokemon(3, pokemons));
        Pokemon[] compare = {p1, p2, p3, p4, p5, p6};
        Pokemon[] pokemonss = {p1};
        System.out.println(findPokemon(74, compare));
        compareSort(pokemonss);
        for (Pokemon p : pokemonss) {
            System.out.println();
            System.out.println(p);
        }




        /*System.out.println("First " + findPokemon(41, pokemons));
        System.out.println("Second " + findPokemon(8000, compare));
        System.out.println(findPokemon(41, pokemons));
        System.out.println("first");
        compareSort(compare);
        for (Pokemon a : compare) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("with one");
        compareSort(pokemons);
        for (Pokemon a : pokemons) {
            System.out.println(a);
        }*/
    }

    /**
     * This method searches through an unsorted list of Pokemons
     * for a specified health value.
     *
     * @param health The health of the Pokemon.
     * @param p      An array of Pokemon objects.
     * @return Returns the Pokemon with the specific health value. Otherwise,
     * if not found, returns null.
     */
    public static Pokemon findPokemon(int health, Pokemon[] p) {
        compareSort(p);

        int low = 0;
        int high = p.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (health > p[mid].getHealth()) {
                low = mid + 1;
            } else if (health < p[mid].getHealth()) {
                high = mid - 1;
            } else {
                return p[mid];
            }
        }
        return null;
    }

    /**
     * This method sorts an array of Pokemons in ascending order based on
     * the compareTo method in the Pokemon class.
     *
     * @param p An array of Pokemon objects.
     */
    public static void compareSort(Pokemon[] p) {

        /*if (p.length == 1) {
            return;
        }*/

        int outer = 0;
        int inner = 0;
        int min = 0;
        Pokemon temp = null;
        for (outer = 0; outer < p.length - 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < p.length; inner++) {
                if (p[min].compareTo(p[inner]) > 0) {
                    min = inner;
                }
            }
            temp = p[min];
            p[min] = p[outer];
            p[outer] = temp;
        }
    }

}
