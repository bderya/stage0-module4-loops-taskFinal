package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) 
	{
        for (int i = 1; i <= cathetusLength; i++) 
		{
			for (int j = 0; j < cathetusLength - i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--)
			{
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++)
			{
				System.out.print(l);
			}
			for(int d = cathetusLength - i; d >= 1; d--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
