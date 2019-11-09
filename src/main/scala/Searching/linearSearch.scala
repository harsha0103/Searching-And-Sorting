package searching




object linearSearch {
///indexof Implicit
//  This member is added by an implicit conversion from Array[T] to ArrayOps[T] performed by method genericArrayOps in scala.Predef.
//index of used linear search
  def main(args: Array[String]): Unit = {
    //Given an array arr[] of n elements, write a function to search a given element x in arr[].
    var initailarray = Array(3, 2, 31, 31, 1, 5, 10, 4)
    var a = 0

      for (i<- 0 to initailarray.length-1){
        if (initailarray(i)==a){
          println("index of the element "+a+" is " +i)
        a= -1
        }

      }

    if(a != -1){
      println("element doesn't exist")
    }
  }

}
