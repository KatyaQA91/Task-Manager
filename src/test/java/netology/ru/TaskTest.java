package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskMatchesWhenMatches() {  //+
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskMatchesWhenNotMatches() {  //+
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePositiveDisplayOfTheGraphTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePositiveDisplayOfTheGraphStars() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("обеда");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheNegativeDisplayOfTheGraphStars() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Обеда");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingThePositiveDisplayOfTheGraphProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheNegativeDisplayOfTheGraphTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("выкатка");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheNegativeDisplayOfTheGraphProject() {  //+
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("нетоБанк");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicMatchesWhenNotMatches() {  //+
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Сахар");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicMatchesWhenMatches() {  //+
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSearchForTasksByIdIsNegative() {

        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        SimpleTask simpleTask2 = new SimpleTask(7, "Позвонить родителям");


        boolean actual = simpleTask1.hashCode() == simpleTask2.hashCode();
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSearchForTasksByIdIsPositive() {

        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        SimpleTask simpleTask2 = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask1.hashCode() == simpleTask2.hashCode();
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}