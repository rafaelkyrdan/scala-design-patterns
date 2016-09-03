package swiss_army_knife

/**
  * Trait for messages like this:
  * case 1 => "one"
  * case 2 => "two"
  * case 3 => "three"
  * case _ => "lots"
  *
  * implemented like a trait because we want add localisation
  *
  */

trait Counting {
  def cardinalNumber(n: Int): String

  def ordinalNumber(n: Int): String
}
