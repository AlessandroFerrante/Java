// SubclassProtype

public class FileJava extends Files{

    public FileJava(String filename, String data, String metadata ){
        super(filename, data, metadata);
    }

    public FileJava(Files fileJava){
        super(fileJava);
    }
    
    @Override
    public FileJava clone(){
        return new FileJava(this);
    }
}
