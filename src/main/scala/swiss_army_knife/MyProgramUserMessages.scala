package swiss_army_knife

/**
  * Messages related to user's actions
  * Could be localised
  *
  */

trait MyProgramUserMessages {
  def userCreated(name: String): String

  def userDeleted(name: String): String

}
