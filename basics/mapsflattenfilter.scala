//Scala maps and filters

object mapsfilters {

	val lst = List(1,2,3,4,10,13);
	val mymap = Map(1 -> "Tom", 2-> "Max", 3 -> "John");
	def main(args: Array[String]){
	println(lst.map(_ * 2)); //doubles numbers in list
	// Adds to each number in list
	println(lst.map(x => x+2));
	// prints hi before each x
	println(lst.map(x => "hi: "+x));
	//Prints hi certain # of times x
	println(lst.map(x => "hi" * x));
	
	//prints hi next to tuple
	println(mymap.map(x => "hi"+ x));
	//prints # -> hi name
	println(mymap.mapValues(x => "hi" + x));
	//Applies toupper on every character of string:
	println("hello".map(_.toUpper));

	println(List(List(1,2,3),List(3,4,5)));
	
	//flatten combines the lists
	println(List(List(1,2,3),List(3,4,5)).flatten);
	
	//maps results to lists:
	
        println(lst.map(x => List(x,x+1)));

	//flatmap
	println(lst.flatMap(x => List(x,x+1)));

	//filter
	println(lst.filter(x => x % 2 == 0));

	}

}
