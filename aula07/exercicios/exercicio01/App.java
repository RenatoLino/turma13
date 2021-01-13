package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Animal a1 = new Animal("Bob", "Branca", "Dog", 2000);

        Proprietario p = new Proprietario("Marcos", "11111111");
        Animal a2 = new Animal("Lulu", "Bege", "Doberman", 2010, p);

        Animal a3 = new Animal("Mel", "Preto", "Puddle", 2012, "Marcela", "2222222");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
