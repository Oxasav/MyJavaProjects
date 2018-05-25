package armyGame;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class armyGame {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

	        String[] nm = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nm[0].trim());

	        int m = Integer.parseInt(nm[1].trim());

	        int result = gameWithCells(n, m);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();
	}
	private static int gameWithCells(int n, int m) {
		 if (m > 0 && n > 0)
         {
             if (n % 2 == 0)
                return (m % 2 == 0)? (m * n) / 4: (n * (m - 1)) / 4 + n / 2;
             else
                return (m % 2 == 0) ? ((n - 1) * m) / 4 + m / 2 : ((n - 1) * (m - 1)) / 4 + (n - 1) / 2 + (m - 1) / 2 + 1;
         }
         else
             return 0;
	}

}
