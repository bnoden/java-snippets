public class ExecutionTime
{
	long startTime = System.currentTimeMillis();
	//perform the task;
	long endTime = System.currentTimeMillis();
	long executionTime = endTime - startTime;
}