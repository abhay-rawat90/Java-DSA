package com.abhay;

import java.io.*;

public class FileH {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in))
//        {
//            System.out.println("Enter some Letters");
//            int letters = isr.read();
//            while(isr.ready())
//            {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//
//            isr.close();
//            System.out.println();
//
//        } catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr = new FileReader("note.txt"))
//        {
//            int letters = fr.read();
//            while(fr.ready())
//            {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//
//            fr.close();
//            System.out.println();
//
//        } catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
//        { // byte to char stream and then reading char stream
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //output
//        OutputStream os = System.out;
////        os.write(😋); range is exceeded
//        System.out.println();

//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out))
//        {
//            osw.write("hello world");
//            osw.write(97);
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
////            os.write(😋);
//
//        }
//        catch(IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

        try(FileWriter FW = new FileWriter("note.txt"))
        {
            FW.write("hello world");
//            FW.write(97);
//            FW.write('A');
//            FW.write('\n');
//            char[] arr = "hello world".toCharArray();
//            FW.write(arr);
//            os.write(😋);

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
