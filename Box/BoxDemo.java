import java.io.PrintStream;
import shapes.Box;

// This class declares an object of type box.
class BoxDemo
{
   public static void main (String args[])
   {
      PrintStream out = System.out;
      Box mybox = new Box();
      double vol;
      
      // Assign some values to mybox's instance variables
      mybox.set_width(10);
      mybox.set_height(20);
      mybox.set_depth(15);
      

      // Output the box's current dimensions
      out.printf("\nThe dimensions of the box are:\n %.2f x %.2f"
         + " x %.2f", mybox.get_width(), mybox.get_height(), mybox.get_depth());

      // Retrieve the volume of the box.
      vol = mybox.get_volume();
      
      // Output the volume of the box.
      out.printf("\nThe volume of the box is:\n %.2f", vol);

      // Resize our box
      mybox.resize(7.5, "add");

      // Output the box's current dimensions
      out.printf("\nAfter adding 7.5 to all dimensions the dimensions of the"
         + " box are:\n %.2f x %.2f"
         + " x %.2f", mybox.get_width(), mybox.get_height(), mybox.get_depth());

      // Retrieve the new volume of the box.
      vol = mybox.get_volume();

      // output the new volume of the box
      out.printf("\nThe volume of the box is:\n %.2f", vol);

      // Resize our box with the multiply operation
      mybox.resize(2.5, "multiply");

      // Output the box's current dimensions
      out.printf("\nAfter multiplying all dimensions by 2.5 The dimensions"
         + " of the box are:\n %.2f x %.2f"
         + " x %.2f", mybox.get_width(), mybox.get_height(), mybox.get_depth());

      // Retrieve the new volume of the box.
      vol = mybox.get_volume();

      // output the new volume of the box
      out.printf("\nThe volume of the box is:\n %.2f\n\n", vol);

      return;
   }
}
