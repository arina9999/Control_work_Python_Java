package Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class Java {

    public static void main(String[] args) {

        toys toys1 = new toys(1, 2, "конструктор");
        toys toys2 = new toys(2, 2, "робот");
        toys toys3 = new toys(3, 6, "кукла");

        PriorityQueue<toys> queue = new PriorityQueue<>();

        queue.add(toys1);
        queue.add(toys2);
        queue.add(toys3);

        try (FileWriter writer = new FileWriter("Java/randomtoys.txt")) {

            for (int i = 0; i < 10; i++) {
                PriorityQueue<toys> randomQueue = new PriorityQueue<>(queue);
                for (int index = 0; index < queue.size(); index++) {
                    toys randomtoys = randomQueue.poll();
                    String text = String.format("id: %d, weight: %d, name: %s", randomtoys.getId(),
                            randomtoys.getWeight(),
                            randomtoys.getName());
                    writer.write(text);
                    writer.append('\n');
                }
                writer.append('\n');
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}