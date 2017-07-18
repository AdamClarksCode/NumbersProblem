/**
  * Created by Administrator on 18/07/2017.
  */
object Main extends App {
  runMainMethod

  def runMainMethod = {
    val userInput = "1234567898765432010456"
    println(userInput)
    val length = userInput.length
    length match {
      case _ if length < 4 => {
        println("Short scale" +
          ": " + userInput + ".")
        println("Long scale: " + userInput + ".")
      }
      case _ if length > 3 && length < 7 => {
        println("Short scale: " + getThousands(userInput.substring(0, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getThousands(userInput.substring(0, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 6 && length < 10 => {
        println("Short scale: " + getMillions(userInput.substring(0, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getMillions(userInput.substring(0, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 9 && length < 13 => {
        println("Short scale: " + getBillions(userInput.substring(0, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getMilliard(userInput.substring(0, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 12 && length < 16 => {
        println("Short scale: " + getTrillion(userInput.substring(0, length - 12)) + getBillions(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getBillions(userInput.substring(0, length - 12)) + getMilliard(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 15 && length < 19 => {
        println("Short scale: " + getQuadrillion(userInput.substring(0, length - 15)) + getTrillion(userInput.substring(length - 15, length - 12)) + getBillions(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getBilliard(userInput.substring(0, length - 15)) + getBillions(userInput.substring(length - 15, length - 12)) + getMilliard(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 18 && length < 22 => {
        println("Short scale: " + getQuintillion(userInput.substring(0, length - 18))+ getQuadrillion(userInput.substring(length - 18, length - 15)) + getTrillion(userInput.substring(length - 15, length - 12)) + getBillions(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getTrillion(userInput.substring(0, length - 18)) + getBilliard(userInput.substring(length - 18, length - 15)) + getBillions(userInput.substring(length - 15, length - 12)) + getMilliard(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 21 && length < 25 => {
        println("Short scale: " + getSextillion(userInput.substring(0, length - 21)) + getQuintillion(userInput.substring(length - 21, length - 18))+ getQuadrillion(userInput.substring(length - 18, length - 15)) + getTrillion(userInput.substring(length - 15, length - 12)) + getBillions(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
        println("Long scale: " + getTrilliard(userInput.substring(0, length - 21)) + getTrillion(userInput.substring(length - 21, length - 18)) + getBilliard(userInput.substring(length - 18, length - 15)) + getBillions(userInput.substring(length - 15, length - 12)) + getMilliard(userInput.substring(length - 12, length - 9)) + getMillions(userInput.substring(length - 9, length - 6)) + getThousands(userInput.substring(length - 6, length - 3)) + getHundreds(userInput.substring(length - 3)))
      }
      case _ if length > 24 => {
        println("Your number is too big!")
      }
      case _ => {
        println("Your number is too big!")
      }
    }
  }

  def getHundreds(input: String): String = {
    if(cleanString(input).length() == 0) {
      val toReturn = "."
      toReturn
    }
    else {
      val toReturn = "and " + cleanString(input) + "."
      toReturn
    }
  }

  def getThousands(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " thousand "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }

  def getMillions(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " million, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }

  def getBillions(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " billion, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }

  def getMilliard(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " milliard, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }

  def getTrillion(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " trillion, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }
  def getQuadrillion(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " quadrillion, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }
  def getBilliard(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " billiard, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }
  def getQuintillion(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " quintillion, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }
  def getSextillion(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " sextillion, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }
  def getTrilliard(input: String): String = {
    if(cleanString(input).length() != 0) {
      val toReturn = cleanString(input) + " Trilliard, "
      toReturn
    } else {
      val toReturn = ""
      toReturn
    }
  }

  def cleanString(input: String): String = {
    if(input.charAt(0) == '0') {
      if(input.charAt(1) == '0') {
        if(input.charAt(2) == '0') {
          val toReturn = ""
          toReturn
        } else {
          val toReturn = input.charAt(2)
          toReturn.toString()
        }
      } else {
        val toReturn = input.substring(1, 3)
        toReturn
      }
    } else input
  }
}



