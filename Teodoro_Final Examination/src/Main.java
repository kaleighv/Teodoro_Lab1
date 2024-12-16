import java.util.Stack;

public class Main{
    //Creature class
    //hold name and power level
    public static class Creature {
        String CreatureName;
        int PowerLevel;

        Creature(String CreatureName, int PowerLevel) {
            this.CreatureName = CreatureName;
            this.PowerLevel = PowerLevel;
        }
    }

    public static void main(String[] args) {
        //Input data
        Creature[] creatures = {
            new Creature("Dragon", 95),
            new Creature("Griffin", 88),
            new Creature("Unicorn", 78),
            new Creature("Phoenix", 92),
            new Creature("Centaur", 85)
        };

        //descending order
        bubbleSort(creatures);
        System.out.println("Bubble Sort : Descending Order");
        displayCreatures(creatures);

        //ascending order
        selectionSort(creatures);
        System.out.println("\nSelection Sort : Ascending");
        displayCreatures(creatures);

        //Stack implementation
        Stack<Creature> stack = new Stack<>();
        for (Creature creature : creatures) {
            stack.push(creature);
        }

        System.out.println("\nStack : Popping Creatures");
        while (!stack.isEmpty()) {
            Creature creature = stack.pop();
            System.out.println(creature.CreatureName + " - Power: " + creature.PowerLevel);
        }
    }

    // Bubble Sort 
    public static void bubbleSort(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].PowerLevel < creatures[j + 1].PowerLevel) {
                    // Swap
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].PowerLevel < creatures[minIndex].PowerLevel) {
                    minIndex = j;
                }
            }
            // Swap
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    //display creatures
    public static void displayCreatures(Creature[] creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature.CreatureName + " - Power: " + creature.PowerLevel);
        }
    }
}