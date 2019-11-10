package searching.binarySearchTree
// The idea of binary search is to use the information that the array is
// sorted and reduce the time complexity to O(Log n).
object binarySearchSortedLoop {
  def main(args: Array[String]): Unit = {
    var initailarray = Array(1, 2, 3, 4, 5,6,7,7,8)
    var number = 7
    var maxlen = initailarray.length-1
    var result = binarySearchRes(initailarray,0, maxlen,number)

    if (result == -1) {
      println("element doesn't exist")
    }
    else {
      println("Index of the " + number + " = " + result)
    }
  }

  def binarySearchRes(array: Array[Int], minlen :Int ,maxlen: Int, number: Int): Int = {
          var min= minlen
          var max= maxlen

          while (min!= max) {
            var mid = min+(max-min)/2
            if (array(mid) == number) {
              return mid
            }
            else if (array(mid) >number){
              max= mid-1
            }
            else{
               min=mid+1
            }
          }
  return -1
  }
}
