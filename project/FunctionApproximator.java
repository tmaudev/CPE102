/**
 * Approximates any degree polynomial to a set of data points
 *
 * @author Tyler Mau
 * @version 1.0
 */

import java.awt.Point;
import Jama.Matrix;

public class FunctionApproximator
{
   private int degree;
   private Matrix A;
   private Matrix w;

   public FunctionApproximator(Point points[], int degree)
   {
      this.degree = degree;
      int i = 0, j=0;
      double[][] vals = new double[points.length][degree];
      double[] y = new double[degree];
      for(i=0; i<points.length; i++)
      {
         for(j=degree; j>=0; j--)
         {
            vals[i][j] = pow(points[i].getX(),j);
         }
         y[i] = points[i].getY();
      }
      A = new Matrix(vals);
      w = new Matrix(y,points.length);
   }

   public double[] solve()
   {
      Matrix x = ((((A.transpose()).times(A)).inverse()).times(A.transpose())).times(w);
      double[] coef = new double[degree];
      int i = 0;
      for(i=0; i<degree; i++)
      {
         coef[i] = x.get(i,0);
      }
      return coef;
   }

}
