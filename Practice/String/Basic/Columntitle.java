class Columntitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder ColumnTitle = new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            int remainder = columnNumber % 26;
          char letter = (char)('A'+remainder);
          ColumnTitle.insert(0,letter);
          columnNumber = columnNumber/26;
        }
        return ColumnTitle.toString();
    }
    public static void main(String[] args) {
        Columntitle ct = new Columntitle();
        int columnNumber = 28; 
        String result = ct.convertToTitle(columnNumber);
        System.out.println("Column title for " + columnNumber + " is: " + result); 
    }
}