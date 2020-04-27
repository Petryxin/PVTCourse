package by.home.homework14;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadanie33 {
    public static void main(String[] args) {
        String pathDirectory = ".\\src";

        List<String> directory = listOfDirectory(pathDirectory);      //Second variants
        System.out.println("\nDirectories:");
        directory.forEach(System.out::println);

        List<String> file = listOfFile(pathDirectory);
        System.out.println("\nFiles:");
        file.forEach(System.out::println);

    }

    private static List<String> listOfFile (String path){
        List<String> result = null;
        try(Stream<Path> walk = Files.walk(Paths.get(path))){
            result = walk.filter(Files::isRegularFile)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        }catch (IOException e){
            System.out.println("problem" + e.getMessage());
        }
        return result;
    }

    private static List<String> listOfDirectory (String path) {
        List<String> result = null;
        try (Stream<Path> walk1 = Files.walk(Paths.get(path))) {
            result = walk1.filter(Files::isDirectory)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
        return result;
    }

}

        /*                                                                 //First variant (60 баллов)
        File directoryDesktop = new File("C:\\Users\\Артем\\Desktop");
        getFile(directoryDesktop);
        getFolder(directoryDesktop);
    }

    private static void getFolder (File file){
        if(file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("folder" + " - " + item.getName());
                }
            }
        }else {
            System.out.println("Not catalog");
        }
    }

    private static void getFile (File file) {
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isFile()) {
                    System.out.println("file" + " - " + item.getName());
                }
            }
        } else {
            System.out.println("Not catalog");
        }
    }*/

