/*
 *
 * AccountDemo
 * Demonstration of Account class
 *
 */
class AccountDemo 
{
        public static void main(String args[])
	{
                // Create an empty account
        		// Создать пустой счет 
                Account my_account = new Account();

                // Deposit money
                // Депозитные деньги
		my_account.deposit(450.00);

                // Print current balance
                // Вывод текущего баланса
		System.out.println ("Current balance " +
			my_account.getbalance());

                // Withdraw money
                // Вывести деньги
		my_account.withdraw(80.00);

                // Print remaining balance
                // Печать остаток
		System.out.println ("Remaining balance " +
			my_account.getbalance());
	}
}
