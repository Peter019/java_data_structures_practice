import java.io.FileNotFoundException;

//Interface implemented by all versions

public interface Directory {



    public void load() throws EmptyArrayException, NumberFormatException, FileNotFoundException;
    public void delete() throws EmptyArrayException, NumberFormatException, FileNotFoundException;
    public String lookup() throws EmptyArrayException, NumberFormatException, FileNotFoundException;
    public void change() throws EmptyArrayException, NumberFormatException, FileNotFoundException;
    public void printTable();

}
