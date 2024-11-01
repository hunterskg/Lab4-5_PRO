
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> list) {
        int aver = 0;
        int sum = 0;
        for (Car c : list) {
            sum += c.getRate();
        }
        return aver = sum / list.size();
    }

    @Override
    public void f2(List<Car> list) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getRate() < list.get(minIndex).getRate()) {
                minIndex = i;
            } else if (list.get(i).getRate() > list.get(maxIndex).getRate()) {
                maxIndex = i;
            }
        }

        Collections.swap(list, minIndex, maxIndex);

    }

    @Override
    public void f3(List<Car> list) {
        Collections.sort(list, (Car o1, Car o2) -> {
            int nameComp = o1.getMaker().compareToIgnoreCase(o2.getMaker());
            if (nameComp != 0) {
                return nameComp;
            } else {
                return Double.compare(o2.getRate(), o1.getRate());
            }
        });
    }
}
