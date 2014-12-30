using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lilac_winform.model
{
    class User : IBaseModel
    {

        private String userName;

        private String password;

        public String UserName
        {
            get { return userName; }
            set { userName = value; }
        }

        public String Password
        {
            get { return password; }
            set { password = value; }
        }

        public override string ToString()
        {

            return this.userName + "$"+ this.password;
        }

    }
}
