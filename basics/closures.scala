//Scala Closures

object closure {

	var number = 10;
	val add  = (x: Int) => {

		number = x + number;
		number;
	}

	def main(args: Array[String]) {
	println(add(20));

	}

}
