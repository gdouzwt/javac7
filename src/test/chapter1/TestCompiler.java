package test.chapter1;

import javax.tools.ToolProvider;

public class TestCompiler {

    public static void main(String[] args) {
        String path = "C:\\Users\\tao\\eclipse-workspace\\javac7\\src\\test\\chapter1\\TestJavac.java";
        javax.tools.JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        int result = compiler.run(null, null, null,
                new String[] {
                        "-d", "C:\\Users\\tao\\eclipse-workspace\\javac7\\out",
                        path
                }
        );

        System.out.println("Result code: " + result);
    }
}
