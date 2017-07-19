import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("Test Hundreds Normal"){
    assert(Main.getHundreds("123") == "and 123.")
  }
  test("Test Hundreds 0XX"){
    assert(Main.getHundreds("023") == "and 23.")
  }
  test("Test Hundreds 00X"){
    assert(Main.getHundreds("003") == "and 3.")
  }
  test("Test Hundreds X0X"){
    assert(Main.getHundreds("103") == "and 103.")
  }
  test("Test Hundreds 0X"){
    assert(Main.getHundreds("03") == "and 3.")
  }
  test("Test Hundreds X"){
    assert(Main.getHundreds("3") == "and 3.")
  }
  test("Test Hundreds 0"){
    assert(Main.getHundreds("0") == ".")
  }
  test("Test Thousands Normal"){
    assert(Main.getThousands("123") == "123 thousand ")
  }
  test("Test Thousands 0XX"){
    assert(Main.getThousands("023") == "23 thousand ")
  }
  test("Test Thousands 00X"){
    assert(Main.getThousands("003") == "3 thousand ")
  }
  test("Test Thousands X0X"){
    assert(Main.getThousands("103") == "103 thousand ")
  }
  test("Test Thousands 0X"){
    assert(Main.getThousands("03") == "3 thousand ")
  }
  test("Test Thousands X"){
    assert(Main.getThousands("3") == "3 thousand ")
  }
  test("Test Thousands 0"){
    assert(Main.getThousands("0") == "")
  }
  test("Test Millions Normal"){
    assert(Main.getMillions("123") == "123 million, ")
  }
  test("Test Millions 0XX"){
    assert(Main.getMillions("023") == "23 million, ")
  }
  test("Test Millions 00X"){
    assert(Main.getMillions("003") == "3 million, ")
  }
  test("Test Millions X0X"){
    assert(Main.getMillions("103") == "103 million, ")
  }
  test("Test Millions 0X"){
    assert(Main.getMillions("03") == "3 million, ")
  }
  test("Test Millions X"){
    assert(Main.getMillions("3") == "3 million, ")
  }
  test("Test Millions 0"){
    assert(Main.getMillions("0") == "")
  }
  test("Test billion Normal"){
    assert(Main.getBillions("123") == "123 billion, ")
  }
  test("Test billion 0XX"){
    assert(Main.getBillions("023") == "23 billion, ")
  }
  test("Test billion 00X"){
    assert(Main.getBillions("003") == "3 billion, ")
  }
  test("Test billion X0X"){
    assert(Main.getBillions("103") == "103 billion, ")
  }
  test("Test billion 0X"){
    assert(Main.getBillions("03") == "3 billion, ")
  }
  test("Test billion X"){
    assert(Main.getBillions("3") == "3 billion, ")
  }
  test("Test billion 0"){
    assert(Main.getBillions("0") == "")
  }
  test("Test milliard Normal"){
    assert(Main.getMilliard("123") == "123 milliard, ")
  }
  test("Test milliard 0XX"){
    assert(Main.getMilliard("023") == "23 milliard, ")
  }
  test("Test milliard 00X"){
    assert(Main.getMilliard("003") == "3 milliard, ")
  }
  test("Test milliard X0X"){
    assert(Main.getMilliard("103") == "103 milliard, ")
  }
  test("Test milliard 0X"){
    assert(Main.getMilliard("03") == "3 milliard, ")
  }
  test("Test milliard X"){
    assert(Main.getMilliard("3") == "3 milliard, ")
  }
  test("Test milliard 0"){
    assert(Main.getMilliard("0") == "")
  }
  test("Test trillion Normal"){
    assert(Main.getTrillion("123") == "123 trillion, ")
  }
  test("Test trillion 0XX"){
    assert(Main.getTrillion("023") == "23 trillion, ")
  }
  test("Test trillion 00X"){
    assert(Main.getTrillion("003") == "3 trillion, ")
  }
  test("Test trillion X0X"){
    assert(Main.getTrillion("103") == "103 trillion, ")
  }
  test("Test trillion 0X"){
    assert(Main.getTrillion("03") == "3 trillion, ")
  }
  test("Test trillion X"){
    assert(Main.getTrillion("3") == "3 trillion, ")
  }
  test("Test trillion 0"){
    assert(Main.getTrillion("0") == "")
  }
  test("Test quadrillion Normal"){
    assert(Main.getQuadrillion("123") == "123 quadrillion, ")
  }
  test("Test quadrillion 0XX"){
    assert(Main.getQuadrillion("023") == "23 quadrillion, ")
  }
  test("Test quadrillion 00X"){
    assert(Main.getQuadrillion("003") == "3 quadrillion, ")
  }
  test("Test quadrillion X0X"){
    assert(Main.getQuadrillion("103") == "103 quadrillion, ")
  }
  test("Test quadrillion 0X"){
    assert(Main.getQuadrillion("03") == "3 quadrillion, ")
  }
  test("Test quadrillion X"){
    assert(Main.getQuadrillion("3") == "3 quadrillion, ")
  }
  test("Test quadrillion 0"){
    assert(Main.getQuadrillion("0") == "")
  }
  test("Test billiard Normal"){
    assert(Main.getBilliard("123") == "123 billiard, ")
  }
  test("Test billiard 0XX"){
    assert(Main.getBilliard("023") == "23 billiard, ")
  }
  test("Test billiard 00X"){
    assert(Main.getBilliard("003") == "3 billiard, ")
  }
  test("Test billiard X0X"){
    assert(Main.getBilliard("103") == "103 billiard, ")
  }
  test("Test billiard 0X"){
    assert(Main.getBilliard("03") == "3 billiard, ")
  }
  test("Test billiard X"){
    assert(Main.getBilliard("3") == "3 billiard, ")
  }
  test("Test billiard 0"){
    assert(Main.getBilliard("0") == "")
  }
  test("Test quintillion Normal"){
    assert(Main.getQuintillion("123") == "123 quintillion, ")
  }
  test("Test quintillion 0XX"){
    assert(Main.getQuintillion("023") == "23 quintillion, ")
  }
  test("Test quintillion 00X"){
    assert(Main.getQuintillion("003") == "3 quintillion, ")
  }
  test("Test quintillion X0X"){
    assert(Main.getQuintillion("103") == "103 quintillion, ")
  }
  test("Test quintillion 0X"){
    assert(Main.getQuintillion("03") == "3 quintillion, ")
  }
  test("Test quintillion X"){
    assert(Main.getQuintillion("3") == "3 quintillion, ")
  }
  test("Test quintillion 0"){
    assert(Main.getSextillion("0") == "")
  }
  test("Test sextillion Normal"){
    assert(Main.getSextillion("123") == "123 sextillion, ")
  }
  test("Test sextillion 0XX"){
    assert(Main.getSextillion("023") == "23 sextillion, ")
  }
  test("Test sextillion 00X"){
    assert(Main.getSextillion("003") == "3 sextillion, ")
  }
  test("Test sextillion X0X"){
    assert(Main.getSextillion("103") == "103 sextillion, ")
  }
  test("Test sextillion 0X"){
    assert(Main.getSextillion("03") == "3 sextillion, ")
  }
  test("Test sextillion X"){
    assert(Main.getSextillion("3") == "3 sextillion, ")
  }
  test("Test sextillion 0"){
    assert(Main.getSextillion("0") == "")
  }
  test("Test trilliard Normal"){
    assert(Main.getTrilliard("123") == "123 Trilliard, ")
  }
  test("Test trilliard 0XX"){
    assert(Main.getTrilliard("023") == "23 Trilliard, ")
  }
  test("Test trilliard 00X"){
    assert(Main.getTrilliard("003") == "3 Trilliard, ")
  }
  test("Test trilliard X0X"){
    assert(Main.getTrilliard("103") == "103 Trilliard, ")
  }
  test("Test trilliard 0X"){
    assert(Main.getTrilliard("03") == "3 Trilliard, ")
  }
  test("Test trilliard X"){
    assert(Main.getTrilliard("3") == "3 Trilliard, ")
  }
  test("Test trilliard 0"){
    assert(Main.getTrilliard("0") == "")
  }
  test("Test Clean String Normal"){
    assert(Main.cleanString("123") == "123")
  }
  test("Test Clean String 0XX"){
    assert(Main.cleanString("023") == "23")
  }
  test("Test Clean String 00X"){
    assert(Main.cleanString("003") == "3")
  }
  test("Test Clean String X0X"){
    assert(Main.cleanString("103") == "103")
  }
  test("Test Clean String 0X"){
    assert(Main.cleanString("03") == "3")
  }
  test("Test Clean String X"){
    assert(Main.cleanString("3") == "3")
  }
  test("Test Clean String 0"){
    assert(Main.cleanString("0") == "0")
  }
}