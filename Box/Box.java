public class Box 
{
   /**
    * The Box class contains the dimensions of the box and methods to 
    * alter and obtain properties of our box.
   */
   private double width;
   private double height;
   private double depth;
   
   //constructor(s)
   /**
    * Create a box with the given dimensions.
    * @param width the initial width of our box
    * @param height the initial height of our box
    * @param depth  the initial depth of our box
    * @throws Exception if any of the parameters is <= 0
    */
    
    public Box(double width, double height, double depth) throws Exception
    {
       if (width > 0 && height > 0 && depth > 0)
       {
          this.width = width;
          this.height = height;
          this.depth = depth;
       }
       else
       {
          throw new Exception("All dimensions must be greater than 0!");
       }
    }

   /**
    * Create a box with dimensions 1 x 1 x 1.
    */
    
    public Box()
    {
       this.width = 1;
       this.height = 1;
       this.depth = 1;
    }
   
   //accessor methods
   
   /**
    * Returns the volume of our box.
    * @return the volume of the box
    */
    
   public double get_volume()
   {
      return this.width * this.height * this.depth;
   }
   
   // mutator methods
   
   /**
    * Change the width of our box to the given width.
    * @pre. width must be > 0.
    */
    
   public void set_width(double width)
   {
      this.width = width;
      return;
   }

   /**
    * Change the height of our box to the given height.
    * @return true if successful, false otherwise.
    */

   public boolean set_height(double height)
   {
      if (height > 0)
      {
         this.height = height;
	 return true;
      }
      return false;
   }

   /**
    * Change the depth of our box to the given depth.
    * @throws Exception if the given depth is <= 0
    */
    
   public void set_depth(double depth) throws Exception
   {
      if (depth > 0)
      {
         this.depth = depth;
	 return;
      }
      throw new Exception("The given depth must be greater than 0!"); 
   }
   
   /**
    * Resize all dimensions of our box by either a multiple or a given amount        * depending on the parameter passed.
    * @param amount the numeric value to be applied to the resizing.
    * @param operation can be "add" to add "amount" to all dimensions or "multiply" to multiply all dimensions by "amount"
    * 
    */
    
    public void resize(double amount, String operation)
    {
       if (operation.equals("add"))
       {
          this.width += amount;
	  this.height += amount;
	  this.depth += amount;
       }
       else if (operation.equals("multiply"))
       {
          this.width = this.width * amount;
	  this.height = this.height * amount;
	  this.depth = this.depth * amount;
       }
       return;
    }
}











