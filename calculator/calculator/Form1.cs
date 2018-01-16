using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace calculator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            l1.Text = " ";
            l2.Text = "=";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }

            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "5";
                else
                    t1.Text = t1.Text + "5";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "5";
                else
                    t2.Text = t2.Text + "5";
            }
        }

        private void l1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
             
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "1";
                else
                    t1.Text = t1.Text + "1";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "1";
                else
                    t2.Text = t2.Text + "1";
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "2";
                else
                    t1.Text = t1.Text + "2";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "2";
                else
                    t2.Text = t2.Text + "2";
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "3";
                else
                    t1.Text = t1.Text + "3";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "3";
                else
                    t2.Text = t2.Text + "3";
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "4";
                else
                    t1.Text = t1.Text + "4";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "4";
                else
                    t2.Text = t2.Text + "4";
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "6";
                else
                    t1.Text = t1.Text + "6";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "6";
                else
                    t2.Text = t2.Text + "6";
            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "7";
                else
                    t1.Text = t1.Text + "7";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "7";
                else
                    t2.Text = t2.Text + "7";
            }
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "8";
                else
                    t1.Text = t1.Text + "8";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "8";
                else
                    t2.Text = t2.Text + "8";
            }
        }

        private void button9_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "9";
                else
                    t1.Text = t1.Text + "9";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "9";
                else
                    t2.Text = t2.Text + "9";
            }
        }

        private void button10_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && t2.Text != " " && t3.Text != " ")
            {
                t1.Text = " ";
                t2.Text = " ";
                t3.Text = " ";
                l1.Text = " ";
            }
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = " ";
                else
                    t1.Text = t1.Text + "0";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "0";
                else
                    t2.Text = t2.Text + "0";
            }
        }

        private void button12_Click(object sender, EventArgs e)
        {
            if (l1.Text == " ")
            {
                if (t1.Text == " ")
                    t1.Text = "0.";
                else
                    t1.Text = t1.Text + ".";
            }
            else
            {
                if (t2.Text == " ")
                    t2.Text = "0.";
                else
                    t2.Text = t2.Text + ".";
            }
        }

        private void button13_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && l1.Text != " " && t3.Text != " ")
            {
                t1.Text = t3.Text;
                l1.Text = "+";
                t2.Text = " ";
                t3.Text = " ";
            }
            else
            l1.Text = "+";

        }

        private void button14_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && l1.Text != " " && t3.Text != " ")
            {
                t1.Text = t3.Text;
                l1.Text = "-";
                t2.Text = " ";
                t3.Text = " ";
            }
            else
            l1.Text = "-";


        }

        private void button15_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && l1.Text != " " && t3.Text != " ")
            {
                t1.Text = t3.Text;
                l1.Text = "*";
                t2.Text = " ";
                t3.Text = " ";
            }
            else
            l1.Text = "*";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            if (t1.Text != " " && l1.Text != " " && t3.Text != " ")
            {
                t1.Text = t3.Text;
                l1.Text = "/";
                t2.Text = " ";
                t3.Text = " ";
            }
            else
            l1.Text = "/";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            l2.Text = "=";
            double d;
            double a = Convert.ToDouble(t1.Text);
            double b = Convert.ToDouble(t2.Text);
             if(l1.Text=="+")
             {  d = a + b;
            t3.Text=Convert.ToString(d);
             }
             else if(l1.Text=="-")
            {  d= a-b;
            t3.Text = Convert.ToString(d);
            }
             else if(l1.Text=="*")
            {   d=a*b;
            t3.Text = Convert.ToString(d);
            }
             else if(l1.Text=="/")
            { d=a/b;
            t3.Text = Convert.ToString(d);
            }
        }

        private void button17_Click(object sender, EventArgs e)
        {
            t1.Text = " ";
            t2.Text = " ";
            t3.Text = " ";
            l1.Text = " ";

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
