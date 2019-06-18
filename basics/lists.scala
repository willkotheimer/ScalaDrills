//Scala lists 

object lists {
	val mylist : List[Int] = List(1,2,3,4,5);
	val names : List[String] = List("Max","Will","Rachel");
	def main(args: Array[String]) {
	println(0 :: mylist); //prepend
	println(names);
	println(mylist);
	println(1 :: 5 :: 9 :: Nil)
	println(mylist.head);
	println(mylist.tail);
	println(names.head);
        println(names.tail);
	println(names.isEmpty);
	println(mylist.reverse);
	println(List.fill(5)(2));
	println(mylist.max);
	mylist.foreach(println);

	var sum : Int = 10;

	mylist.foreach(sum+= _)
	println(sum);

	for (name <- names) {
		println(name);
	}
	}
}
