package Server;

import java.util.Arrays;

public class Methods {

    //Ejercicio 1
    public String imc(String name, double height, double weight){
        double imc = (weight / (height + height));
        return "Hola " + name + "tu IMC es de " + imc;
    }

    //Ejercicio 2
    public String calcula(double num1, double num2, double num3,double num4){
        double suma = (num1 + num2 + num3 + num4);
        double producto = (num1 * num2 * num3 * num4);
        double promedio = (((num1 + num2 + num3 + num4))/4);
        return "Hola la suma es: " + suma
                + "\nHola el prodcuto es: " + producto
                + "\nHola el promedio es: " + promedio;
    }

    //Ejercicio 3
    public int suma(int V1, int V2) {
        int suma = 0;
        for (int i = V1+1; i<V2; i++){
            suma+=  i;
        }
        return suma;
    }

    //Ejercicio 4
    public String array (int v1,int v2,int v3, int v4, int v5) {
        int num[] = {v1,v2,v3,v4,v5};
        Arrays.sort(num);
        int i;
        for (i = num.length - 1; i >= 0; i--) {
            System.out.println("Numeros acomodos en forma ascendente" + num[i]);
        }
        return Arrays.toString(num);
    }
}
