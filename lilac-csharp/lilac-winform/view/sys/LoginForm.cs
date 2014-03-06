using lilac_winform.model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lilac_winform.view.sys
{
    public partial class LoginForm : Form
    {
        public LoginForm()
        {
            InitializeComponent();
        }

        private void submit_Click(object sender, EventArgs e)
        {
            User user = new User();

            String userName = this.userNameTextBox.Text;
            String password = this.passwordTextBox.Text;

            if (String.IsNullOrWhiteSpace(userName))
            {
                MessageBox.Show("User name can not emplty!");
                return;
            }
            else
            {
                user.UserName = userName;
            }


            if (String.IsNullOrWhiteSpace(password))
            {
                MessageBox.Show("Password can not emplty!");
                return;
            }
            else
            {
                user.Password = password;
            }

            MessageBox.Show(user.ToString());
            return;
        }

        private void cancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
