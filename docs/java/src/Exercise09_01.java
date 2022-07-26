import java.util.Scanner;

public class Exercise09_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        while(run){
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Number of student | 2. Input score | 3. Score list | 4. analysis | 5. Exit ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Select> : ");
            int selectNum = sc.nextInt();

            if(selectNum ==1){ //number of student
                System.out.println("------------------------");
                System.out.println("Input number of student ");
                System.out.println("------------------------");
                System.out.print("Select> : ");
                studentNum= sc.nextInt();
                

                System.out.println();
                if(studentNum<=0){
                    System.out.println("-value(0) is not available");
                    continue;
                }

            } else if(selectNum ==2){  //input score
                if(studentNum<= 0){
                    System.out.println("-value(0) is not available");
                    continue;
                }
                System.out.println("-------------------");
                System.out.println("Input student score");
                System.out.println("-------------------");
                System.out.print("Select> : ");

                scores = new int [studentNum];
                for(int i=0; i<scores.length;i++){
                    System.out.print("input number: "+i+" student's score is : ");
                    scores[i]= sc.nextInt();
                    System.out.println();

                }

                System.out.println();

                
            } else if(selectNum ==3){  //score list
                for(int i = 0; i<scores.length; i++){
                    System.out.println((i+1)+" student's score is : "+scores[i]);
                }
            } else if(selectNum ==4){ //analysis
                int max = 0;
                int sum = 0;
                int cnt = 0;
                double avg =0.0;
                int maxStudentNum=0;
                for(int i=0; i<scores.length;i++){
                    if(max<scores[i]){
                        max=scores[i];
                        sum+=scores[i];
                        maxStudentNum=i;
                        cnt++;
                    }
                }
                System.out.println("best student's score is : "+max+ " and the number of the student is : "+maxStudentNum);
                avg = (double)sum/cnt;
                System.out.println("Avergage student's score is : "+avg);

            } else if(selectNum ==5){ //exit
                run=false;
            }
        }

        System.out.println("End of program... ");
        sc.close();
    }
}
