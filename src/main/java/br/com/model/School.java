package br.com.model;

public class School {
    private long id;
    private String nameSchool, address, cellPhone, email, webSite;
    private int amountStudents, amountRoom;

    public School(long id, String nameSchool, String address, String cellPhone, String email, String webSite,
                  int amountStudents, int amountRoom) {
        this.id = id;
        this.nameSchool = nameSchool;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.webSite = webSite;
        this.amountStudents = amountStudents;
        this.amountRoom = amountRoom;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public String getAddress() {
        return address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getWebSite() {
        return webSite;
    }

    public int getAmountStudents(){
        return amountStudents;
    }

    public int getAmountRoom(){
        return amountRoom;
    }
}
