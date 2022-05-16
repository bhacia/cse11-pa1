import tester.*;

class DesignRecipeExamples {
  /* Problem 1: Perimeter
     This method is expected to return the perimeter of a rectangle
     by taking argument values from method calls and using those
     values in the width and height parameters. From there, the
     method returns the perimeter by using the parameters in the
     perimeter formula: (width * 2) + (height * 2).
  */

  int perimeter(int width, int height) {
    //Parameters: width and height.
    //All real numbers for width and height.
    return (width * 2) + (height * 2);
  }

  int perimeterOfRec1 = this.perimeter(3, 5); //Expected value: 16
  int perimeterOfRec2 = this.perimeter(4, 11); //Expected value: 30
  int perimeterOfRec3 = this.perimeter(2, 7); //Expected value: 18
  int perimeterOfRec4 = this.perimeter(10, 12); //Expected value: 44

  /* Problem 2: BorderArea
     This method is expected to return the area of the border
     between two rectangles by taking argument values from method
     calls and using those values in the width1, width2, height1,
     and height2 parameters. (width1 and height1 being the bigger
     rectangle and width2 and height2 being the smaller rectangle.)
     The method will contain two fields, one called area1 and the
     other called area2. These fields will caclulate the areas of
     the two rectangles by using the parameters: area1 using width1
     and height1, and area2 using width2 and height2. From there,
     the method returns the border area by subtracting area2 from
     area1.
     NOTE: area1 MUST be the area of the bigger rectangle.
  */

  int borderArea(int width1, int height1, int width2, int height2) {
    //area1 MUST be the area of the bigger triangle.
    //In other words, area1 MUST be greater than area2.
    int area1 = width1 * height1;
    int area2 = width2 * height2;
    return area1 - area2;
  }

  int borderArea1 = this.borderArea(5, 10, 4, 6); //Expected value: 26
  int borderArea2 = this.borderArea(8, 11, 2, 9); //Expected value: 70
  int borderArea3 = this.borderArea(12, 14, 7, 8); //Expected value: 112
  int borderArea4 = this.borderArea(9, 13, 4, 10); //Expected value: 77

  /* Problem 3: Converter
     This method is expected to convert a value which indicates
     some temperature in Celsius into Kelvin, then return that
     new value. degreesC is the temperature in Celsius. kelvin is
     the new value that we'll return.
     NOTE: degreesC MUST be an int value, so the argument MUST
     also be an int value (whole number).
  */

  int celsiusToKelvin(int degreesC) {
    /*Kelvin is Celsius + 273.15 
      (from: https://www.srhartley.com/celsius-to-kelvin/formula/)
      However, we'll just be using 273.
      Ergo, this is an ESTIMATE since kelvin will be an int.
    */
    int kelvin = degreesC + 273;
    return kelvin;
  }

  //You MUST use whole numbers (int values) for arguments.
  int CtoK1 = this.celsiusToKelvin(32); //Expected value: 305
  //search engine value: 305.15
  int CtoK2 = this.celsiusToKelvin(24); //Expected value: 297
  //search engine value: 297.15
  int CtoK3 = this.celsiusToKelvin(26); //Expected value: 299
  //search engine value: 299.15
  int CtoK4 = this.celsiusToKelvin(21); //Expected value: 294
  //search engine value: 294.15

  /* NOTE: The search engine value is slightly higher than the
     expected values due to truncation in the formula. The formula
     contains a double, which cannot work when returning a type
     int value.
  */

  /* Problem 4: Combiner
     This method is expected to take someone's height in feet
     and inches, combine these into inches, and return the
     total inches (therefore returning the person's total height
     in inches).
  */

  int totalHeightInInches(int feet, int inches) {
    /* NOTE: feet and inches MUST be int values, so their respective
     arguments must also be int values (whole numbers).
     ^^For example, if someone wants to say they're 5 and a half
     feet tall. These values must be whole numbers, so they can
     truncate it to 5 feet 0 inches or round up to 5 feet 1 inch.
    */
    int totalInches = inches + (feet * 12);
    return totalInches;
  }

  //You MUST use whole numbers (int values) for arguments.
  int heightInches1 = this.totalHeightInInches(5, 3); //Expected value: 63
  int heightInches2 = this.totalHeightInInches(5, 11); //Expected value: 71
  int heightInches3 = this.totalHeightInInches(6, 2); //Expected value: 74
  int heightInches4 = this.totalHeightInInches(4, 10); //Expected value: 58
  
}