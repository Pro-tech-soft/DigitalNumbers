package main;

public class Digital {
    private String[][] arr;

    Digital(){
        String empty = "";
        String space = " ";
        String dot = "_";
        arr = new String[][]{{empty, space, empty},
                                {empty, space, empty},
                                {empty, dot, empty}};
    }
    Digital(int currDigital){
        String vertical = "|";
        String down = "_";
        String empty = " ";
        switch (currDigital){
            case 0:
                arr = new String[][]{{empty, down, empty},
                                        {vertical, empty, vertical},
                                        {vertical, down, vertical}};
                break;
            case 1:
                arr = new String[][]{{empty, empty, empty},
                                        {empty, empty, vertical},
                                        {empty, empty, vertical}};
                break;
            case 2:
                arr = new String[][]{{empty, down, empty},
                                        {empty, down, vertical},
                                        {vertical, down, empty}};
                break;
            case 3:
                arr = new String[][]{{empty, down, empty},
                                        {empty, down, vertical},
                                        {empty, down, vertical}};
                break;
            case 4:
                arr = new String[][]{{empty, empty, empty},
                                        {vertical, down, vertical},
                                        {empty, empty, vertical}};
                break;
            case 5:
                arr = new String[][]{{empty, down, empty},
                                        {vertical, down, empty},
                                        {empty, down, vertical}};
                break;
            case 6:
                arr = new String[][]{{empty, down, empty},
                                        {vertical, down, empty},
                                        {vertical, down, vertical}};
                break;
            case 7:
                arr = new String[][]{{empty, down, empty},
                                        {empty, empty, vertical},
                                        {empty, empty, vertical}};
                break;
            case 8:
                arr = new String[][]{{empty, down, empty},
                                        {vertical, down, vertical},
                                        {vertical, down, vertical}};
                break;
            case 9:
                arr = new String[][]{{empty, down, empty},
                                        {vertical, down, vertical},
                                        {empty, down, vertical}};
                break;
        }
    }
    String getLine(int lineNum){
        StringBuilder newString = new StringBuilder();
        for(int x = 0; x < 3; x++){
            if(x != lineNum) continue;
            for(int y = 0; y < 3; y++){
                newString.append(arr[x][y]);
            }
            newString.append(" ");
        }
        return newString.toString();
    }
    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();
        for(int x = 0; x < 3; x++){
            newString.append(" ");
            for(int y = 0; y < 3; y++){
                newString.append(arr[x][y]);
            }
            newString.append("\n");
        }
        return newString.toString();
    }
}
