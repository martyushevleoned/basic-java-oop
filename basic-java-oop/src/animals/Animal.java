package animals;

public abstract class Animal implements  Comparable<Animal>{
    String name;

    float weight;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Animal a) {
        return getName().compareTo(a.getName());
//        return Float.compare(getWeight(), a.getWeight());
    }
}
