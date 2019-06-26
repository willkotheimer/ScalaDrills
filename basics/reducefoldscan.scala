//Scala reduce, fold, or scan (left/right)
//reduceLeft, reduceRight, foldLeft, foldright, scanLeft, scanRight

object rfs {
	 val lst = List(1,2,3,4,6,7,10);
	 val lst2 = List("A","B","C");
	 def main(args: Array[String]) {
		println(lst2.reduceLeft(_+_));
		println(lst.reduceLeft(_+_));
		println(lst.reduceLeft((x,y) => {println(x + " , "+ y);x+y;}));
		
		//applied from right hand side:
		println(lst.reduceRight(_-_));
			
		println(lst.reduceRight((x,y) => {println(x + " , "+ y);x-y;}));

		//fold left -- passes initial value
		println(lst.foldLeft(0)(_+_));
		
		println(lst.foldRight(0)(_+_));

		//map of intermediate result:
		println(lst.scanLeft(100)(_+_));

	}

}
