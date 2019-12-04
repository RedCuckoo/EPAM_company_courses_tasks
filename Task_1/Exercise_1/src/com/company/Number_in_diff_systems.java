package com.company;

import javax.xml.datatype.DatatypeConfigurationException;
import java.lang.Math;

public class Number_in_diff_systems {
    int number;

    private boolean to_boolean(int number){
        return (number == 0) ? false : true;
    }

    private String reverse(String to_reverse){
        String res = "";
        for (int i = to_reverse.length() - 1; i >= 0; --i){
            res += to_reverse.charAt(i);
        }
        return res;
    }

    public Number_in_diff_systems(int number){
        this.number = (number < 0) ? -number : number;
    }

    public String to_binary(){
        String res = "";
        int number_copy = number;
        int check_number = 0, degree_counter = 0;
        while (check_number != number){
            if (to_boolean(number_copy & 0b1)){
                res += '1';
                check_number += Math.pow(2, degree_counter);
            }
            else {
                res += '0';
            }
            ++degree_counter;
            number_copy >>>= 1;
        }
        return reverse(res);
    }

    public String to_num_system_of_eight(){
        String res = "";
        int number_copy = number;

        while (number_copy != 0){
            res += number_copy % 8;
            number_copy /= 8;
        }

        return reverse(res);
    }

    /*public String to_num_system_of_hex(){
        String res = "";
        int number_copy = number;
    }*/

}
