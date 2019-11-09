object insertionSort {
  def main(args: Array[String]): Unit = {
    var unsort= Array(3, 2, 37,460,46,6, 31, 1,5, 2,10, 4)
    insertionSort(unsort).foreach(println)
  }

  //time complexity is avg and worst O(n2) best case is O(n) same as bubble sort
  //

  def insertionSort(unsort:Array[Int]):Array[Int]={
    var temp=0
    for(i<-1 to unsort.length-1)
      {
        for(j<- 0 to i-1 ){
          if (unsort(j) > unsort(i)) {
            temp = unsort(i)
            unsort(i) = unsort(j)
            unsort(j) = temp
          }
        }
      }
      unsort
  }
}
