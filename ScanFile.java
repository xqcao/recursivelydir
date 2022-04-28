
package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ScanFile{
  public static List<String> names;
  public static void main(String[] args){
    String filePath ="ff";
    File file = new File(filePath);
    // File[] fls = file.listFiles();
    // for(File f : fls){
    //   System.out.println(f.getName());
    // }
    names=new ArrayList<String>();
    getAllFiles(file);
    System.out.println("----------------");
    names.forEach(System.out::println);

  }
  public static void getAllFiles(File rootFile){
    File[] files = rootFile.listFiles();
    for(File fl : files){
      if(fl.isFile()){
        names.add(fl.getName());
        System.out.println(fl.getName().toUpperCase());
      }else{
        getAllFiles(fl);
      }
    }

  }
}


// create a file crawler to scan recursively the given folder and list all files in subfolders.