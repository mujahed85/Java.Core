class AScopePractice { 
    AScopePractice(int x) { 
        System.out.println("argument constructor with value"); 
    }
    AScopePractice() { 
        System.out.println("No argument constructor"); 
    }
    static
    { 
        System.out.println("1st static init"); 
    }
    { 
        System.out.println("1st instance init"); 
    } 
    static
    { 
        System.out.println("2nd static init"); 
    } 
    { 
        System.out.println("2nd instance init"); 
    } 
    public static void main(String[] args){ 
        System.out.println("Main Start");
        AScopePractice objAScopePractice;
        objAScopePractice= new AScopePractice(); 
        System.out.println("Main End");
    } 
}