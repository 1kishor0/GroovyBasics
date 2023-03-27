class ReadWriteFiles {
    static void main(String[] args) {
        //Read Files
        //give your file location here
        String filePath="/home/kishor/IdeaProjects/GroovyBasics/src/data1.txt"
        File myFile=new File(filePath)
        //Reading entire content as string
        println myFile.text

        //collect lines into a list
        def list=myFile.collect{it}
        println("List : $list")

        //store file content in an array
        def array=myFile as String[]
        println "Array : $array"

        //Read file into list of string
        def lines=myFile.readLines()
        println "Lines : $lines"
        //read File Line by Line
        def lineNoRange=2..4
        def lineList=[]
        myFile.eachLine {line ,lineNo->
            if(lineNoRange.contains(lineNo)){
                lineList.add(line)
            }
            println("lineList : $lineList")
        }

        def line//read with reader
        myFile.withReader {reader->
            while((line=reader.readLine())!=null){
                println "lines: $line"
            }
            }
        //Reading with new reader
        def outPutFile="data2.txt"
        def reader=myFile.newReader()
        new File(outPutFile).append(reader)
        reader.close()

        //working with binary files, read contents as bytes
        byte [] contents=myFile.bytes

        println(contents)
        //size in bytes
        println(myFile.length())

        //check it is a file or dir
        println(myFile.isFile())
        println(myFile.isDirectory())

        //get list of files from directory
        new File("/home/kishor/IdeaProjects").eachFile {files-> println(files.getAbsolutePath())}
        //recursively display all files in a directory & its subdirectory
        new File ("/home/kishor/IdeaProjects").eachFileRecurse {file-> println file.getAbsolutePath()}

        //copy file data to another file
        def newFile=new File("data3.txt")
        newFile << myFile.text
        //delete new file
        newFile.delete()

    //Write Files
        File myFile2 =new File("data4.txt")
        myFile2.write("This is Line 1 ")
        myFile2<<"\nThis is line 2"
        //.text function over write
        println(myFile2.text)
        myFile2.text="\nThis is line 3"
        println(myFile2.text)
        //over write again
        myFile2.withWriter {writer-> writer.writeLine("\4This is line 4")}
        myFile2.append("\nThis is line 5")
        println(myFile2.length())
        println(myFile2.isFile())
        println(myFile2.isDirectory())
        println(myFile2.isHidden())
        //push or copy
        def newFile2=new File ("data5.txt")
        newFile2<<myFile2.text
        //empty my file
        myFile2.bytes=[]
        //rename
        myFile2.renameTo(new File("newFile3.txt"))
        //println myFile2.delete()
    }
}
