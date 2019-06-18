object sets {
	val mySet: Set[Int] = Set(1,2,6,8,51,48,44);
	val mySet2: Set[Int] = Set(6,7,19,23,51,60,44);
	val names: Set[String] =  Set("Max","Rachel","Will","Rachel");
	def main(args: Array[String]) {
	println(mySet);
	println(mySet(8));
	println(names("Max"));
	println(mySet.head);
	println(mySet.tail);
	//concatenates
	println(mySet ++ mySet2);
	//Intersection
	println(mySet.&(mySet2));
	println(mySet.intersect(mySet2));
	println(mySet.min);
	println(mySet.max);

	mySet.foreach(println);

	for(name<-names) {
	println(name);
	}

	}

}
