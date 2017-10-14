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
    public partial class PatientViewPage : Form
    {
        public PatientViewPage()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label2.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Home h = new Home();
            this.Close();
            h.Show();
        }
    }
}
