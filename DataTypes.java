/**
 * This class demonstrates the Data types available in Java
 * @author Digbijay
 * @version 1.0
 * @since 1.0
 */
public class DataTypes
{
    public static void main(String[] args){
        //declaring a byte variable
        byte b1 = 120;
        int i1 = 1200;
        
        //i1 = b1;

        //typecasting int data to byte variable
        b1 = (byte)i1;
        System.out.println(b1);

        //primitive data types
        byte byteValue = 100;
        int intValue = 500;
        short shortValue = 400;
        boolean flag = true;
        char c = 'D';
        long numberOfEmployees = 3_40_000;
        float distanceFromOffice = 34.56F;
        double distanceFromDelhiToBangalore = 2000.56;
        System.out.println(" " + byteValue + intValue + shortValue + flag + c + numberOfEmployees + distanceFromOffice + distanceFromDelhiToBangalore);
    }
}
