using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace home
{
    public partial class DoctorLogin : Form
    {
        public DoctorLogin()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Home h = new Home();
            this.Close();
            h.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DoctorViewPage d = new DoctorViewPage();
            this.Hide();
            d.Show();
        }
    }
}
