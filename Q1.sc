def calculateInterest(depositAmount: Double): Double = {
  val interest: Double = depositAmount match {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case _ => depositAmount * 0.065
  }
  interest
}


val deposit: Double = 50000
val interestEarned: Double = calculateInterest(deposit)
println(s"The interest earned for a deposit of $deposit is $interestEarned")
