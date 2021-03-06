import org.scalatest.{Matchers, WordSpec}


class BillGeneratorSpec extends WordSpec with Matchers {

  /*
  1.    Pass in a list of purchased items that produces a total bill
  2.    When all purchased items are drinks no service charge is applied
  3.    When purchased items include any food apply a service charge of 10% to the total bill (rounded to 2 decimal places)
*/
  "Bill generator" should {
    "have a drink cost of 0.5" in {
      BillGenerator.bill(List("Cola")) shouldBe 0.5
    }

//    "have two drinks cost 1.5" in {
//      BillGenerator.bill(List("Cola", "Coffee")) shouldBe 1.5
//    }
//
//    "have ten per cent service charge when there is a food item" in {
//      BillGenerator.bill(List("Cheese Sandwich", "Cola")) shouldBe 3.75
//    }
  }

  //  test("all drinks no service charge") {
  //    val test = ???
  //  }
}