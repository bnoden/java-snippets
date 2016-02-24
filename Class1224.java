// Brandon Oden
// Create large dataset

import java.io.PrintWriter;

public class Class1224
{
	public static void main(String[] args) throws Exception
    {
		try (PrintWriter printWriter = new PrintWriter("Salary.txt"))
		{
            for (int i = 1; i <= 1000; i++)
            {
                String rank = Database.getRank();
                String salary = String.format("%.2f", Database.getSalary(rank));

                printWriter.print("FirstName" + " LastName" + " " + rank + " " + salary);
                if (i != 1000)
                {
                    printWriter.println();
                }
            }
        }
		
		System.out.println("Saved Salary.txt");
    }
}

class Database
{
	static final String[] rank = {"assistant", "associate", "full"};
    
    static String writeLine()
    {

        String rank = getRank();
        double salary = getSalary(rank);

        return "FirstName" + " LastName" + " " + rank + " " +
        	String.format("%.2f", salary);
    }

    static String getRank()
    {
        return rank[(int)(Math.random() * rank.length)];
    }

    static double getSalary(String rank)
    {

        int max = 0;
        int min = 0;
        switch (rank)
        {
            case "assistant":
                min = 50000;
                max = 80000;
                break;
            case "associate":
                min = 60000;
                max = 110000;
                break;
            case "full":
                min = 75000;
                max = 130000;
                break;
        }
        return randomSalary(min, max + 1);
    }

    private static double randomSalary(int min, int max)
    {
        int range = max - min;

        return (Math.random() * range) + min;
    }
}
