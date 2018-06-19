package Hipercubo_A4;

public class ObtenerMB implements Entradas
{
    public int[][] calcular(int dimension)
    {
        int[][] matriz_B = null;

        switch (dimension)
        {
            case 0:
            {
                matriz_B = new int[][]
                {
                    {1, 6},
                    {5, 3}
                };
            }
            break;

            case 1:
            {
                matriz_B = new int[][]
                {
                    {9, 7, 7, 7,},
                    {1, 4, 6, 4,},
                    {0, 1, 3, 9,},
                    {0, 5, 9, 3,}
                };
            }
            break;

            case 2:
            {
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
            }
            break;

            case 3:
            {
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
            }
            break;
        }

        return matriz_B;
    }
}