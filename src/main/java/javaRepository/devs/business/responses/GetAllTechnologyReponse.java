package javaRepository.devs.business.responses;

public class GetAllTechnologyReponse {
    private int id;
    private String languageName;
    private String name;


    public GetAllTechnologyReponse() {
    }

    public GetAllTechnologyReponse(int id, String name, String languageName) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
