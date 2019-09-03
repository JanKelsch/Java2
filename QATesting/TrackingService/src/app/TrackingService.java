package app;

import java.util.ArrayList;
import java.util.List;

public class TrackingService {

    private int total;
    private int goal;
    private List<HistoryItem> history = new ArrayList<>();
    private int historyId = 0;

    public void addCalories(int amount) throws InvalidInputException {
        if (amount <= 0) throw new InvalidInputException();
        total = total + amount;
        history.add(new HistoryItem(historyId++, amount, "add", total));
    }

    public void removeCalories(int amount) {
        total = total - amount;
        if (total < 0)
            total = 0;
        history.add(new HistoryItem(historyId++, amount, "remove", total));
    }

    public boolean isGoalMet() {
        return total == goal;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public List<HistoryItem> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryItem> history) {
        this.history = history;
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    @Override
    public String toString() {
        return "TrackingService{" +
                "total=" + total +
                ", goal=" + goal +
                ", history=" + history +
                ", historyId=" + historyId +
                '}';
    }
}
