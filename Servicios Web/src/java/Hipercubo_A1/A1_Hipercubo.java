/*-----------------------------------------------------------------------------
| Caso de Prueba #1: "Multiplicación de matrices mediante el algoritmo de      |
|                     Hipercubo Simple" (A1)                                   |
| Versión: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La mutliplicación de matrices mediante el hipercubo simple tiene 3 pasos:    |
| (1) Se intercambian los valores de las matrices A y B                        |
| (2) Se realiza la multiplicación de los valores almacenados en cada nodo     |
| (3) Se realiza la suma de los nodos relacionados entre si                    |
------------------------------------------------------------------------------*/
package Hipercubo_A1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A1_Hipercubo
{
    @WebMethod(operationName = "peticionHipercuboA1")
    public double peticionHipercuboA1(@WebParam(name = "dimension")int dimension) 
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            //Datos globales
            int q = 0;
            int n = 0;
            int totalProcesadores = 0;
            int[][] matriz_A = null;
            int[][] matriz_B = null;
            ArrayList<int[]> lista= new ArrayList<int[]>();

            //Datos del Algoritmo de Hipercubo Simple
            int temp, i, suma, t;
            int a, b, s;
            double num_procesador;
            int[] binario;
            int[] nuevo, origen, destino;

            switch (dimension) //Se establecen las matrices a multiplicar
            {
                case 0: //Se eligieron matrices de 2x2
                {
                    matriz_A = new int[][]
                    {
                        {7, 8},
                        {2, 9}
                    };

                    matriz_B = new int[][]
                    {
                        {1, 6},
                        {5, 3}
                    };
                    q = 1;
                }
                break;

                case 1: //Se eligieron matrices de 4x4
                {
                    matriz_A = new int[][]
                    {
                        {6, 6, 9, 7,},
                        {2, 9, 9, 4,},
                        {1, 4, 8, 7,},
                        {1, 8, 2, 1,}
                    };

                    matriz_B = new int[][]
                    {
                        {9, 7, 7, 7,},
                        {1, 4, 6, 4,},
                        {0, 1, 3, 9,},
                        {0, 5, 9, 3,}
                    };
                    q = 2;
                }
                break;

                case 2: //Se eligieron matrices de 8x8
                {
                    matriz_A = new int[][]
                    {
                        {6, 5, 0, 1, 1, 1, 9, 7},
                        {1, 3, 8, 6, 3, 9, 4, 1},
                        {5, 2, 7, 3, 6, 3, 5, 5},
                        {5, 7, 5, 4, 3, 7, 2, 7},
                        {9, 1, 8, 1, 3, 4, 9, 1},
                        {4, 8, 5, 3, 5, 3, 5, 2},
                        {1, 6, 5, 1, 5, 8, 5, 6},
                        {3, 7, 3, 0, 8, 1, 9, 6}
                    };

                    matriz_B = new int[][]
                    {
                        {6, 6, 4, 2, 2, 7, 9, 0,},
                        {8, 3, 5, 5, 4, 3, 2, 2,},
                        {2, 0, 0, 0, 1, 8, 7, 5,},
                        {8, 8, 4, 8, 0, 9, 7, 6,},
                        {9, 8, 5, 8, 4, 8, 3, 7,},
                        {7, 5, 6, 8, 6, 7, 0, 0,},
                        {0, 1, 4, 6, 2, 6, 0, 9,},
                        {7, 7, 0, 7, 6, 9, 6, 2,}
                    };
                    q = 3;
                }
                break;

                case 3: //Se eligieron matrices de 16x16
                {
                    matriz_A = new int[][]
                    {
                        {7, 8, 9, 6, 0, 1, 2, 7, 1, 8, 4, 0, 6, 8, 7, 1,},
                        {4, 6, 9, 6, 2, 6, 5, 1, 8, 9, 2, 4, 5, 8, 4, 6,},
                        {4, 0, 5, 0, 2, 4, 9, 6, 0, 9, 0, 0, 0, 5, 9, 1,},
                        {8, 9, 5, 4, 8, 4, 9, 9, 4, 1, 9, 0, 8, 5, 7, 7,},
                        {4, 6, 1, 2, 0, 8, 8, 4, 7, 0, 7, 1, 8, 0, 4, 8,},
                        {1, 4, 7, 3, 4, 0, 0, 0, 7, 7, 1, 0, 2, 2, 3, 6,},
                        {7, 6, 9, 0, 0, 4, 6, 8, 1, 3, 9, 8, 4, 9, 9, 9,},
                        {1, 4, 1, 6, 1, 3, 9, 5, 1, 4, 3, 4, 0, 0, 5, 2,},
                        {2, 0, 3, 3, 0, 9, 9, 7, 7, 3, 2, 5, 3, 7, 9, 9,},
                        {7, 7, 9, 7, 4, 7, 0, 8, 8, 9, 9, 0, 5, 3, 3, 3,},
                        {5, 7, 7, 1, 7, 8, 6, 0, 5, 9, 8, 3, 0, 3, 4, 0,},
                        {6, 8, 4, 6, 4, 5, 1, 9, 5, 8, 5, 6, 9, 1, 6, 0,},
                        {0, 6, 1, 5, 8, 4, 7, 7, 9, 7, 6, 6, 7, 0, 5, 3,},
                        {3, 0, 3, 0, 9, 3, 0, 1, 5, 0, 9, 2, 8, 4, 4, 2,},
                        {9, 8, 2, 8, 4, 7, 7, 7, 6, 1, 0, 3, 3, 4, 3, 4,},
                        {8, 7, 7, 2, 7, 6, 6, 3, 7, 8, 4, 2, 9, 4, 9, 2,}
                    };

                    matriz_B = new int[][]
                    {
                        {1, 6, 9, 5, 5, 6, 8, 4, 3, 6, 4, 2, 1, 5, 2, 5,},
                        {9, 4, 6, 3, 9, 9, 7, 8, 7, 7, 9, 5, 3, 9, 0, 8,},
                        {5, 4, 8, 6, 3, 1, 6, 3, 5, 5, 3, 8, 2, 4, 1, 2,},
                        {7, 1, 9, 5, 5, 9, 5, 6, 4, 9, 1, 9, 9, 1, 1, 3,},
                        {0, 4, 4, 2, 1, 3, 7, 6, 9, 8, 0, 3, 0, 9, 6, 8,},
                        {4, 5, 2, 2, 1, 6, 9, 5, 8, 5, 3, 7, 4, 0, 7, 8,},
                        {0, 0, 5, 4, 7, 5, 1, 7, 0, 0, 2, 9, 7, 9, 0, 4,},
                        {9, 4, 1, 6, 0, 0, 0, 8, 8, 8, 4, 1, 3, 8, 0, 1,},
                        {3, 6, 7, 8, 5, 0, 3, 3, 5, 6, 5, 3, 2, 5, 5, 0,},
                        {6, 8, 1, 5, 6, 6, 6, 3, 6, 8, 6, 0, 9, 4, 6, 9,},
                        {5, 7, 0, 1, 1, 2, 0, 7, 5, 5, 5, 8, 4, 0, 5, 6,},
                        {5, 7, 1, 7, 4, 6, 5, 2, 3, 8, 5, 1, 2, 7, 6, 9,},
                        {0, 4, 1, 7, 2, 2, 2, 8, 5, 7, 1, 0, 7, 7, 5, 3,},
                        {6, 7, 4, 6, 7, 5, 9, 6, 7, 7, 7, 5, 4, 6, 7, 2,},
                        {8, 2, 8, 7, 3, 7, 7, 1, 7, 3, 0, 5, 8, 1, 4, 5,},
                        {7, 0, 5, 7, 4, 6, 3, 1, 6, 3, 2, 3, 1, 0, 8, 1,},
                    };
                    q = 4;
                }
                break;
            }

            totalProcesadores = (int) Math.pow(2, 3 * q);
            n = (int) Math.rint(Math.pow(totalProcesadores, (1.00 / 3.00)));

            int[] nodo;
            for (int d = 0; d < totalProcesadores; d++)
            {
                nodo = new int[3];
                lista.add(nodo);
            }

            //-------------------------Inicia el Paso 1-------------------------

            for (int l = (3 * q - 1); l >= 2 * q; l--)
            {
                for (int m = 0; m < totalProcesadores; m++)
                {
                    temp = m;
                    binario = new int[20];
                    i = 0;

                    while (temp != 0)
                    {
                        if (temp % 2 == 0)
                        {
                            binario[i] = 0;
                            temp = temp / 2;
                            i++;
                        }
                        else
                        {
                            binario[i] = 1;
                            temp--;
                            temp = temp / 2;
                            i++;
                        }
                    }

                    if (binario[l] == 0)
                    {
                        binario[l] = 1;
                    }
                    else
                    {
                        binario[l] = 0;
                    }

                    suma = 0;
                    for (int k = 0; k < 20; k++)
                    {
                        suma += binario[k] * Math.pow(2, k);
                    }
                    t = suma;

                    if (binario[l] == 1)
                    {
                        for (int x = 0; x < n; x++)
                        {
                            for (int y = 0; y < n; y++)
                            {
                                for (int z = 0; z < n; z++)
                                {
                                    num_procesador = (Math.pow(2, 2 * q) * x) + (Math.pow(2, q) * y) + z;

                                    if (num_procesador == m)
                                    {
                                        nuevo = lista.get(m);
                                        nuevo[0] = matriz_A[y][z];
                                        nuevo[1] = matriz_B[y][z];
                                    }
                                }
                            }
                        }

                        origen = lista.get(m);
                        destino = lista.get(t);

                        destino[0] = origen[0];
                        destino[1] = origen[1];
                    }
                }
            }

            //--------------------------Inicia el Paso 2------------------------

            for (int l = (q - 1); l >= 0; l--)
            {
                for (int m = 0; m < totalProcesadores; m++) //Se envian los valores de la matriz 'A'
                {
                    binario = new int[20];
                    i = 0;
                    temp = m;

                    while (temp != 0)
                    {
                        if (temp % 2 == 0)
                        {
                            binario[i] = 0;
                            temp = temp / 2;
                            i++;
                        }
                        else
                        {
                            binario[i] = 1;
                            temp--;
                            temp = temp / 2;
                            i++;
                        }
                    }

                    if (binario[l] == 0)
                    {
                        binario[l] = 1;
                    }
                    else
                    {
                        binario[l] = 0;
                    }

                    suma = 0;

                    for (int k = 0; k < 20; k++)
                    {
                        suma += binario[k] * Math.pow(2, k);
                    }

                    t = suma;

                    if (binario[l] != binario[2 * q + l])
                    {
                        origen = lista.get(m);
                        destino = lista.get(t);

                        a = origen[0];
                        destino[0] = a;
                    }
                }
            }

            for (int l = 2 * q - 1; l >= q; l--) //Se envian los valores de la matriz 'B'
            {
                for (int m = 0; m < totalProcesadores; m++)
                {
                    binario = new int[20];
                    i = 0;
                    temp = m;

                    while (temp != 0)
                    {
                        if (temp % 2 == 0)
                        {
                            binario[i] = 0;
                            temp = temp / 2;
                            i++;
                        }
                        else
                        {
                            binario[i] = 1;
                            temp--;
                            temp = temp / 2;
                            i++;
                        }
                    }

                    if (binario[l] == 0)
                    {
                        binario[l] = 1;
                    }
                    else
                    {
                        binario[l] = 0;
                    }

                    suma = 0;

                    for (int k = 0; k < 20; k++)
                    {
                        suma += binario[k] * Math.pow(2, k);
                    }

                    t = suma;

                    if (binario[l] != binario[q + l])
                    {
                        origen = lista.get(m);
                        destino = lista.get(t);

                        b = origen[1];
                        destino[1] = b;
                    }
                }
            }

            for (int m = 0; m < totalProcesadores; m++)
            {
                origen = lista.get(m);
                origen[2] = origen[0] * origen[1];
            }

            //-------------------------Inicia el Paso 3-------------------------

            for (int l = 2 * q; l <= 3 * q - 1; l++)
            {
                for (int m = 0; m < totalProcesadores; m++)
                {
                    binario = new int[20];
                    i = 0;
                    temp = m;

                    while (temp != 0)
                    {
                        if (temp % 2 == 0)
                        {
                            binario[i] = 0;
                            temp = temp / 2;
                            i++;
                        }
                        else
                        {
                            binario[i] = 1;
                            temp--;
                            temp = temp / 2;
                            i++;
                        }
                    }

                    if (binario[l] == 0)
                    {
                        binario[l] = 1;
                    }
                    else
                    {
                        binario[l] = 0;
                    }

                    suma = 0;

                    for (int k = 0; k < 20; k++)
                    {
                        suma += binario[k] * Math.pow(2, k);
                    }

                    t = suma;

                    if (binario[l] == 1)
                    {
                        origen = lista.get(m);
                        destino = lista.get(t);

                        s = origen[2];
                        destino[2] = destino[2] + s;
                    }
                }
            }

            int contador = 0;
            int saltoLinea = 0;
            Iterator<int[]> it2 = lista.listIterator();

            while(it2.hasNext())
            {
                nodo = it2.next();

                if (contador >= totalProcesadores - (n * n))
                {
                    System.out.print(nodo[2] + " ");
                    saltoLinea++;

                    if(saltoLinea == n)
                    {
                        System.out.print("\n");
                        saltoLinea = 0;
                    }
                }
                else
                {
                    contador++;
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Hipercubo\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}