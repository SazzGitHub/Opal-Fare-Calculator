import java.util.Scanner;
import java.io.*;

	class FinalJavaOpalUser
	{
		public static void main(String[] args)
		{
			int NuM;
			double SuNFares;

			Scanner in = new Scanner(System.in);

			System.out.println("Enter  The Number of USERS:");
			NuM = in.nextInt();

			SetGetOpalUsers[] OPALUSERS = new SetGetOpalUsers[NuM];
			ReadFile(OPALUSERS);

			for (int i=0; i< OPALUSERS.length; i++)
			{
				do
				{
					System.out.println("\nEnter SUNDAY Fares for User No. "+(i+1)+":");
					SuNFares = in.nextDouble();

					OPALUSERS[i].setSundayFares(SuNFares);
				}
				while (SuNFares > 2.7);
			}


			ShowFares(OPALUSERS);   //Displays Opal Users Daily Fares:

			SortFares(OPALUSERS);	//this is unsorterd:

			ShowFares(OPALUSERS);   //this one is Sorted:

			WriteFile(OPALUSERS);   //Methods to Create the Output File with the Opal User's daily Fares:

			System.exit(0);

		}

		public static void ReadFile(SetGetOpalUsers[] SA)
		{
			int No;
			double MonFares, TueFares, WednFares, ThuFares, FriFares, SatFares;

			try
			{
				Scanner Fin = new Scanner(new File("OpalUsersInputFile.txt"));

				for (int i=0; i<SA.length; i++)
				{
					SA[i] = new SetGetOpalUsers();
					No = Fin.nextInt();
					MonFares = Fin.nextDouble();
					TueFares = Fin.nextDouble();
					WednFares = Fin.nextDouble();
					ThuFares = Fin.nextDouble();
					FriFares = Fin.nextDouble();
					SatFares = Fin.nextDouble();

					SA[i].setUserNO(No);

					SA[i].setMondayFares(MonFares);
					SA[i].setTuesdayFares(TueFares);
					SA[i].setWednesdayFares(WednFares);
					SA[i].setThursdayFares(ThuFares);
					SA[i].setFridayFares(FriFares);
					SA[i].setSaturdayFares(SatFares);

				}

				System.out.println("\nWELCOME Opal Users \nFor Sunday Fares .....   ");
			}
			catch (Exception e)   //Identifying Exception to avoid crash:
			{
				System.out.println("File Not Found !");
				System.exit(0);

			}

		}

		public static void WriteFile(SetGetOpalUsers[] SA)
						{
							//Generates the Output File:

							try
							{
								FileWriter Fout = new FileWriter("OpalUsersOutputFile.txt");
								PrintWriter Pout = new PrintWriter(Fout);

								Pout.println("\nThe Opal User's Daily FARES Are: \n");
								Pout.print("\nUser No.    Mon              Tue            Wedn            Thur             Fri             Sat             Sun        Total Fares\n");

								for(int j=0; j<SA.length; j++)
								{
									Pout.println();
					    			Pout.format("%d " , SA[j].getUserNO());
									Pout.format("%15.2f " , SA[j].getMondayFares());
									Pout.format("%15.2f " , SA[j].getTuesdayFares());
									Pout.format("%15.2f " , SA[j].getWednesdayFares());
									Pout.format("%15.2f " , SA[j].getThursdayFares());
									Pout.format("%15.2f " , SA[j].getFridayFares());
									Pout.format("%15.2f " , SA[j].getSaturdayFares());

									Pout.format("%15.2f " , SA[j].getSundayFares());
									Pout.format("%15.2f " , SA[j].getTotalFares());

										Pout.flush();
								}

								System.out.println("\n\n OPAL USERS FINAL FARES are stored in 'OpalUsersOutputFile.txt' \n\n");

								Pout.close();   //Output File is Closed:
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}

					public static void ShowFares(SetGetOpalUsers[] SA)
					{
							System.out.println("\n\nThe Opal User's DAILY FARES Are: \n\n");
							System.out.print("\nUser No.    Mon           Tue             Wedn           Thur            Fri           Sat             Sun        Total Fares \n");

							for (int j=0; j < SA.length; j++)
							{
								System.out.println();
								System.out.format("%d" , SA[j].getUserNO());
								System.out.format("%15.2f" , SA[j].getMondayFares());
								System.out.format("%15.2f" , SA[j].getTuesdayFares());
								System.out.format("%15.2f" , SA[j].getWednesdayFares());
								System.out.format("%15.2f" , SA[j].getThursdayFares());
								System.out.format("%15.2f" , SA[j].getFridayFares());
								System.out.format("%15.2f" , SA[j].getSaturdayFares());

								System.out.format("%15.2f" , SA[j].getSundayFares());
								System.out.format("%15.2f" , SA[j].getTotalFares());

							}
				}


		public static void SortFares(SetGetOpalUsers[] SA)
		{
			SetGetOpalUsers Swap = new SetGetOpalUsers();

			for (int i = 0; i<SA.length; i++)
			{
				for (int j= i+1; j< SA.length; j++)
				{
					if (SA[i].getTotalFares() < SA[j].getTotalFares())
					{
						Swap = SA[i];
						SA[i] = SA[j];
						SA[j] = Swap;
					}
				}
			}
			System.out.println("\n\nThe Users Fares in Descending order Stored Below ...");
		}
}