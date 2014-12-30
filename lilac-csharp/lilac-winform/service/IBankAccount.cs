using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lilac_winform.service
{
    interface IBankAccount
    {
        bool PayIn(decimal amount);
        bool withDraw(decimal amount);
        decimal getBalance();
    }
}
