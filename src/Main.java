import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    IASCODE 1 - problema 1 - encuentra las coordenadas del ICBM

    Args:
    coordinates (float[]): Array de números flotantes con las coordenadas
    targetSum (float): Valor flotante con suma objetiva

    Returns:
    float[]: Array con dos números flotantes representando las coordenadas del ICBM
    */
    public static double[] calculateCoordinates(double[] coordinates, float targetSum) {
        // ¡Tu código va aquí! <--------- (OJO no utilices println cuando envíes el código)
        double[] result = {0, 0};
        for (double coor: coordinates){
            for (double number: coordinates){
                float sum = (float) (coor + number);
                if(sum == targetSum){
                    result[0] = coor;
                    result[1] = number;
                }
            }
        }
        return result;
    }

    /*
    No tocar, main le entrega al metodo calculateCoordinates los valores de entrada
    */
    public static void main(String[] args) {
        // ¡No tocar!
        Scanner input = new Scanner(System.in);
        String chain = input.nextLine();
        String[] parts = chain.split(",");
        double[] array = new double[parts.length - 1];
        float targetSum = Float.parseFloat(parts[parts.length - 1]);

        for (int i = 0; i < (parts.length - 1); i++) {
            array[i] = Double.parseDouble(parts[i]);
        }

        double[] result = calculateCoordinates(array, targetSum);

        if (result[0] > result[1]) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        } else {
            System.out.println(result[1]);
            System.out.println(result[0]);
        }
    }
}