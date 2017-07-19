runMainMethod

def runMainMethod = {
  val userInput = "4321"
  println(userInput)
  val length = userInput.length
  length match {
    case _ if length < 4 => {
      println("Short scale: " + userInput + ".")
      println("Long scale: " + userInput + ".")
    }
    case _ if length > 3 && length < 7 => {
      println("Short scale: " + getThousands(userInput.substring(0, length - 4)) + getHundreds(userInput.substring(length - 4)))
      println("Long scale: " + getThousands(userInput.substring(0, length - 4)) + getHundreds(userInput.substring(length - 4)))
    }
    case _ if length > 6 && length < 9 => {
      println("Short scale: " + getMillions(userInput.substring(0, length - 7)) + getThousands(userInput.substring(length - 7, length - 4)) + getHundreds(userInput.substring(length - 4)))
      println("Long scale: " + getMillions(userInput.substring(0, length - 7)) + getThousands(userInput.substring(length - 7, length - 4)) + getHundreds(userInput.substring(length - 4)))
    }
    case _ if length > 8 && length < 12 => {
      //billion, million, thousands, hundreds
    }
    case _ if length > 11 && length < 15 => {
      //trillion, billion, million, thousands, hundreds
    }
    case _ if length > 14 && length < 18 => {
      //quadrillion, trillion, billion, million, thousands, hundreds
    }
    case _ if length > 14 && length < 18 => {
      //quintillion, quadrillion, trillion, billion, million, thousands, hundreds
    }
    case _ if length > 17 && length < 18 => {
      //quintillion, quadrillion, trillion, billion, million, thousands, hundreds
    }
    case _ if length > 17 && length < 18 => {
      //sextillion, quintillion, quadrillion, trillion, billion, million, thousands, hundreds
    }
    case _ => {
      println("Your number is too big!")
    }
  }
}

def getHundreds(input: String): String = {
  val toReturn = " and " + input + "."
  toReturn
}
def getThousands(input: String): String = {
  val toReturn = input + " thousand "
  toReturn
}
def getMillions(input: String): String = {
  val toReturn = input + " million, "
  toReturn
}