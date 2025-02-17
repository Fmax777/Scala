object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 3).map(_.toUpperCase)
  } //Убрана изменяемая переменная, заменен цикл for на filter по длине более 3-х символов и перевод в верхний регистр toUpperCase.

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}