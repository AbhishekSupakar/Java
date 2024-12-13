class TestFitness 
{
	public static void main(String[] args) 
	{
		FitnessTracker  ft1 = new FitnessTracker();
		ft1.setDailySteps(10000);
		ft1.setActiveMinutes(3*60);
		ft1.setCaloriesBurned(500);
		System.out.println("Daily Steps: "+ft1.getDailySteps());
		System.out.println("Calories Burned: "+ft1.getCaloriesBurned());
		System.out.println("Activity minutes: "+ft1. getActiveMinutes());
	}
}
