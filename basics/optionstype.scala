//Scala - Options (Some or none)
object optionstype {

	val lst = List(1,2,3);
	val map = Map(1->"Tom",2->"Max",3->"John");
	val opt : Option[Int] = Some(5);
	val opt2: Option[Int] = None;
	def main(args: Array[String]) {
		println(lst.find(_ > 2));
		println(map.get(1));
		println(lst.find(_>2).get);
		println(map.get(5).getOrElse("No one found"));
		println(opt.isEmpty);


	}

}
