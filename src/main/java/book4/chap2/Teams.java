
package book4.chap2;

/**
 * @author thamsanqa 2024
 **/
public class Teams {

    public static void main(String[] args) {
        String[][] teams = {
            //Team A
            {"Henry Blake", "Johnny Mulcahy"},
            //Team B
            {"Benjamin Pierce", "John McIntyre", "Jonathan Tuttle"},
            //Team C
            {"Margaret Houlihan", "Frank Burns"},
            //Team D
            {"Max Klinger", "Radar O'Reilly", "Igor Straminsky"}
        };

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.println(teams[i][j]);
            }
            System.out.println();
        }
    }
}
