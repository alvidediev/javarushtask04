import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача: Создать массив из 10 строк. Ввести 8 имен с клавиатуры и вывести их в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = new String[10];

        for (int i = 0; i <= 7; i++) {
            mass[i] = reader.readLine();
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(mass[i]);
        }
    }
}
