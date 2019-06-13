object higher {
	
	def math(x: Double, y: Double, z:Double, f:(Double,Double)=>Double): Double = f(f(x,y),z);

	def main(ages: Array[String]) {

		val result = math(50,20,10,(x,y)=>x+y);
		println(result);
		val result2 = math(50,20,10,(x,y)=>x *  y);
                println(result2);
		val result3 = math(50,20,10,(x,y)=>x min y);
                println(result3);
		val result4 = math(50,20,10,(x,y)=>x max y);
                println(result4);
 		val result5 = math(50,20,10,_ max _);
                println(result5);
	}


}
