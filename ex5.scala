object ex5 {
  def main(args: Array[String]): Unit = {
    printSigns(2.5, -7.8, 0.0, 9.3, -1.1, 18)
  }

  def Signe(numbers: Double*): Unit = {
    for(num <-numbers) { 
		if (num > 0) {
			println("positif") 
		}
		else if (num < 0) {
		println("négatif") 
		}
		else {
			println("nul");
		}
    }
  }
}
