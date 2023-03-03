package javaRepository.devs.business.responses;

public class GetByIdLanguageResponse {
    private int id;
    private String name;

    public GetByIdLanguageResponse() {

    }

    public GetByIdLanguageResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
