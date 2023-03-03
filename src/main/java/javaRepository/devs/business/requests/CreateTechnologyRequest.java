package javaRepository.devs.business.requests;

public class CreateTechnologyRequest
{
    private String name;
    private int languageId;

    public CreateTechnologyRequest() {
    }

    public CreateTechnologyRequest(String name, int languageId) {
        this.name = name;
        this.languageId = languageId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
