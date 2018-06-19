package Hipercubo_A4;

import java.util.ArrayList;

public class Algoritmo
{
    static int q;
    static int totalProcesadores;
    static int n;
    static int dimension;
    static int[][] matriz_A;
    static int[][] matriz_B;
    static ArrayList<Nodo> lista;

    public void iniciar(int tamaño)
    {
        dimension = tamaño;
        q = dimension + 1;
        totalProcesadores = (int) Math.pow(2, 3 * q);
        n = (int) Math.rint(Math.pow(totalProcesadores, (1.00 / 3.00)));

        lista = new CrearNodos().crear(totalProcesadores); //Crea los nodos
        matriz_A = new ObtenerMA().calcular(dimension); //Obtiene las matrices
        matriz_B = new ObtenerMB().calcular(dimension);//Obtiene las matrices

        lista = new Paso1().invocar(lista); //Inicia el algoritmo
        lista = new Paso2().invocar(lista);
        lista = new Paso3().invocar(lista); //Termina el algoritmo
    }
}