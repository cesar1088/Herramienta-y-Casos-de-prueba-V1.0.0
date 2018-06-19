/*-----------------------------------------------------------------------------
| Caso de Prueba #4: "Generación de Variables Aleatorias Continuas"(A1)(DOUBLE)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las V.A se realiza mediante las distribuciones (A)Gauss,    |
| (B)Gamma y (C)Beta, las cuales utilizan un conjunto de valores 'k' obtenidos |
| mediante los Métodos Congruenciales: (1)Lineal, (2)No Lineal, (3)Aditivo y   |
| (4)Multiplicativo y los Métodos No Congruenciales: (5)Cuadrados Medios,      |
| (6)Productos Medios y (7)Multiplicador Constante)                            |
------------------------------------------------------------------------------*/
package Continuas_DA1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A1_DContinuas
{
    @WebMethod(operationName = "peticionContinuasDA1")
    public double peticionContinuasDA1(
    @WebParam(name = "repeticiones") int repeticiones,
    @WebParam(name = "tipoAleatorios") int tipoAleatorios)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            //Datos generales
            int a = 1;
            int b = 2;
            int c = 10;
            int m = 10000;
            double alpha;
            double beta;
            double[] valoresX = new double[]{11, 3, 81, 25, 53};
            double[] generadosX = new double[repeticiones];
            double[] valores_rn = new double[repeticiones];

            //Métodos Congruenciales
            double X0, X1; //Semillas
            double rn; //Variables Obtenidas
            double num, den; // Fracciones
            double xi; //Congruecial Aditivo
            double varianza, u, p1, p2; //Distribucion Gauss
            double x, n; //Distribucion Gamma
            double facAlpha, factBeta, factAlphaBeta; //Distribucion Beta
            double D, Y0, posDer, posIzq, alObtenido, tamañoLateral; //Valores Medios

            switch (tipoAleatorios)
            {
                case 0: //Si se seleccionaron los Métodos Congruenciales...
                {
                    for (int index = 0; index <= 3; index++)
                    {
                        X0 = 0015;

                        switch (index)
                        {
                            case 0: //Método Congruencial Lineal
                            {
                                for (int i = 0; i < repeticiones; i++)
                                {
                                    rn = (a * X0 + b) % m;
                                    X0 = (int) rn;
                                    rn = (rn / m) * 10;
                                    generadosX[i] = rn;
                                }
                            }
                            break;

                            case 1: //Método Congruencial No Lineal
                            {
                                for (int i = 0; i < repeticiones; i++)
                                {
                                    rn = ((a * Math.pow(X0, 2)) + (b * X0) + c) % m;
                                    X0 = (int) rn;
                                    rn = (rn / m) * 10;
                                    generadosX[i] = rn;
                                }
                            }
                            break;

                            case 2: //Método Congruencial Multiplicativo
                            {
                                for (int i = 0; i < repeticiones; i++)
                                {
                                    rn = (a * X0 + c) % m;
                                    X0 = rn;
                                    rn = (rn / m) * 10;
                                    generadosX[i] = rn;
                                }
                            }
                            break;

                            case 3: //Método Congruencial Aditivo
                            {
                                xi = valoresX[valoresX.length - 1];
                                int posicion = 0;

                                for (int i = 0; i < repeticiones; i++)
                                {
                                    if (i < valoresX.length)
                                    {
                                        rn = (xi + valoresX[i]) % m;
                                        xi = (int) rn;
                                        rn = (rn / m) * 10;
                                        generadosX[i] = rn;
                                    }
                                    else
                                    {
                                        rn = (xi + generadosX[posicion] * (m - 1)) % m;
                                        xi = (int) rn;
                                        rn = (rn / m) * 10;
                                        generadosX[i] = rn;
                                        posicion++;
                                    }
                                }
                            }
                            break;
                        }

                        //Inicia la distribución Gauss para los Métodos Congruenciales

                        System.out.println("------ Distribución Gauss ------");

                        switch(index)
                        {
                            case 0: System.out.println("Congruencial: Lineal"); break;
                            case 1: System.out.println("Congruencial: No Lineal"); break;
                            case 2: System.out.println("Congruencial: Multiplicativo"); break;
                            case 3: System.out.println("Congruencial: Aditivo"); break;
                        }

                        u = 0;
                        varianza = 1;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = 1;
                            den = Math.sqrt(2 * Math.PI) * varianza;
                            p1 = Math.pow(x - u, 2) * -1;
                            p2 = (2 * Math.pow(varianza, 2));

                            rn = (num / den) * Math.pow(Math.E, (p1 / p2));
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Gauss
                        {
                            System.out.println(valores_rn[i]);
                        }

                        //Inicia la distribución Gamma para los Métodos Congruenciales

                        System.out.println("------ Distribución Gamma ------");

                        switch(index)
                        {
                            case 0: System.out.println("Congruencial: Lineal"); break;
                            case 1: System.out.println("Congruencial: No Lineal"); break;
                            case 2: System.out.println("Congruencial: Multiplicativo"); break;
                            case 3: System.out.println("Congruencial: Aditivo"); break;
                        }


                        alpha = 2;
                        beta = 0.333;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = Math.pow(x, alpha - 1);
                            n = 1;

                            for (int j = 1; j <= (alpha - 1); j++)
                            {
                                n = n * j;
                            }

                            den = n * Math.pow(beta, alpha);
                            rn = (num / den) * Math.pow(Math.E, -x / beta);
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Gamma
                        {
                            System.out.println(valores_rn[i]);
                        }

                        //Inicia la distribución Beta para los Métodos Congruenciales

                        System.out.println("------ Distribución Beta ------");

                        switch(index)
                        {
                            case 0: System.out.println("Congruencial: Lineal"); break;
                            case 1: System.out.println("Congruencial: No Lineal"); break;
                            case 2: System.out.println("Congruencial: Multiplicativo"); break;
                            case 3: System.out.println("Congruencial: Aditivo"); break;
                        }

                        alpha = 0.5;
                        beta = 0.2;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = 1;

                            facAlpha = 1; //Inicia la función "Gamma" para 'alpha'
                            for (int j = 1; j <= alpha - 1; j++)
                            {
                                facAlpha = facAlpha * j;
                            }

                            factBeta = 1; //Inicia la función "Gamma" para 'beta'
                            for (int j = 1; j <= beta - 1; j++)
                            {
                                factBeta = factBeta * j;
                            }

                            factAlphaBeta = 1;
                            for (int j = 1; j <= (alpha + beta) - 1; j++)
                            {
                                factBeta = factBeta * j;
                            }

                            den = (facAlpha * factBeta) / factAlphaBeta;
                            rn = (num / den) * Math.pow(x, alpha - 1) * (1 - x);
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Beta
                        {
                            System.out.println(valores_rn[i]);
                        }
                    }
                }
                break;

                case 1: //Si se seleccionaron los Métodos No Congruenciales...
                {
                    for (int index = 4; index <= 6; index++)
                    {
                        X0 = 0015;
                        X1 = 0734;

                        switch (index)
                        {
                            case 4: //Método de los Cuadrados Medios
                            {
                                for (int i = 0; i < repeticiones; i++)
                                {
                                    D = 4;
                                    Y0 = (int) Math.pow(X0, 2);

                                    String cadena = String.valueOf(Y0);

                                    if (cadena.length() % 2 != 0)
                                    {
                                        cadena = 0 + cadena;
                                    }

                                    posDer = cadena.length() / 2;
                                    posIzq = (cadena.length() - D) / 2;
                                    tamañoLateral = D / 2;

                                    String valorIzq = "";
                                    String valorDer = "";

                                    for (int j = 0; j < tamañoLateral; j++)
                                    {
                                        valorIzq += cadena.charAt((int) posIzq);
                                        valorDer += cadena.charAt((int) posDer);
                                        posIzq++;
                                        posDer++;
                                    }

                                    alObtenido = Double.parseDouble(valorIzq + valorDer);
                                    X0 = (int) alObtenido;
                                    alObtenido = alObtenido / Math.pow(10, D);
                                    generadosX[i] = alObtenido * 10;
                                }
                            }
                            break;

                            case 5: //Método de los Productos Medios
                            {
                                for (int i = 0; i < repeticiones; i++)
                                {
                                    D = 4;
                                    Y0 = (int) X0 * (int) X1;

                                    String cadena = String.valueOf(Y0);

                                    if (cadena.length() % 2 != 0)
                                    {
                                        cadena = 0 + cadena;
                                    }

                                    posDer = cadena.length() / 2;
                                    posIzq = (cadena.length() - D) / 2;
                                    tamañoLateral = D / 2;

                                    String valorIzq = "";
                                    String valorDer = "";

                                    for (int j = 0; j < tamañoLateral; j++)
                                    {
                                        valorIzq += cadena.charAt((int) posIzq);
                                        valorDer += cadena.charAt((int) posDer);
                                        posIzq++;
                                        posDer++;
                                    }

                                    alObtenido = Double.parseDouble(valorIzq + valorDer);
                                    X1 = (int) alObtenido;
                                    X0 = X1;
                                    alObtenido = alObtenido / Math.pow(10, D);
                                    generadosX[i] = alObtenido * 10;
                                }
                            }
                            break;

                            case 6: //Método del Multiplicador Constante
                            {
                                int temp = 3;

                                for (int i = 0; i < repeticiones; i++)
                                {
                                    D = 2;
                                    Y0 = temp * (int) X0;

                                    String cadena = String.valueOf(Y0);

                                    if (cadena.length() % 2 != 0)
                                    {
                                        cadena = 0 + cadena;
                                    }

                                    posDer = cadena.length() / 2;
                                    posIzq = (cadena.length() - D) / 2;
                                    tamañoLateral = D / 2;

                                    String valorIzq = "";
                                    String valorDer = "";

                                    for (int j = 0; j < tamañoLateral; j++)
                                    {
                                        valorIzq += cadena.charAt((int) posIzq);
                                        valorDer += cadena.charAt((int) posDer);
                                        posIzq++;
                                        posDer++;
                                    }

                                    alObtenido = Double.parseDouble(valorIzq + valorDer);
                                    X0 = (int) alObtenido;
                                    alObtenido = alObtenido / Math.pow(10, D);
                                    generadosX[i] = alObtenido * 10;
                                }
                            }
                            break;
                        }

                        //Inicia la distribución Gauss para los Métodos No Congruenciales

                        System.out.println("------ Distribución Gauss ------");

                        switch(index)
                        {
                            case 4: System.out.println("No Congruencial: Cuadrados Medios"); break;
                            case 5: System.out.println("No Congruencial: Productos Medios"); break;
                            case 6: System.out.println("No Congruencial: Multiplicador Constante"); break;
                        }

                        u = 0;
                        varianza = 1;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = 1;
                            den = Math.sqrt(2 * Math.PI) * varianza;
                            p1 = Math.pow(x - u, 2) * -1;
                            p2 = (2 * Math.pow(varianza, 2));
                            rn = (num / den) * Math.pow(Math.E, (p1 / p2));
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Gauss
                        {
                            System.out.println(valores_rn[i]);
                        }

                        //Inicia la distribución Gamma para los Métodos No Congruenciales

                        System.out.println("------ Distribución Gamma ------");

                        switch(index)
                        {
                            case 4: System.out.println("No Congruencial: Cuadrados Medios"); break;
                            case 5: System.out.println("No Congruencial: Productos Medios"); break;
                            case 6: System.out.println("No Congruencial: Multiplicador Constante"); break;
                        }

                        alpha = 2;
                        beta = 0.333;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = Math.pow(x, alpha - 1);

                            n = 1;

                            for (int j = 1; j <= (alpha - 1); j++)
                            {
                                n = n * j;
                            }

                            den = n * Math.pow(beta, alpha);
                            rn = (num / den) * Math.pow(Math.E, -x / beta);
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Gamma
                        {
                            System.out.println(valores_rn[i]);
                        }

                        //Inicia la distribución Beta para los Métodos Congruenciales

                        System.out.println("------ Distribución Beta ------");

                        switch(index)
                        {
                            case 4: System.out.println("No Congruencial: Cuadrados Medios"); break;
                            case 5: System.out.println("No Congruencial: Productos Medios"); break;
                            case 6: System.out.println("No Congruencial: Multiplicador Constante"); break;
                        }

                        alpha = 0.5;
                        beta = 0.2;

                        for (int i = 0; i < repeticiones; i++)
                        {
                            x = generadosX[i];
                            num = 1;

                            facAlpha = 1; //Inicia la función "Gamma" para 'alpha'
                            for (int j = 1; j <= alpha - 1; j++)
                            {
                                facAlpha = facAlpha * j;
                            }

                            factBeta = 1; //Inicia la función "Gamma" para 'beta'
                            for (int j = 1; j <= beta - 1; j++)
                            {
                                factBeta = factBeta * j;
                            }

                            factAlphaBeta = 1;
                            for (int j = 1; j <= (alpha + beta) - 1; j++)
                            {
                                factBeta = factBeta * j;
                            }

                            den = (facAlpha * factBeta) / factAlphaBeta;
                            rn = (num / den) * Math.pow(x, alpha - 1) * (1 - x);
                            valores_rn[i] = rn;
                        }

                        for (int i = 0; i < valores_rn.length; i++) //Imprime la distribución Beta
                        {
                            System.out.println(valores_rn[i]);
                        }
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Continuas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}