public class user{
    String name;
    private List credit_cards;
    private String _login;
    private String _password;


    void set_name(String n){
        this.name = n;
    }
    String get_name(){
        return this.name;
    }

    void set_login(String login){
        this._login = login;
    }
    String get_login(){
        return _login;
    }
    
    void set_password(String password){
        this._password = password;
    }
    String get_password(){
        return _password;
    }

    void add_credit_card(String new_credit_card){
        credit_cards.add(new_credit_card);
    }
    void remove_credit_card(String remove_this){
        credit_cards.remove(remove_this)
    }

}