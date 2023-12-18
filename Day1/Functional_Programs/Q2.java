import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        int N = scannerObject.nextInt();

        int inputArray[] = new int[N];

        for(int i = 0; i < N ; i++)
        {
            inputArray[i] = scannerObject.nextInt();
        }

        ArrayList<ArrayList<Integer>> ansTriplets = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                for(int k = 0; k < N; k++)
                {
                    if(inputArray[i] + inputArray[j] + inputArray[k] == 0)
                    {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();

                        tmp.add(i);
                        tmp.add(j);
                        tmp.add(k);
                        
                        ansTriplets.add(tmp);
                    }
                }
            }
        }

        System.out.println(ansTriplets.size());

        for(int i = 0; i < ansTriplets.size(); i++)
        {
            System.out.println(ansTriplets.get(i).get(0) + " " + ansTriplets.get(i).get(1) + " " + ansTriplets.get(i).get(2));
        }

        scannerObject.close();
    }
}