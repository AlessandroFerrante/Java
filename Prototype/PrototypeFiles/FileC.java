// SubclassProtype

public class FileC extends Files{

    public FileC(String filename, String data, String metadata ){
        super(filename, data, metadata);
    }

    public FileC(Files fileC){
        super(fileC);
    }

    @Override
    public FileC clone() {
        return new FileC(this);
    }
}
