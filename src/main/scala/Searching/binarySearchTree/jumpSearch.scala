package searching.binarySearchTree

object jumpSearch {
  def main(args: Array[String]): Unit = {
    var initailarray = Array(1, 2, 3, 4, 5, 6, 7)
    var number =7
    var arraylen = initailarray.length
    var result = jumpSearchAlg(initailarray, arraylen, number)

    if (result == -1) {
      println("element doesn't exist")
    }
    else {
      println("Index of the " + number + " = " + result)
    }
  }

  def jumpSearchAlg(array: Array[Int], arraylen: Int, number: Int): Int = {
    var jumping = math.sqrt(arraylen).toInt
    var index = -1
    //    finding the block where the number is present
    for (i <- 0 to arraylen - 1 by jumping) {

      if (array(i) > number) {
        index = i
      }
      print(i)
    }
    if (index == -1){
      return index
    }

    var lower = ((index / jumping) - 1) * jumping


    for (i <- lower to index) {
      if (array(i) == number) {
        return i
      }
    }
    return -1

  }
}