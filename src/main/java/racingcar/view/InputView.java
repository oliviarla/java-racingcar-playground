package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public Cars makeCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = scanner.next();

        String[] strings = input.split(",");
        Cars cars = new Cars();
        for (String s : strings) {
            cars.add(new Car(s));
        }
        return cars;
    }

    public int getTries(){
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }
}
