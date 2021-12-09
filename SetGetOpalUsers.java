public class SetGetOpalUsers
{
	private int UserNO;
	private double MondayFares;
	private double TuesdayFares;
	private double WednesdayFares;
	private double ThursdayFares;
	private double FridayFares;
	private double SaturdayFares;

	private double SundayFares;
	private double TotalFares;


	public void setUserNO(int NO)
	{
		UserNO = NO;
		return;
	}

	public void setMondayFares(double Fares)
	{
		MondayFares = Fares;
		return;
	}

	public void setTuesdayFares(double Fares)
	{
		TuesdayFares = Fares;
		return;
	}

	public void setWednesdayFares(double Fares)
	{
		WednesdayFares = Fares;
		return;
	}

	public void setThursdayFares(double Fares)
	{
			ThursdayFares = Fares;
			return;
	}

	public void setFridayFares(double Fares)
	{
			FridayFares = Fares;
			return;
	}

	public void setSaturdayFares(double Fares)
	{
			SaturdayFares = Fares;
			return;
	}

	public void setSundayFares(double Fares)
	{
		SundayFares = Fares;
		TotalFares = MondayFares + TuesdayFares + WednesdayFares + ThursdayFares + FridayFares + SaturdayFares + SundayFares;

		return;
	}


		public int getUserNO()
		{
			return UserNO;
		}

		public double getMondayFares()
		{
			return MondayFares;
		}

		public double getTuesdayFares()
		{
			return TuesdayFares;
		}

		public double getWednesdayFares()
		{
			return WednesdayFares;
		}

		public double getThursdayFares()
		{
			return ThursdayFares;
		}

		public double getFridayFares()
		{
			return FridayFares;
		}

		public double getSaturdayFares()
		{
			return SaturdayFares;
		}

		public double getSundayFares()
		{
			return SundayFares;
		}

		public double getTotalFares()
		{
			return TotalFares;
		}

	}