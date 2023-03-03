package javaRepository.devs.business.requests;

public class UpdateTechnologyRequest
{
    private int id;
    private String name;

    public UpdateTechnologyRequest() {
    }

    public UpdateTechnologyRequest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
