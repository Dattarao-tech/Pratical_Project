class statementsleafyear{
    public static void main(String[]args){
        int year = 2024;
        if(year % 400 ==0){
            System.out.println(year +"It is leaf year");
        }
        else if(year % 100 ==0){
            System.out.println(year +"It is leaf year");
        }else if(year % 4 ==0){
            System.out.println(year +"It is leaf year");
        }
        else{
            System.out.println(year +"is not leaf year");
        }

    }}
