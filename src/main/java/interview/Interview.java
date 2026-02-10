package interview;

import com.example.demo.up1.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {

        /*List<Employee> employeeList = new ArrayList<>();
        Map<String,List<Employee>> map =  employeeList.stream()
                .filter(employee -> employee.getSalaries()>50000)
                        .collect(Collectors.groupingBy(Employee::getDepartment));*/

        int[] intArr = {0, 1, 4, 0, 3, 0, 0, 1, 5};
        int length = intArr.length;
        int[] resultArr = Arrays.stream(intArr)
                .filter(n -> n > 0)
                .toArray();

        long numberOfZeros = Arrays.stream(intArr)
                .filter(n -> n == 0)
                .count();
        int[] resultArrays = new int[length];
        for (int i = 0; i < intArr.length; i++) {
            resultArrays[i] = 0;
        }





        System.out.println("Result" + resultArr);
    }

    private static void test(int [] arr){
        for(int i=0;i<arr.length;i++){
            int zeroIndex =0;
            if(arr[i]==0){
                zeroIndex++;
            }
        }
    }
}