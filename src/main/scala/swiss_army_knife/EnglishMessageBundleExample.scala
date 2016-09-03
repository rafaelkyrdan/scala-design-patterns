package swiss_army_knife

/**
  *
  *
  */


class EnglishMessageBundleExample extends Counting with Dates with MyProgramAccountMessages with MyProgramUserMessages {

  def cardinalNumber(n: Int) = n match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "lots"
  }

  def accountCreated = "A new account has been added to the database."

  def userDeleted(n: String) = s"User $n has been deleted."

  def accountDeleted: String = "A new account has been deleted from the database."

  def userCreated(name: String): String = s"User $name has been created."

  // and the rest...
  override def ordinalNumber(n: Int): String = ???

  override def monthName(n: _root_.swiss_army_knife.Month.Value): String = ???

  override def shortDate(n: String): Unit = ???

  override def longDate(n: String): Unit = ???

}

