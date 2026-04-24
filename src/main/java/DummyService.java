public class DummyService {

    public String processData(String input) {
        return "Processed: " + input;
    }

    public boolean validateUser(String username) {
        return username != null && !username.isEmpty();
    }

    public void logEvent(String event) {
        System.out.println("Event logged: " + event);
    }

    public static void main(String[] args) {
        DummyService service = new DummyService();

        System.out.println(service.processData("Hello"));

        System.out.println(service.validateUser("홍길동"));

        service.logEvent("서버 시작");
    }
}
