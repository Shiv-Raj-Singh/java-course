public class Variable {
    public static void main(String[] ar){
        // this our first valiable in which we storing "Text Foramt of data"
        String myText = "Hi this is Shiv raj And I am Software Engg !";
        // this intergers 
        int myNum = 23;
        // this is bolean value 
        boolean isTrue = false ;
        // this is single charater 
        char yourGrade = 69;
        // this is float value 
        double numFloat = 7.04;
        
        // store the combination string and 
        String message = (String.format("this is our first text which we printing using System.out.print, %s and I am %d years old %b i am not in programming but i am waorking on my skills i want to get grade %c into all Programming skills , currently my typing speed is %f number of words per min", myText , myNum , isTrue, yourGrade , numFloat));
        System.out.println(message);
    }
}
