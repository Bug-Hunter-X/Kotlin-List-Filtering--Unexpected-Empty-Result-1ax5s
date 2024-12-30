fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    //Check if the list is empty before processing
    if (evenNumbers.isNotEmpty()) {
        println(evenNumbers.joinToString())
    } else {
        println("No even numbers found in the list.")
    }
}