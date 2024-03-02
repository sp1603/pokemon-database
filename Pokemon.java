/**
 * The Pokemon class represents a database of Pokemons
 * containing different attributes.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class Pokemon implements Comparable<Pokemon> {
    /**
     * Represents the name of the Pokemon.
     */
    private String name = "Pikachu";
    /**
     * Represents the health of the Pokemon.
     */
    private int health = 50;
    /**
     * Represents the strength of the Pokemon.
     */
    private int strength = 50;
    /**
     * Represents the type of the Pokemon.
     */
    private PokemonType type = new Fire();

    /**
     * 4-args Constructor that instantiates a new Pokemon.
     *
     * @param name     The name of the Pokemon
     * @param health   The health of the Pokemon
     * @param type     The strength of the Pokemon
     * @param strength The type of the Pokemon
     */
    public Pokemon(String name, int health, PokemonType type, int strength) {
        if ((name != null) && !(name.trim().equals(""))) {
            this.name = name;
        }
        if (health >= 1 && health <= 100) {
            this.health = health;
        }
        if (strength >= 1 && strength <= 100) {
            this.strength = strength;
        }
        if (type instanceof Fire || type instanceof Water || type instanceof Grass) {
            this.type = type;
        }
    }

    /**
     * 2-args Constructor that instantiates a new Pokemon.
     *
     * @param name The name of the Pokemon
     * @param type The type of the Pokemon
     */
    public Pokemon(String name, PokemonType type) {
        if ((name != null) && !(name.trim().equals(""))) {
            this.name = name;
        }
        String check = "WaterGrassFire";
        if (check.contains(type.type())) {
            this.type = type;
        }
        if (this.type.type().equals("Grass")) {
            this.health = 65;
        } else if (this.type.type().equals("Water")) {
            this.health = 80;
        } else {
            this.health = 50;
        }
        this.strength = 1 + (int) (Math.random() * 100);
    }

    /**
     * 1-args Constructor that instantiates a new Pokemon.
     *
     * @param p The Pokemon Object
     */
    public Pokemon(Pokemon p) {
        this(p.name, p.health, p.type, p.strength);
    }

    /**
     * Gets the name of the Pokemon.
     *
     * @return The name of the Pokemon
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the Pokemon.
     *
     * @param name The name of the Pokemon
     */
    public void setName(String name) {
        if ((name != null) && !(name.trim().equals(""))) {
            this.name = name;
        }
    }

    /**
     * Gets the health of the Pokemon.
     *
     * @return The health of the pokemon.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Sets the health of the Pokemon.
     *
     * @param health The health of the Pokemon
     */
    public void setHealth(int health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        }
    }

    /**
     * Gets the strength of the Pokemon.
     *
     * @return The strength of the Pokemon.
     */
    public int getStrength() {
        return this.strength;
    }

    /**
     * Sets the strength of the Pokemon.
     *
     * @param strength The strength of the Pokemon
     */
    public void setStrength(int strength) {
        if (strength >= 1 && strength <= 100) {
            this.strength = strength;
        }
    }

    /**
     * Gets the type of Pokemon.
     *
     * @return The type of Pokemon
     */
    public PokemonType getType() {
        return this.type;
    }

    /**
     * Sets the type of Pokemon.
     *
     * @param type The type of Pokemon
     */
    public void setType(PokemonType type) {
        if (type instanceof Fire || type instanceof Water || type instanceof Grass) {
            this.type = type;
        }
    }

    /**
     * This method overrides Object's .toString().
     *
     * @return Returns a string representation of Pokemon.
     */
    public String toString() {
        return this.name + " is a " + this.type.type() + " type with health "
            + this.health + " and strength " + this.strength + ".";
    }

    /**
     * This method compares Pokemons to other Pokemons based on their health, strength, and type.
     *
     * @param p The Pokemon to be compared to.
     * @return A negative integer, zero, or a positive integer as this
     * Pokemon is less than, equal to, or greater than the specified Pokemon.
     */
    public int compareTo(Pokemon p) {
        if (this.health != p.health) {
            if (this.health < p.health) {
                return -1;
            }
            return 1;
        } else if (this.strength != p.strength) {
            if (this.strength < p.strength) {
                return -1;
            }
            return 1;
        }

        return this.type.compareTo(p.type);
    }
}
