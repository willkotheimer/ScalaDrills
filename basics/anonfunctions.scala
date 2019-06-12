//Anonymous functions

object Anon {

	object Math {	
		def +(x: Int = 45, y : Int = 15) : Int = {
		return x + y
		}
		def **(x: Int) = x*x;
	}

	def print(x : Int, y : Int): Unit = {
		println(x+y)
	}

	def main(args: Array[String]) {
	
	//Anonymous function
	var add = (x : Int, y : Int) => x + y

	println(add(300,500))
	print(100,200);
	println(Math ** 3);
	println(Math.+());

	}
}
