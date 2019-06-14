object curry {

	def add(x: Int, y:Int) = x + y;

	def add2 (x : Int) = (y : Int) => x + y;
	def add3 (x: Int)(y: Int) = x + y;

	def main(args: Array[String]) {
	println(add(20,10));
	print(add2(2)(3));
	val sum40 = add2(40);
	println(sum40(100));

	println(add3(100)(200));

	//partial
	val sum50 = add3(50)_ ;
	println(sum50(400));
	}
}
