public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if ((name.trim().length() >= 3) && (name.trim().length() <= 19) && !(name.startsWith(" ")) && !(name.endsWith(" ")) && (name.indexOf(" ") == name.lastIndexOf(" ")) && name.contains(" ")){
            return true;
        }else{
            return false;
        }



    }


}
