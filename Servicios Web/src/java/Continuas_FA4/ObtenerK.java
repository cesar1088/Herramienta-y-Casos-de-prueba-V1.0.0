package Continuas_FA4;

public class ObtenerK
{
    float[] generar(int index, int repeticiones)
    {
        float[] salida = null;

        switch (index)  //Se invocan los Métodos Congruenciales(0-3) y los No Congruenciales (4-6)
        {
            case 0: //Método Congruencial Lineal
            {
                System.out.println("Congruencial: Lineal");
                salida = new Lineal().calcular(repeticiones);
            }
            break;

            case 1: //Método Congruencial  No Lineal
            {
                System.out.println("Congruencial: No Lineal");
                salida = new NoLineal().calcular(repeticiones);
            }
            break;

            case 2: //Método Congruencial Multiplicativo
            {
                System.out.println("Congruencial: Multiplicativo");
                salida = new Multiplicativo().calcular(repeticiones);
            }
            break;

            case 3: //Método Congruencial Aditivo
            {
                System.out.println("Congruencial: Aditivo");
                salida = new Aditivo().calcular(repeticiones);
            }
            break;

            case 4: //Método de los Cuadrados Medios
            {
                System.out.println("No Congruencial: Cuadrados Medios");
                salida = new CuadradosMedios().calcular(repeticiones);
            }
            break;

            case 5: //Método de los Productos Medios
            {
                System.out.println("No Congruencial: Productos Medios");
                salida = new ProductosMedios().calcular(repeticiones);
            }
            break;

            case 6: //Método del Multiplicador Constante
            {
                System.out.println("No Congruencial: Multiplicador Constante");
                salida = new MultiplicaConstante().calcular(repeticiones);
            }
            break;
        }

        return salida;
    }
}