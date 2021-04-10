package com.class27;

public abstract class File {

    /*HomeWork Abstraction: Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */

    public void edit(){
        System.out.println("Editing the file");
    }
    public void close(){
        System.out.println("file is closed");
    }
    abstract void open();

}

class JavaFile extends File{

    @Override
    void open() {
        System.out.println("Special class to open Java Files");
    }
}

class WordFile extends File{
    @Override
    void open(){
        System.out.println("Opening the WordFile");
    }
}

class PDFFile extends File{

    @Override
    void open() {
        System.out.println("Opening the PDFFile");
    }
}