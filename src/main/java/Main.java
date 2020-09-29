
public class Main {

    public static void main(String[] args) {

        //read contents of text file and assign to fileContents
        String fileContents = ReadFileContents.getFileContents("ShortStory.txt");
        //split sentences to separate lines
        String contents = SentenceManipulator.splitFileIntoSentencePerLine(fileContents);
        //sort sentences
        String sortedContents = SentenceManipulator.sortSentenceAlphabeticalOrder(contents);

        System.out.println(sortedContents);



    }
}
