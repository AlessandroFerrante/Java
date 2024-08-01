// ConcretePrototype

public abstract class Files implements File {
    private final String filename;
    private final String data;
    private final String metadata;
        
    public String getFilename() {
        return filename;
    }

    public String getData() {
        return data;
    }

    public String getMetadata() {
        return metadata;
    }

    public Files (String filename, String data, String metadata ){
        this.filename = filename;
        this.data = data;
        this.metadata = metadata;
    } 

    protected Files (Files file){
        this.filename = file.filename;
        this.data = file.data;
        this.metadata = file.metadata;
    }
    
    public String toString() {
        return "File[filename=" + filename + ", data=" + data + ", metadata=" + metadata + "]";
    }

    public abstract Files clone();
}
