package Tools

import java.io.File

object Tools {

  //删除目录和文件
  def dirDel(path: File) {
    if (!path.exists())
      return
    else if (path.isFile) {
      path.delete()
      println(path + ":  文件被删除")
      return
    }

    val file: Array[File] = path.listFiles()
    for (d <- file) {
      dirDel(d)
    }

    path.delete()
    println(path + ":  目录被删除")

  }
}
