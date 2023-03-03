package javaRepository.devs.business.requests;

public class DeleteTechnologyRequest {
    private int id;

    public DeleteTechnologyRequest() {
    }

    public DeleteTechnologyRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
