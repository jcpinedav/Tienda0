
package tiendap;


public class Tiendap {

  
  public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int codigo[] = new int[20];
        String nombre[] = new String[20];
        int cantidadpro[] = new int[20];
        int formapago[] = new int[3];
        double precio[] = {20, 46, 49, 48, 51, 5, 54, 5, 3, 54, 65, 12, 465, 879, 45, 12, 32, 56, 45, 231};
        String fecha[] = new String[20];
        double apagar[] = new double[20];
        int idevendedor[] = new int[20];
        String nombreape[] = new String[20];
        int cedula, codigo2;
        double total=0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la fecha de la venta, año - mes - día -hora");
            fecha[i] = lectura.next();
            System.out.println("Datos del vendedor, primero su id luego su nombre con apellido");
            idevendedor[i] = lectura.nextInt();
            nombreape[i] = lectura.next();
            System.out.println("Ingrese el codigo del procucto vendido, la cantidad de productos vendidos y la forma de pago;reuerde que 0 efctivo,1 para debito, 2 para tarjeta");
            codigo[i] = lectura.nextInt();
            cantidadpro[i] = lectura.nextInt();
            formapago[i] = lectura.nextInt();
            apagar[i] = cantidadpro[i] * precio[i];
        }
        for (int i = 0; i < 20; i++) {
            if (cantidadpro[i] > cantidadpro[i + 1]) {
                System.out.println("El vendedor que más prducto vendio fue: " + nombreape[i]);
            }
        }
        for (int i = 0; i < 20; i++) {
            if (formapago[i] == 1) {
                if (cantidadpro[i] > cantidadpro[i + 1]) {
                    System.out.println("El vendedor que más prductos vendio fue: " + nombreape[i] + "    " + apagar[i]);
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            if (formapago[i] == 2) {
                if (apagar[i] > apagar[i + 1]) {
                    System.out.println("Venta más importante tarjeta de credito: " + nombreape[i] + "    " + apagar[i]+'\t'+fecha[i]);
                }
            }
        }
        cedula = lectura.nextInt();
        codigo2 = lectura.nextInt();
        for (int i = 0; i < 20; i++) {
            total = total + apagar[i];
            if (cedula == idevendedor[i]) {
                if (codigo2 == codigo[i]) {
                    System.out.println(idevendedor[i] + nombreape[i] + apagar[i]);
                }
            }
        }
        System.out.println(total);
    }

}