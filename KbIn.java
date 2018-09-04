class KbIn {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        System.out.print("Нажмите любую клавишу, а затем энтер");
        ch = (char) System.in.read(); // получить символ
        System.out.println("Bы нажали клавишу " + ch);
    }
}