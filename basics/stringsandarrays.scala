import Array._

object stringsandarrays {

	val str1 : String = "Hello World"
	val str2 : String = " Max";
	
	val num1 = 75;
	val num2 = 100.25;

	def main(args: Array[String]) {
	println(str1.length());
	println(str1.concat(str2));
	println(str1 + str2);
	
	val result = printf("(%d -- %f -- %s)",num1,num2,str1);
	println(result);
	println("(%d -- %f --%s)".format(num1,num2,str1));	

	//arrays
	
	val myArr : Array[Int] = new Array[Int](5);
	val myArr2 =  new Array[Int](5);
	val myArr3 = Array(1,2,3,4,5);
	
	myArr(0) = 20;
	myArr(1) = 50;
	myArr(2) = 10;
	myArr(3) = 46;
	val result2 = concat(myArr,myArr3);
	for(c<- result2) {
	println(c);
	}

	for(i<-0 to (myArr.length - 1)) {
	println(myArr(i));
	}
}
}
