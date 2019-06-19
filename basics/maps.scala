object maps {
	val mymap : Map[Int,String] = Map(801 -> "max",802 ->"Will",803->"Rachel")
	val mymap2 : Map[Int,String] = Map(805->"Kotheimer");	
	
	def main(args: Array[String]) {
		println(mymap);
		//key / value
		println(mymap(802));
		println(mymap.keys);
		println(mymap.values);
		println(mymap.isEmpty);
		mymap.keys.foreach {
			key=>
			println("key" + key);
			println("value" + mymap(key));

		}
		println(mymap.contains(801));
		println(mymap ++ mymap2);

	}
}
