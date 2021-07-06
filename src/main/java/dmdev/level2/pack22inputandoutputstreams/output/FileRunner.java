package dmdev.level2.pack22inputandoutputstreams.output;

import java.io.File;
import java.io.IOException;

/**
 *
 *              output stream
 * application ---------------> file
 *
 *               input stream
 * application <-------------- file
 *
 *
 */

public class FileRunner {
	
	public static void main(String[] args) throws IOException {
		File file = new File("resources/test22DMDev.txt");
		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
//		System.out.println(file.delete());
//
		File dir = new File("/resources/test/dir");
//		dir.mkdirs();
		System.out.println(dir.getAbsolutePath());
		System.out.println(dir.exists());
	}
}
