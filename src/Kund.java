/*
* Klass: Kund
* Dena klass ska fungera som ett kundobejct vilket sparrar användarens personuppgifter.
*/

public class Kund {
/** Kundens förnamn t.ex. Johan */
private String förnamn;
/** Kunden effternamn t.ex Kateby */
private String effternamn;
/** Kundens email adress t.ex. johanerik.kateby@ga.ntig.se */
private String email; 

/** Skappar ett nytt kund obejekt med angivna värden.
 * 
 * @param namn Kundens förnamn t.ex. Johan
 * @param effternamn Kunden effternamn t.ex Kateby
 * @param email Kundens email adress t.ex. johanerik.kateby@ga.ntig.se
 */
Kund(String namn, String effternamn, String email){
    this.förnamn = namn;
    this.effternamn = effternamn;
    this.email = email;
}

/**
 * get_namn hämtar förnamnet på kunden.
 * @return retunerar förnamnet.
 */
public String get_namn(){
    return förnamn;
}

/**
 * get_effternamn hämtar effternamnet på kunden.
 * @return retunerar effternamnet.
 */
public String get_effternamn() {
    return effternamn;
}

/**
 * get_email hämtar email addresen på kunden.
 * @return returnerar email.
 */
public String get_email() {
    return email;
}

}
