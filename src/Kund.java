public class Kund {

private String förnamn;
private String effternamn;
private String email; 

Kund(String namn, String effternamn, String email){
    this.förnamn = namn;
    this.effternamn = effternamn;
    this.email = email;
}

public String get_namn(){
    return förnamn;
}

public String get_effternamn() {
    return effternamn;
}

public String get_email() {
    return email;
}

}
