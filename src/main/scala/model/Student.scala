package model

case class StudentData(id: String, name: String){
  override def toString: String =s"(id ->$id , name ->$name)\n"
}
