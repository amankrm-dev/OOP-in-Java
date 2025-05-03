package Lab6;

public class SortPlanets {
    public static void main(String[] args) {
        String[] planets = { "Mars", "Earth", "Venus", "Jupiter", "Saturn", "Mercury" };

        for (int i = 0; i < planets.length - 1; i++) {
            for (int j = i + 1; j < planets.length; j++) {
                if (planets[i].compareTo(planets[j]) > 0) {
                    String temp = planets[i];
                    planets[i] = planets[j];
                    planets[j] = temp;
                }
            }
        }

        System.out.println("Planets in Ascending Order:");
        for (String planet : planets) {
            System.out.println(planet);
        }
    }
}
