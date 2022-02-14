package Z3;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Objects;

public class print {

    public static void wypiszPodkatalogi(String path){
        File dir = new File(path);

        //1 sposob
        Arrays.stream(Objects.requireNonNull(dir.listFiles(x -> x.isDirectory()))).forEach(x -> System.out.println(x));

        //2 sposob
        FileFilter filer = new FileFilter(){
            @Override
            public boolean accept(File dir){
                if(dir.isDirectory()){
                    return true;
                }
                return false;
            }
        };

        Arrays.stream(Objects.requireNonNull(dir.listFiles(filer))).forEach(x -> System.out.println(x));
    }


    public static void main(String[] args) {

        wypiszPodkatalogi("C:\\Users\\Artur\\Desktop\\Studia\\Programowanie Obiektowe\\162640-E02");
    }
}
