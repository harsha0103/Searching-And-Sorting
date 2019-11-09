object selectionSort {
  //find the min element of an array and sort it in the begening of the array
  //time complexity is best worst and avg O(n2)
  def main(args: Array[String]): Unit = {
    //declaring a Array
    var initailarray = Array(3, 2, 37,2,460,46,6, 31, 1,5, 2,10, 4)

    selectionSort(initailarray).foreach(println)

  }

  def selectionSort(unsort: Array[Int]): Array[Int] = {
    var temp = 0
    for (i <- 0 to unsort.length - 1) {
      //getting the index of the min term in the right of its value
      //check for the last element of the array
      if (unsort.takeRight(unsort.length-1- i).length > 0) {
        //check find the index of the right side of the array
        //make sure you are getting the index of the correct right of the array
        //don't get the index of the duplicate element(very important)
        var ind = unsort.takeRight(unsort.length-1 - i).indexOf(unsort.takeRight(unsort.length-1 - i).min)+i+1
        if (unsort(i) > unsort(ind)) {
          temp = unsort(i)
          unsort(i) = unsort(ind)
          unsort(ind) = temp
        }
      }
    }
    unsort
  }
}
