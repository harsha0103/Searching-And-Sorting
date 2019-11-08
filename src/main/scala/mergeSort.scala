object mergeSort {

  //https://www.baeldung.com/java-merge-sort
  //time complexity is O(NlogN) and worst case is also O(n log n). But best takes half as many as the best case

  def main(args: Array[String]): Unit = {
    var initailarray = Array(3, 2, 37,460,46,6, 31, 1,5, 2,10, 4)
    var a = 0
    mergeSort(initailarray).foreach(println)
  }

  def mergeSort(unsort: Array[Int]): Array[Int] = {
    var temp = 0
    if (unsort.length < 2) {
      unsort
    }
    else {
      temp = unsort.length / 2

      merge(mergeSort(unsort.take(temp)), mergeSort(unsort.takeRight(unsort.length - temp)))

    }
  }

  def merge(left: Array[Int], right: Array[Int]): Array[Int] = {
    if (right.length == 0) {
      left
    }
    else if (left.length == 0){
      right
    }
    else if (left(0) < right(0))
        {
          Array.concat(left.take(1),merge(left.takeRight(left.length-1),right))
        }
    else
      {
        Array.concat(right.take(1),merge(left,right.takeRight(right.length-1)))
      }
  }
}
