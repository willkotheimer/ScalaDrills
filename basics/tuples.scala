object tuples {
	//fixed sized
	val mytuple = (1,2,"hello",true);
	val mytuple2 = new Tuple3(1,2,"hello");
	val mytuple3 = new Tuple3(1,"hello",(2,3));

	def main(args: Array[String]) {
	println(mytuple);
	println(mytuple._3);	
	println(mytuple._2);

	mytuple.productIterator.foreach {
	i => println(i);	
	}
	//Create tuple on the fly:
	println(1 -> "Tom");
	//Create
	println(mytuple3._3);
	println(mytuple3._3._2);
   }

}
