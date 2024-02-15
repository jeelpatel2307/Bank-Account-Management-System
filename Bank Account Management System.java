class BankAccount:
    def __init__(self, account_number, account_holder, balance=0):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"Deposit of {amount} successfully made. Current balance: {self.balance}")

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"Withdrawal of {amount} successfully made. Current balance: {self.balance}")
        else:
            print("Insufficient funds. Withdrawal failed.")

    def display_balance(self):
        print(f"Account Holder: {self.account_holder}")
        print(f"Account Number: {self.account_number}")
        print(f"Current Balance: {self.balance}")


def main():
    account1 = BankAccount("123456789", "John Doe")
    account1.display_balance()

    account1.deposit(1000)
    account1.withdraw(500)
    account1.display_balance()


if __name__ == "__main__":
    main()
