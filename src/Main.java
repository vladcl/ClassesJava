import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person personObject = new Person(0.00f, 0.00f);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da pessoa:");
        personObject.setHeight(scanner.nextFloat());
        System.out.println("Digite o peso da pessoa:");
        personObject.setWeight(scanner.nextFloat());


        System.out.println("O IMC de uma pessoa que possui altura: "
                + personObject.getHeight() + " e peso: "
                + personObject.getWeight() + " é de: "
                + personObject.calculateIMC());
    }
}