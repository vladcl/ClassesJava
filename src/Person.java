public class Person {
    private float weight;
    private float height;

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float calculateIMC() {
        float IMC = weight / (height * height);
        return IMC;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }
}
