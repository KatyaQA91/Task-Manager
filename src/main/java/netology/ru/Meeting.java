package netology.ru;

public class Meeting extends Task {
    protected String topic; // тема
    protected String project; //проект
    protected String stars; //звезды

    public Meeting(int id, String topic, String project, String stars) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.stars = stars;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStars() {
        return stars;
    }

    @Override
    public boolean matches(String query) {
        return topic.contains(query) || project.contains(query) || stars.contains(query) ; // возвращять а или в или с
    }

}
