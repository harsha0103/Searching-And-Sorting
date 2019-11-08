object heapSort {
  //best, worst and AVG time complexity is O(NlogN)
  def main(args: Array[String]): Unit = {
    var initailarray = Array(3, 2, 37,460,46,6, 31, 1,5, 2,10, 4)
    heapsort(initailarray).foreach(println)
  }
  def heapsort(unsort: Array[Int]):Array[Int]={
    //Get the index of the max element
    // switch max element with
    if(unsort.length<2)
      {
        unsort
      }
    else {
      var temp = unsort.max
      var index = unsort.indexOf(unsort.max)
      unsort(index) = unsort(unsort.length - 1)
      unsort(unsort.length - 1) = temp
      Array.concat(heapsort(unsort.take(unsort.length - 1)),unsort.takeRight(1))

    }

  }

}
