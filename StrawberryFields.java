public class StrawberryFields {

    //Escribe un programa que permita imprimir la canción Strawberry Fields Forever con un bucle. Solo puedes tener 2 funciones, una que imprima los versos y otra que imprima el coro.
    //Busca información sobre bucles anidados.
    //Al final está la letra completa
    
    public static void main(String[] args) {
    for (int i = 1; i <= 7; i++){
        if (i % 2 !=0){
            playChorus();
        } else {
            playVersus(i);
        }
    }
    }

    /**
     * Function name: playVersus
     * 
     * @param number (int)
     * 
     * Inside the function:
     * 1. print versus according the position number
     */

    public static void playVersus(int number){
        switch (number){
            case 2:
                System.out.println("Living is easy with eyes closed\n" +
                        "Misunderstanding all you see\n" +
                        "It's getting hard to be someone, but it all works out\n" +
                        "It doesn't matter much to me\n");
                break;
            case 4:
                System.out.println("No one I think is in my tree\n" +
                        "I mean, it must be high or low\n" +
                        "That is, you can't, you know, tune in, but it's alright\n" +
                        "That is, I think it's not too bad\n");
                break;
            case 6:
                System.out.println("Always, no sometimes, think it's me\n" +
                        "But you know, I know when it's a dream\n" +
                        "I think I know, I mean a yes\n" +
                        "But it's all wrong\n" +
                        "That is, I think I disagree\n");
                break;
        }
    }

    /**
     * Function name: playChorus
     * 
     * Inside the function:
     * 1. print chorus 
     */

    public static void playChorus(){
        System.out.println("Let me take you down\n" +
                "'Cause I'm going to strawberry fields\n" +
                "Nothing is real\n" +
                "And nothing to get hung about\n" +
                "Strawberry fields forever\n");
    }
}

/* 
Strawberry Fields Forever

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Living is easy with eyes closed
Misunderstanding all you see
It's getting hard to be someone, but it all works out
It doesn't matter much to me

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

No one I think is in my tree
I mean, it must be high or low
That is, you can't, you know, tune in, but it's alright
That is, I think it's not too bad

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Always, no sometimes, think it's me
But you know, I know when it's a dream
I think I know, I mean a yes
But it's all wrong
That is, I think I disagree

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
*/