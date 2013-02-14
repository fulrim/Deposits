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
        // ����������� ��� ������������� ������
        public Account( double amount )
	{
		balance = amount;
	}

        // Overloaded constructor for empty balance
        // ������������� ����������� ��� ������ ������
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
        	// ��������, ���� ����� ����� ���� �������
		if (balance >= amount)
		{
			balance -= amount;
                        return amount;
		}
		else
                // Withdrawal not allowed
			 // ����� ������� �� ����������� 
                        return 0.0;
	}

        public double getbalance()
	{
                return balance;
	}
}  
