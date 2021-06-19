package interfaces.funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Author Jairo Nascimento em 19/06/2021 as 18:04
 */
public class FuncionalInterfaces {

  public static void main(String[] args) {

    /**
     * Supplier representa uma função que não recebe nenhum parameto e que vai entregar alguma coisa
     */
    System.out.println("\nSupplier");
    Stream.generate(() -> new Random().nextInt())
        .limit(5)
        .forEach(System.out::println);

    /**
     *  Consumer não retorna nada mais recebe o consumidor
     */
    System.out.println("\nConsumer");
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach(integer -> System.out.println(integer));

    /**
     *  Predicate função recebe valor e retorna booleano
     */
    System.out.println("\nPredicate");
    list.stream()
        .filter(integer -> integer % 2 == 0)
        .forEach(System.out::println);

    /**
     * Function recebe valor e retorna outro valor modificado
     */
    System.out.println("\nFunction");
    list.stream()
        .map(integer -> integer * 2)
        .forEach(System.out::println);

    System.out.println("\nBinaryOperator");
    list.stream()
        .reduce((integer, integer2) -> integer + integer2)
        .ifPresent(System.out::println);

  }
}
