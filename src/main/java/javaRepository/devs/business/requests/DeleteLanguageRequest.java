package javaRepository.devs.business.requests;

public class DeleteLanguageRequest {
    private int id;
    public DeleteLanguageRequest() {
    }

    public DeleteLanguageRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
