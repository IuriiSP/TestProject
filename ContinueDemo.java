public class ContinueDemo {
    public static void main (String args []) {
        int i;

        //Вывести четные числа от 0 до 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // завершить шаг итерации цикла
            System.out.println(i);
        }
    }
}
/*В данном примере выводятся только четные числа, поскольку при обнаружении
нечетного числа шаг итерации цикла завершается досрочно в обход вызова метода
println (). */