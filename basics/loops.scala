object loops {
	def main(args: Array[String]) {
	
	for(i <- 1.to(5)) {
		println("i using to "+i);
	}

	 for(i <- 1.until(5)) {
                println("i using to "+i);
        }

	 for(i <- 1 to 5; j <- 1 to 3) {
                println("i using to "+i+" "+j);
        }

	//iterate over a list:
	val lst = List(1,2,3,44,56,67,233)
	
	 for(i <- lst) {
                println("i using to "+i);
        }
	//with filters
	 for(i <- lst; if i%2==0) {
                println("i using to "+i);
        }
	//as expression
	val result = for {i <- lst; if i%2==0} yield {
                i*i
        }
	println(result);

	  var y=0;
        while (y<10) {
                println("y = "+y);
                y+=1;
        }



         y=0;
        do {
                println("y= "+y);
                y+=1;
        } while (y < 10)
}

}
