package swiss_army_knife

/**
  * Trait for string re-presentation of dates in different languages
  *
  */

trait Dates {

  def monthName(n: Month.Value): String

  def longDate(n: String)

  def shortDate(n: String)
}