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
    }
}
