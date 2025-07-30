class statement23{
    public static void main(String[]args){
        int age = 20;
        boolean hasID = true;
        if(age >=18){
            if(hasID){
                System.out.println("Eligible for a driving licence.");
            }
            else{
                System.out.println("Not eligible - no Id proof.");
            }

        }
        else{
            System.out.println("Not eligible - under age.");
        }
    }
}