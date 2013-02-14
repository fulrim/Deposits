/*
 *
 * AccountDemo
 * Demonstration of Account class
 *
 */
class AccountDemo 
{
//        public static void main(String args[])
//	{
//                // Create an empty account
//        		// ������� ������ ���� 
//                Account my_account = new Account();
//
//                // Deposit money
//                // ���������� ������
//		my_account.deposit(450.00);
//
//                // Print current balance
//                // ����� �������� �������
//		System.out.println ("Current balance " +
//			my_account.getbalance());
//
//                // Withdraw money
//                // ������� ������
//		my_account.withdraw(80.00);
//
//                // Print remaining balance
//                // ������ �������
//		System.out.println ("Remaining balance " +
//			my_account.getbalance());
//	}

	public static void main(String args[])
	{
                // Create an empty account
		// ������� ������ ���� 
		InterestBearingAccount my_account = new InterestBearingAccount();  

                // Deposit money
		// ����������
		my_account.deposit(250.00);

                // Print current balance
		//����� �������� �������
		System.out.println ("Current balance " +
			my_account.getbalance());

                // Withdraw money
		 // ������� ������ 
		my_account.withdraw(80.00);

                // Print remaining balance
		// ������ �������
		System.out.println ("Remaining balance " +
			my_account.getbalance());

                // Allow a month to pass
		// ��������� �����, ����� ������ 
		my_account.add_monthly_interest();
		System.out.println ("Adding interest to account");

                // Print remaining balance
		// ������ �������
		System.out.println ("Remaining balance " +
			my_account.getbalance());

	}
}
