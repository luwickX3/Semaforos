package semaforos;
import java.util.Scanner;
public class Semaforos 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int h;
        int v;
        int cantidad = 0;
        int hospitales;
        int horizontalh = 0;
        int verticalh = 0;
        int escuelas;
        int horizontale = 0;
        int verticale = 0;
        System.out.print("ingrese la cantidad de calles horizontales:");
        h = Scan.nextInt();
        System.out.print("ingrese la cantidad de calles verticales:");
        v = Scan.nextInt();
        if(h==0||h<0||v==0||v<0)
        {
            System.out.print("numero invalido");
            System.exit(-1);
        }
        int terreno[][] = new int [h][v];
        System.out.print("ingrese la cantidad de hospitales:");
        hospitales = Scan.nextInt();
        System.out.print("ingrese la cantidad de escuelas:");
        escuelas = Scan.nextInt();
        if(hospitales == 0||hospitales<0||escuelas==0||escuelas<0)
        {
            System.out.print("numero invalido");
            System.exit(-1);
        }
        for (int i = 0; i < hospitales; i++)
        {
            System.out.print("ingrese la calle horizontal del hospital "+(i+1)+":");
            cantidad = Scan.nextInt();
            if(cantidad==0)
            {
                cantidad = cantidad + 1;
                horizontalh = cantidad;
            }
            else if(cantidad > 0)
            {
                cantidad = cantidad-1;
                horizontalh = cantidad;
            }
            else if(cantidad<0)
            {
                System.out.print("numero invalido");
                System.exit(-1);
            }
            System.out.print("ingrese la calle vertical del hospital "+(i+1)+":");
            cantidad = Scan.nextInt();
            if(cantidad==0)
            {
                cantidad = cantidad + 1;
                verticalh = cantidad;
            }
            else if(cantidad > 0)
            {
                cantidad = cantidad-1;
                verticalh = cantidad;
            }
            else if (cantidad < 0)
            {
                System.out.print("numero invalido");
                System.exit(-1);
            }
            terreno[horizontalh][verticalh]=3;
        }
        for (int i = 0; i < escuelas; i++)
        {
            System.out.print("ingrese la calle horizontal de la escuela "+(i+1)+":");
            cantidad = Scan.nextInt();
            if(cantidad==0)
            {
                cantidad = cantidad + 1;
                horizontale = cantidad;
            }
            else if(cantidad>0)
            {
                cantidad = cantidad-1;
                horizontale = cantidad;
            }
            else if (cantidad < 0)
            {
                System.out.print("numero invalido");
                System.exit(-1);
            }
            System.out.print("ingrese la calle vertical de la escuela "+(i+1)+":");
            cantidad = Scan.nextInt();
            if(cantidad==0)
            {
                cantidad = cantidad + 1;
                verticale = cantidad;
            }
            else if(cantidad>0)
            {
                cantidad = cantidad-1;
                verticale = cantidad;
            }
            else if (cantidad < 0)
            {
                System.out.print("numero invalido");
                System.exit(-1);
            }
            terreno[horizontale][verticale]=2;
        }
//        int callesdondehayhospitales[][] = new int [hospitales][hospitales];
//        int counterhospitales = 0;
//        int callesdondehayescuelas[][] = new int [escuelas][escuelas];
//        int counterescuelas = 0;
//        int value;
//        for (int i = 0; i < h; i ++)
//        {
//            for (int j = 0; j < v; j++)
//            {
//                if(terreno[i][j]==3)
//                {
//                    value = Integer.parseInt(Integer.toString(i)+Integer.toString(j));
//                    callesdondehayhospitales[counterhospitales][counterhospitales] = value;
//                    counterhospitales = counterhospitales+1;
//                }
//                else if(terreno[i][j]==2)
//                {
//                    value = Integer.parseInt(Integer.toString(i)+Integer.toString(j));
//                    callesdondehayescuelas[counterescuelas][counterescuelas] = value;
//                    counterescuelas = counterescuelas+1;
//                }
//            }
//        }
//        for (int i =0 ; i < hospitales; i++)
//        {
//            for (int j = 0; j < hospitales; j++)
//            {
//             System.out.print(callesdondehayhospitales[i][j]);
//            }
//            System.out.print("\n");
//        }
        for (int i = 0; i < h; i ++)
        {
            for (int j = 0; j < v; j++)
            {
                System.out.print(terreno[i][j]);
            }
            System.out.print("\n");
        }
    }
}
