//Functions in Scala

object functions {

	object Math {
		def add(x : Int, y : Int) : Int = {
			return x +y;
		}
		def square(x: Int) = x*x;
	}

	def add(x : Int, y : Int) : Int = {
		return x+y;
	
	}
	def subtract(x : Int, y : Int) : Int = {
                x-y;

        }
	def multiply(x : Int, y : Int) : Int = x * y;

 
	def divide(x : Int, y : Int) : Int = x / y;


	def main(args: Array[String]) {
		println(add(2,3));
		println(subtract(2,3));
		println(multiply(2,3));
		println(divide(2,3));
		println(Math.add(5,6));
		println(Math square 5);

	}

}
