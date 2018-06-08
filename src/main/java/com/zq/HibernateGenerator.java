package com.zq;

import java.io.*;

public class HibernateGenerator {

    public static void main(String[] args) throws IOException {

        String targetClassName = "GeneratorBean";
        String targetPath = "E:\\intellij_workspace\\spring-hibernate-sample\\src\\main\\java\\com\\zq\\repository\\impl\\%sRepositoryImpl.java";
        String charSet = "UTF-8";

        File sourcefile = new File("E:\\intellij_workspace\\spring-hibernate-sample\\src\\main\\java\\com\\zq\\repository\\impl\\ImageRepositoryImpl.java");
        FileInputStream fileInputStream = new FileInputStream(sourcefile);
        byte[] bytes = new byte[(int)sourcefile.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        String content = new String(bytes, charSet);
        String targetContent = content.replaceAll("Image", targetClassName);
        File targetFile = new File(String.format(targetPath, targetClassName));
        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
        fileOutputStream.write(targetContent.getBytes(charSet));
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("process exit with 0");
    }
}
