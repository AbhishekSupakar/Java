class FitnessTracker  
{
	private int dailySteps ;
	private double caloriesBurned;
	private int activeMinutes;
	public void setDailySteps(int dailySteps){
		this.dailySteps = dailySteps;
	}
	public void setActiveMinutes(int activeMinutes){
		this.activeMinutes = activeMinutes;
	}
	public void setCaloriesBurned(double caloriesBurned){
		this.caloriesBurned = caloriesBurned;
	}
	public double getCaloriesBurned(){
		return caloriesBurned;
	}
	public int getActiveMinutes(){
		 return activeMinutes;
	}
	public int getDailySteps(){
		return dailySteps;
	}
	
}
