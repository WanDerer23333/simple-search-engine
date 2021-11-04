import bean.DocumentContent;
import org.junit.Test;
import utils.FileUtils;

import java.io.*;
import java.nio.file.Files;

public class TestFile {
    @Test
    public void clearIndex() {
        File indexDir = new File(FileUtils.getProjectPath() + "\\index");
        String[] children = indexDir.list();
        for (int i = 0; i < children.length; i++) {
            new File(indexDir, children[i]).delete();
        }
    }

    @Test
    public void getFileInfo() throws IOException {
        File Dir = new File(FileUtils.getProjectPath() + "\\tdt3");
        File childDir = Dir.listFiles()[0];
        File file = childDir.listFiles()[0];

        String fileName = file.getName();
        System.out.println(fileName);

        String filePath = file.getPath();
        System.out.println(filePath);

        long fileSize = FileUtils.getFileSize(file);
        System.out.println(fileSize);

        String fileContent = FileUtils.getFileContent(file);
        System.out.println(new DocumentContent(fileContent));

    }

}
