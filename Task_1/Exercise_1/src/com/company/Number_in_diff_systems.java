package com.company;

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

        while (number_copy != 0){
            res += number_copy % 2;
            number_copy /= 2;
        }

        return reverse(res);
    }

    public String to_octal(){
        String res = "";
        int number_copy = number;

        while (number_copy != 0){
            res += number_copy % 8;
            number_copy /= 8;
        }

        return reverse(res);
    }

    public String to_hex(){
        String res = "";
        int number_copy = number;
        int temp;
        while (number_copy != 0){
            temp = number_copy % 16;
            if(temp>9){
                switch(temp){
                    case (10):
                        res += "A";
                        break;
                    case (11):
                        res += "B";
                        break;
                    case (12):
                        res += "C";
                        break;
                    case (13):
                        res += "D";
                        break;
                    case (14):
                        res += "E";
                        break;
                    case (15):
                        res += "F";
                        break;
                }
            }
            else{
                res += temp;
            }
            number_copy /= 16;
        }

        return reverse(res);
    }
}
