package Lab2b;

public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for(int i = 0; i < chapters.length; i++) {
            chapters[i] = "n/a";
        }
    }

    public Book(String argument[]) {
        chapters = new String[argument.length];
        for (int i = 0; i < argument.length; i++) {
            chapters[i] = argument[i];
        }
    }

    public String getChapter(int i) {
        //if i out of bound, return a message
        if (i < 0 || i >= chapters.length) {
            return "i is wrong";
        }
        return chapters[i];
    }

    public String[] getChapters() {
        return chapters;
    }
}
