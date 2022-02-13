public class Assignment6 {
    public static void main(String[] args) {
        int var_A = 21, var_B = 20, var_C = 30, var_D = 40;
        int total = (var_A + var_B + var_C + var_D);
        if (var_A > 0 && var_B > 0 || var_C > 0 && var_D > 0) {
            System.out.println(var_A + var_B + var_C + var_D);
        }if (total>100) {
            if(total % 2 == 0)
                System.out.println(total / 2);
            else {
                int lastStep = total - 1;
                if(lastStep % 2 == 0)
                    System.out.println((total - 1) / 2);
                else
                    System.out.println("The number is still not divisible by two");
            }
        }

    }
}
