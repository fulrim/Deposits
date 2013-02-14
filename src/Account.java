/*
 *
 * Account
 * Demonstration for Java 102 tutorial
 * David Reilly, February 25, 1997
 */
public class Account 
{
        protected double balance;

        // Constructor to initialize balance
        // Конструктор для инициализации баланс
        public Account( double amount )
	{
		balance = amount;
	}

        // Overloaded constructor for empty balance
        // Перегруженный конструктор для пустых баланс
        public Account()
	{
		balance = 0.0;
	}

        public void deposit( double amount )
	{
		balance += amount;
	}

        public double withdraw( double amount )
	{
                // See if amount can be withdrawn
        	// Смотрите, если сумма может быть отозван
		if (balance >= amount)
		{
			balance -= amount;
                        return amount;
		}
		else
                // Withdrawal not allowed
			 // Вывод средств не допускается 
                        return 0.0;
	}

        public double getbalance()
	{
                return balance;
	}
}  
