package crux;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Main class for the crux compiler.
 */
public class Compiler {
    /* Author details. */
    public static String studentName = "Erik Westrup";
    public static String studentID = "50471668";
    public static String uciNetID = "ewestrup";


	/**
	 * Compile the file give.
	 * @param cruxFile The file to compile.
	 */
	public void compile(String cruxFile) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader(cruxFile));
        } catch (IOException e) {
            //e.printStackTrace();
            System.err.println("Error accessing the source file: \"" + cruxFile + "\".");
			System.exit(-2);
        }

		Token token;
		do {
			token = scanner.next();
			System.out.println(token);
		} while (!token.isKind(Token.Kind.EOF));
        //Token token = null;
        //Iterator<Token> iterator = scanner.iterator();
        //for (; iterator.hasNext(); ) {
            //token = iterator.next();
            //System.out.println(token);
        //}
        //token = iterator.next();
        //System.out.println(token);
	}

	/**
	 * Main method that starts the compilation.
	 *
	 */
	public static void main(String[] args) {
        if (args.length != 1) {
			System.err.println("One argument expected. Usage:\n $ crxc <source_file>");
        }
        String sourceFile = args[0];
        new Compiler().compile(sourceFile);
    }
}
