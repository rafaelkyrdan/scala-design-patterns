package swiss_army_knife

/**
  * User companion object.
  * It has actions related to CRUD about `user` entity
  * and it uses implicit parameters.
  *
  */


object User {
  def createNewUser(name: String, age: Int, sex: Boolean)(implicit messages: MyProgramUserMessages) {

    // operation to DB layer or other
    // Db.exec("INSERT INTO ...")

    Screen.inform(messages.userCreated(name))
  }

  def deleteAccount(account: String)(implicit messages: MyProgramAccountMessages with Dates) {

    // Db.exec("DELETE ...")
    Screen.inform(messages.accountDeleted)
  }
}
