package Hipercubo_A3;

import java.util.ArrayList;
import java.util.Iterator;

public class Operaciones
{
    private int tamMatrices;
    private int q;
    private int n;
    private int totalProcesadores;
    private int[][] matriz_A;
    private int[][] matriz_B;
    private ArrayList<Nodo> lista = new ArrayList<Nodo>();

    public Operaciones(int tamMa)
    {
        tamMatrices = tamMa;
    }

    void paso1()
    {
        int a, b, t;
        int[] binario;
        Nodo origen, destino;
        
        for (int l = (3 * q - 1); l >= 2 * q; l--)
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = decimalBinario(m);
                t = bitComplement(binario, l);

                if (bit(binario, l) == 1)
                {
                    asignarDatos(m);

                    origen = lista.get(m);
                    destino = lista.get(t);

                    destino.VALOR_A = origen.VALOR_A;
                    destino.VALOR_B = origen.VALOR_B;
                }
            }
        }

        for (int l = (q - 1); l >= 0; l--) //Se envian los valores de la matriz 'A'
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = decimalBinario(m);
                t = bitComplement(binario, l);

                if (bit(binario, l) != bit(binario, 2 * q + l))
                {
                    origen = lista.get(m);
                    destino = lista.get(t);

                    a = origen.VALOR_A;
                    destino.VALOR_A = a;
                }
            }
        }

        for (int l = 2 * q - 1; l >= q; l--) //Se envian los valores de la matriz 'B'
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = decimalBinario(m);
                t = bitComplement(binario, l);

                if (bit(binario, l) != bit(binario, q + l))
                {
                    origen = lista.get(m);
                    destino = lista.get(t);

                    b = origen.VALOR_B;
                    destino.VALOR_B = b;
                }
            }
        }
    }

    void paso2()
    {
        Nodo origen;

        for (int m = 0; m < totalProcesadores; m++)
        {
            origen = lista.get(m);
            origen.VALOR_C = origen.VALOR_A * origen.VALOR_B;
        }
    }

    void paso3()
    {
        int t, s;
        int[] binario;
        Nodo origen, destino;

        for (int l = 2 * q; l <= 3 * q - 1; l++)
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = decimalBinario(m);
                t = bitComplement(binario, l);

                if (bit(binario, l) == 1)
                {
                    origen = lista.get(m);
                    destino = lista.get(t);

                    s = origen.VALOR_C;
                    destino.VALOR_C = destino.VALOR_C + s;
                }
            }
        }
    }

    void crearNodos()
    {
        totalProcesadores = (int) Math.pow(2, 3 * q);
        n = (int) Math.rint(Math.pow(totalProcesadores, (1.00 / 3.00)));
        Nodo nodo;

        for (int i = 0; i < totalProcesadores; i++)
        {
            nodo = new Nodo();
            lista.add(nodo);
        }
    }

    private void asignarDatos(int proc_actual)
    {
        Nodo nodo;

        for (int k = 0; k <= n - 1; k++)
        {
            for (int i = 0; i <= n - 1; i++)
            {
                for (int j = 0; j <= n - 1; j++)
                {
                    double num_procesador = (Math.pow(2, 2 * q) * k) + (Math.pow(2, q) * i) + j;

                    if (num_procesador == proc_actual)
                    {
                        nodo = lista.get(proc_actual);
                        nodo.VALOR_A = matriz_A[i][j];
                        nodo.VALOR_B = matriz_B[i][j];
                    }
                }
            }
        }
    }

    void imprimir()
    {
        int contador = 0;
        int saltoLinea = 0;
        Iterator<Nodo> it = lista.listIterator();
        System.out.println("LISTA SIZE: " + lista.size());
        Nodo nodo;

        while(it.hasNext())
        {
            nodo = it.next();

            if (contador >= totalProcesadores - (n * n))
            {
                System.out.print(nodo.VALOR_C + " ");
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

    private int bit(int[] binario, int posicion)
    {
        if (binario[posicion] == 0)
        {
            return 0;
        } 
        else
        {
            return 1;
        }
    }

    private int bitComplement(int[] binario, int posicion)
    {
        if (binario[posicion] == 0)
        {
            binario[posicion] = 1;
        } 
        else
        {
            binario[posicion] = 0;
        }

        return binarioDecimal(binario);
    }

    private int[] decimalBinario(int valorDecimal)
    {
        int i = 0;
        int[] binario = new int[20];

        while (valorDecimal != 0)
        {
            if (valorDecimal % 2 == 0)
            {
                binario[i] = 0;
                valorDecimal = valorDecimal / 2;
                i++;
            } 
            else
            {
                binario[i] = 1;
                valorDecimal--;
                valorDecimal = valorDecimal / 2;
                i++;
            }
        }
        return binario;
    }

    private int binarioDecimal(int[] binario)
    {
        int suma = 0;

        for (int i = 0; i < 20; i++)
        {
            suma += binario[i] * Math.pow(2, i);
        }
        
        return suma;
    }

    void obtenerMatrices()
    {
        switch (tamMatrices)
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
    }
}