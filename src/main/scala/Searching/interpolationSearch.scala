package searching
//Linear Search finds the element in O(n) time,
// Jump Search takes O(√ n) time and Binary Search take O(Log n) time.
// Time Complexity: If elements are uniformly distributed, then O (log log n)).
// In worst case it can take upto O(n)
//https://www.geeksforgeeks.org/interpolation-search/
object interpolationSearch {
  def main(args: Array[String]): Unit = {
    var initailarray = Array(1, 2, 3, 4, 5, 6, 7, 7, 8)
    var number = 5
    var arraylen = initailarray.length
    var result = interpolationSearchAlg(initailarray, arraylen, number)

    if (result == -1) {
      println("element doesn't exist")
    }
    else {
      println("Index of the " + number + " = " + result)
    }
  }

  def interpolationSearchAlg(array: Array[Int], arraylen: Int, number: Int): Int = {
    var low = 0





    var high= arraylen-1
    //if high greater than low and number is between the limits of the array number
    // assuming the array is ordered
    while(low <= high && number > array(low) && number < array(high)) {
      //check if low is equal to high and is equal to number
      if (low == high) {
        if (array(low) == number) {
          return low
        }
        else {
          return -1
        }
      }
      //else check the position with formulae and run the position.
      val position = low + ((high - low) / (array(high) - array(low)) * (number - array(low)))
      if (array(position) == number) {
        return position
      }
      else if (array(position) < number) {
         low = position + 1
      }
      else {
        high = position - 1
      }
    }
    return -1
  }
}