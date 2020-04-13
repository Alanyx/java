package topic.shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Alan Yin
 * @date 2020/4/10
 */

public class ShellDemo3 {


    public static void main(String[] args) {

    }

    private void callScript(String script, String args, String... workspace) {
        String RUNNING_SHELL_FILE = "";
        String keyword = "";
        String taskId = "";
        String fileName = "";
        String CASPERJS_FILE_DIR = "";
        ProcessBuilder builder = new ProcessBuilder("./" + RUNNING_SHELL_FILE, keyword.trim(), taskId.toString(), fileName);
        builder.directory(new File(CASPERJS_FILE_DIR));
        int runStatus = 0;
        String line = null;
        try {
            Process process = builder.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = input.readLine()) != null) {
                System.out.println("line is : {}" + line);
            }
            while ((line = error.readLine()) != null) {
                System.out.println("line is : {}" + line);
            }
            input.close();
            error.close();
            try {
                runStatus = process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
