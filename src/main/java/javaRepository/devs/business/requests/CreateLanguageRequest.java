package javaRepository.devs.business.requests;

public class CreateLanguageRequest {
    private String name;

    public CreateLanguageRequest() {
    }

    public CreateLanguageRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
