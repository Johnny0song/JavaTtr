package org.example.reflection;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileClassLoader extends ClassLoader{
    private String rootDir;
    public FileClassLoader(String rootDir){
        this.rootDir = rootDir;
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = findClass(name);
        if(c == null){
            ClassLoader parent = this.getParent();
            c = parent.loadClass(name);
        }

        if(c == null){
            byte[] classData = getClassData(name);
            if(classData == null) {
                throw new ClassNotFoundException();
            }else {
                c = defineClass(name, classData, 0, classData.length);
            }
        }

        return c;
    }

    private byte[] getClassData(String name){
        String path = rootDir + File.separator + name.replace(".", File.separator) + ".class";
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(path);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }

            return baos.toByteArray();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(is != null){
                    is.close();
                }
                if(baos != null){
                    baos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}




















