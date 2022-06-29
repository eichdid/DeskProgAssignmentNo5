package myid.model;

public class Profile {

    private int primaryKey; // DB primary key
    private String alias;   // alias to this profile
    private String url;     // (optional) url related to this profile
    private String user;    // user name/ login ID
    private String pwd;     // password

    public Profile(){
        this.primaryKey = -1;
    }
    
    public Profile(int primaryKey){
        this.primaryKey = primaryKey;
    }
            
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) throws BadValueException {
        if (user == null) throw new BadValueException("Error null.");
        if (user.length() > 50) throw new BadValueException("Username maksimal 50 karakter.");
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) throws BadValueException {
        if (pwd == null) throw new BadValueException("Error null.");
        if (pwd.length() < 2) throw new BadValueException("Kata sandi minimal 2 karakter");
        if (pwd.length() > 50) throw new BadValueException("Kata sandi maksimal 50 karakter.");
        this.pwd = pwd;
    }
        
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) throws BadValueException {
        if (alias == null) throw new BadValueException("Error null.");
        if (alias.length() < 1) throw new BadValueException("Alias minimal 1 karakter.");
        if (alias.length() > 50) throw new BadValueException("Alias maksimal 50 karakter.");
        this.alias = alias;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }
    
    public boolean hasPrimaryKey(){ 
        return (this.primaryKey > -1);
    }
    
    @Override
    public String toString(){
        return alias;
    }
    
}
