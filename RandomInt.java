public class RandomInt
{
	public static int randomInt(int min, int max)
	{
		return (int)(min + Math.random() * (max - min + 1));
	}
}
