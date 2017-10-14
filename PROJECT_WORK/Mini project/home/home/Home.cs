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
    public partial class Home : Form
    {
        public Home()
        {
            InitializeComponent();
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            DoctorLogin r = new DoctorLogin();
            this.Hide();
            r.Show();
        }

        private void linkLabel2_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            AgentViewPage a = new AgentViewPage();
            this.Hide();
            a.Show();
        }

        private void linkLabel3_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            PatientViewPage p = new PatientViewPage();
            this.Hide();
            p.Show();
        }

        private void linkLabel4_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            ADMIN_Login ad = new ADMIN_Login();
            this.Hide();
            ad.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();            
        }
    }
}
