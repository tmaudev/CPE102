/**
 * Matrix Class
 *
 * @author Tyler Mau
 * @version 1.0
 */

public class Matrix
{
   private double[][] matrix;
   private int rows, col;
   public Matrix(int rows, int col)
   {
      this.rows = rows;
      this.col = col;
      matrix = new double[rows][col];
   }

   public Matrix(double[][] vals)
   {
      matrix = vals;
      rows = matrix[0].length
   }

   public Matrix times(Matrix other)
   {
   }

   public Matrix inverse()
   {
   }

   public Matrix transpose()
   {
      Matrix transMatrix = new Matrix(other.getRows(), other.getCol())

   }

   public int getRows()
   {
      return rows;
   }

   public int getCol()
   {
      return col;
   }
}
