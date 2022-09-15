package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
            throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        String option = "";

        do {
            System.out.println("1. IMC");
            System.out.println("2. Calcular");
            System.out.println("3. Sumar numeros en medio");
            System.out.println("4. Descencente");
            System.out.println("5. Salir");
            option = sc.next();
            if (isNumber(option)){
                switch (Integer.parseInt(option)){
                    case 1:
                        System.out.println("Ingrese su nombre");
                        String name = sc.next();
                        System.out.println("Ingrese su altura");
                        double height = sc.nextDouble();
                        System.out.println("Ingrese su peso");
                        double weight = sc.nextDouble();
                        Object[] data = {name,height,weight};
                        String response = (String) client.execute("Methods.imc",data);
                        System.out.println(response);
                        break;
                    case 2:
                        System.out.println("Dime el primer numero");
                        double num1 = sc.nextDouble();
                        System.out.println("Dime el segundo numero");
                        double num2 = sc.nextDouble();
                        System.out.println("Dime el tercer numero");
                        double num3 = sc.nextDouble();
                        System.out.println("Dime el cuarto numero");
                        double num4 = sc.nextDouble();
                        Object[] data1 = {num1,num2,num3,num4};
                        String response1 = (String) client.execute("Methods.calcula",data1);
                        System.out.println(response1);
                        break;
                    case 3:
                        System.out.println("Dime el primer numero");
                        int V1 = sc.nextInt();
                        System.out.println("Dime el segundo numero");
                        int V2 = sc.nextInt();
                        Object[] data2 = {V1,V2};
                        int response2 = (int) client.execute("Methods.suma",data2);
                        System.out.println("Resultado " + response2);
                        break;
                    case 4:
                        System.out.println("Dime el primer numero");
                        int v1 = sc.nextInt();
                        System.out.println("Dime el segundo numero");
                        int v2 = sc.nextInt();
                        System.out.println("Dime el tercer numero");
                        int v3 = sc.nextInt();
                        System.out.println("Dime el cuarto numero");
                        int v4 = sc.nextInt();
                        System.out.println("Dime el quinto numero");
                        int v5 = sc.nextInt();
                        Object[] data3 = {v1,v2,v3,v4,v5};
                        String response3 = (String) client.execute("Methods.array",data3);
                        System.out.println(response3);
                        break;
                    default:
                        System.out.println("Ingresa una opción válida");
                }
            }

        }while (!option.equals("5"));
    }
    public static boolean isNumber(String number){
        try{
            int num = Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
