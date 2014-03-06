using lilac_winform.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lilac_net.service
{
    class BankAccount:IBankAccount

    {
        private decimal balance;

        public bool PayIn(decimal amount)
        {
            if (amount > 0)
            {
                this.balance += amount;
            } else
            {
                Console.WriteLine("the amount is not vaild");
            }
            return true;
        }

        public bool withDraw(decimal amount)
        {
            throw new NotImplementedException();
        }


        public decimal getBalance()
        {
            throw new NotImplementedException();
        }
    }
}
