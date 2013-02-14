/*
 *
 * InterestBearingAccount
 * Demonstration for Java 104 tutorial
 * David Reilly, February 25, 1997
 *
 */


class InterestBearingAccount extends Account
{
        // Default interest rate of 7.95 percent (const)
	// ѕо умолчанию процентной ставкой 7,95 процента (Const)
        private static double default_interest = 7.95;

        // Current interest rate
        // текущей процентной ставке
        private double interest_rate;

        // Overloaded constructor accepting balance and an interest rate
        // перегруженный конструктор принимает баланса и процентной ставкой
        
        public InterestBearingAccount( double amount, double interest)
	{
		balance = amount;
		interest_rate = interest;
	}

        // Overloaded constructor accepting balance with a default interest rate
        // перегруженный конструктор, принимающий баланс по умолчанию процентна€ ставка
        public InterestBearingAccount( double amount )
	{
		balance = amount;
		interest_rate = default_interest;
	}

        // Overloaded constructor with empty balance and a default interest rate
        // перегруженный конструктор с пустым балансом и ѕен€
        public InterestBearingAccount()
	{
		balance = 0.0;
		interest_rate = default_interest;
	}
	
        public void add_monthly_interest()
	{
                // Add interest to our account
        	// ƒобавл€ем интерес к наш счет
		balance = balance + 		
                        (balance * interest_rate / 100) / 12;
	}

}
