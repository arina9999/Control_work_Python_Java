package Java;

public class toys implements Comparable<toys> {
    private int id;
    private int weight;
    private String name;

    public toys(int id, int weight, String name) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(toys other) {
        if (other == null) {
            return -1;
        }
        int delta = this.weight - other.weight;
        if (delta != 0) {
            return -delta;
        }
        return this.name.compareTo(other.name);
    }
}