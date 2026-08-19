package day13;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class Practice {
    public static void main(String[] args) {

        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("1.위치찾기 2.입차 3.출차 선택:");
            int ch = scan.nextInt();

            // 1. 위치찾기
            if (ch == 1) {

                System.out.print("차량번호 입력 : ");
                String carNumber = scan.next();

                String[] rows = carParkingList.split("\n");

                String result = "미등록 차량";

                for (int i = 0; i < rows.length; i++) {

                    String[] cols = rows[i].split(",");

                    if (cols[1].equals(carNumber)) {
                        result = cols[0];
                    }
                }

                System.out.println("차량 위치 : " + result);
            }


            // 2. 입차
            if (ch == 2) {

                System.out.print("위치번호 입력 : ");
                String location = scan.next();

                boolean check = false;

                String[] rows = carParkingList.split("\n");

                for (int i = 0; i < rows.length; i++) {

                    String[] cols = rows[i].split(",");

                    if (cols[0].equals(location)) {
                        check = true;
                    }
                }

                if (check == true) {

                    System.out.println("위치 번호에는 중복 주차할 수 없습니다.");

                } else {

                    System.out.print("차량번호 입력 : ");
                    String carNumber = scan.next();

                    System.out.print("입차일시 입력(YYYYMMDDhhmm) : ");
                    String dateTime = scan.next();

                    carParkingList =
                            carParkingList
                            + "\n"
                            + location + ","
                            + carNumber + ","
                            + dateTime;

                    System.out.println("입차 완료");
                    System.out.println(carParkingList);
                }
            }


            // 3. 출차
            if (ch == 3) {

                System.out.print("출차 차량번호 : ");
                String carNumber = scan.next();

                String[] rows = carParkingList.split("\n");

                String newList = "";
                boolean found = false;

                for (int i = 0; i < rows.length; i++) {

                    String[] cols = rows[i].split(",");

                    if (cols[1].equals(carNumber)) {

                        found = true;

                        String dateTime = cols[2];

                        int year = Integer.parseInt(dateTime.substring(0, 4));
                        int month = Integer.parseInt(dateTime.substring(4, 6));
                        int day = Integer.parseInt(dateTime.substring(6, 8));
                        int hour = Integer.parseInt(dateTime.substring(8, 10));
                        int minute = Integer.parseInt(dateTime.substring(10, 12));

                        LocalDateTime inTime =
                                LocalDateTime.of(
                                        year,
                                        month,
                                        day,
                                        hour,
                                        minute
                                );

                        LocalDateTime outTime = LocalDateTime.now();

                        long parkingMinutes =
                                Duration.between(inTime, outTime).toMinutes();

                        System.out.println("총 주차시간 : " + parkingMinutes + "분");

                        long fee = 0;

                        if (parkingMinutes <= 30) {

                            fee = 0;

                        } else {

                            long days = parkingMinutes / (24 * 60);
                            long remainMinutes = parkingMinutes % (24 * 60);

                            fee = days * 20000;

                            if (remainMinutes > 30) {

                                long chargeMinutes = remainMinutes - 30;

                                long count = chargeMinutes / 10;

                                if (chargeMinutes % 10 != 0) {
                                    count++;
                                }

                                long remainFee = count * 1000;

                                if (remainFee > 20000) {
                                    remainFee = 20000;
                                }

                                fee = fee + remainFee;
                            }
                        }

                        System.out.println("주차요금 : " + fee + "원");

                        continue;
                    }

                    if (newList.equals("")) {
                        newList = rows[i];
                    } else {
                        newList = newList + "\n" + rows[i];
                    }
                }

                if (found == true) {

                    carParkingList = newList;

                    System.out.println("출차 완료");
                    System.out.println(carParkingList);

                } else {

                    System.out.println("미등록 차량입니다.");
                }
            }
        }
    }
}