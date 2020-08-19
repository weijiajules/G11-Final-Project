import hsa.*;

//change name of class here
public class usincome {

    public static Console c;
    static String state[] = new String[50];
    static int income[] = new int[50];

    public static void main(String args[]) {
        c = new Console();
        loadData();
        for (int i = 0; i < 20; i++) {
            c.print(state[i], 15);
            c.println(income[i]);

        }
        c.println("\n\n Press any key to sort by income....");
        c.getChar();
                c.clear();
                for (int i = 0; i < state.length; i++) {
                    int smloc=findSmallest(i);
                    swap(i,smloc);
            
        }
                // print top 25
                 for (int i = 0; i < 20; i++) {
            c.print(state[i], 15);
            c.println(income[i]);

        }
    }
         

    public static int findSmallest(int startloc) {
        int smallest = income[startloc];
        int smloc = startloc;
        for (int x = startloc + 1; x < income.length; x++) {
            // if we find a sammler number
            if (income[x] < smallest) { // change the < to a > to make high to low
                smallest = income[x];
                smloc = x;
            }
        }
        return smloc; // return location of smallest numebr
    }

    public static void swap(int loc1, int loc2) {
        int temp = income[loc1];
        income[loc1] = income[loc2];
        income[loc2] = temp;
        //swap the stae with the inxome
        String temp2 = state[loc1];
        state[loc1] = state[loc2];
        state[loc2] = temp2;
    }

    public static void loadData() {
        state[0] = "Alabama";
        income[0] = 41415;
        state[1] = "Alaska";
        income[1] = 60287;
        state[2] = "Arizona";
        income[2] = 46709;
        state[3] = "Arkansas";
        income[3] = 38758;
        state[4] = "California";
        income[4] = 67458;
        state[5] = "Colorado";
        income[5] = 55387;
        state[6] = "Connecticut";
        income[6] = 65753;
        state[7] = "Delaware";
        income[7] = 57954;
        state[8] = "Florida";
        income[8] = 44299;
        state[9] = "Georgia";
        income[9] = 46007;
        state[10] = "Hawaii";
        income[10] = 62814;
        state[11] = "Idaho";
        income[11] = 43341;
        state[12] = "Illinois";
        income[12] = 53234;
        state[13] = "Indiana";
        income[13] = 46438;
        state[14] = "Iowa";
        income[14] = 49427;
        state[15] = "Kansas";
        income[15] = 48964;
        state[16] = "Kentucky";
        income[16] = 41141;
        state[17] = "Louisiana";
        income[17] = 41734;
        state[18] = "Maine";
        income[18] = 46033;
        state[19] = "Maryland";
        income[19] = 70004;
        state[20] = "Massachusetts";
        income[20] = 64859;
        state[21] = "Michigan";
        income[21] = 45981;
        state[22] = "Minnesota";
        income[22] = 61814;
        state[23] = "Mississippi";
        income[23] = 36919;
        state[24] = "Missouri";
        income[24] = 45247;
        state[25] = "Montana";
        income[25] = 44222;
        state[26] = "Nebraska";
        income[26] = 50296;
        state[27] = "Nevada";
        income[27] = 48927;
        state[28] = "New Hampshire";
        income[28] = 64712;
        state[29] = "New Jersey";
        income[29] = 69825;
        state[30] = "New Mexico";
        income[30] = 41963;
        state[31] = "New York";
        income[31] = 55246;
        state[32] = "North Carolina";
        income[32] = 43916;
        state[33] = "North Dakota";
        income[33] = 51704;
        state[34] = "Ohio";
        income[34] = 45749;
        state[35] = "Oklahoma";
        income[35] = 43225;
        state[36] = "Oregon";
        income[36] = 46816;
        state[37] = "Pennsylvania";
        income[37] = 50228;
        state[38] = "Rhode Island";
        income[38] = 53636;
        state[39] = "South Carolina";
        income[39] = 42367;
        state[40] = "South Dakota";
        income[40] = 48321;
        state[41] = "Tennessee";
        income[41] = 41693;
        state[42] = "Texas";
        income[42] = 49392;
        state[43] = "Utah";
        income[43] = 55869;
        state[44] = "Vermont";
        income[44] = 52776;
        state[45] = "Virginia";
        income[45] = 62881;
        state[46] = "Washington";
        income[46] = 57835;
        state[47] = "West Virginia";
        income[47] = 38482;
        state[48] = "Wisconsin";
        income[48] = 50395;
        state[49] = "Wyoming";
        income[49] = 56322;
    }

}


