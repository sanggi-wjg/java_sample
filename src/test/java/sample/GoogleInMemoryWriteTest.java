package sample;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;
import org.junit.jupiter.api.Test;

import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.junit.jupiter.api.Assertions.*;

class GoogleInMemoryWriteTest {

    /*
    * https://github.com/google/jimfs
    * */

    private final FileSystem fileSystem = Jimfs.newFileSystem(Configuration.unix());

    @Test
    public void test() throws Exception {
        Path directory = fileSystem.getPath("/directory");
        Path file = directory.resolve(fileSystem.getPath("text.txt"));

        Files.createDirectories(directory);
        Files.createFile(file);
        Files.writeString(file, "Sample", StandardOpenOption.WRITE);
    }

}