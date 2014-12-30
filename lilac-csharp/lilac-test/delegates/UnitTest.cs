using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace lilac_test.delegates
{
    [TestClass]
    public class UnitTest
    {
        delegate double DoubleOp(double x);

        [TestMethod]
        public void TestMathOperations()
        {
            DoubleOp[] operations = { MathOperations.MultiplyByTwo, MathOperations.Square };
            for (int i = 0; i < operations.Length; i++)
            {
                Console.WriteLine("Using operations[{0}]:",i);
                operations[i](i);
                Console.WriteLine();
            }
                
        }
    }
}
