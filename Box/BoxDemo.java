import shapes.Box;

// This class declares an object of type box.
class BoxDemo
{
   public static void main (String args[])
   {
      Box mybox = new Box();
      double vol;
      
      // Assign some values to mybox's instance variables
      mybox.set_width(10);
      mybox.set_height(20);
      mybox.set_depth(15);
      
      // Retrieve the volume of the box.
      vol = mybox.get_volume();
      
      // Output the volume of the box.
      System.out.println("The volume of the box is: " + vol);
   }
}
