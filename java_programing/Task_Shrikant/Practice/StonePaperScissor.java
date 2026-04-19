import java.util.Scanner;

class StonePaperScissor {
    public static void main(String... shrikant) {
        Scanner sc = new Scanner(System.in);

        gameLoop: for (;;) {
            System.out.println("\n ********** WELCOME **********");
            System.out.println("        STONE PAPER SCISSOR");
            System.out.println("1.STONE \n2.PAPER \n3.SCISSOR\n");
            System.out.print("Enter your response : ");
            int userResp = sc.nextInt();

            if (userResp < 1 || userResp > 3) {
                System.out.println("\n INVALID RESPONSE\n ");
                continue gameLoop;
            }

            String user = "";
            if (userResp == 1)
                user = "STONE";
            else if (userResp == 2)
                user = "PAPER";
            else
                user = "SCISSOR";

            // bot imp starts
            int botResp = 0;
            for (int i = 1; i <= 100; i++) {
                botResp = (int) (Math.random() * 10);
                if (botResp >= 1 && botResp <= 3)
                    break;
            }

            String bot = "";
            if (botResp == 1)
                bot = "STONE";
            else if (botResp == 2)
                bot = "PAPER";
            else
                bot = "SCISSOR";

            System.out.println();
            System.out.println("        BOT           USER");
            System.out.println("        " + bot + "        " + user);

            // winner calculation
            if (bot.equals("STONE") && user.equals("PAPER") ||
                    bot.equals("PAPER") && user.equals("SCISSOR") ||
                    bot.equals("SCISSOR") && user.equals("STONE")) {
                System.out.println("\n    **** USER WON ****\n");
            } else if (bot.equals("STONE") && user.equals("SCISSOR") ||
                    bot.equals("PAPER") && user.equals("STONE") ||
                    bot.equals("SCISSOR") && user.equals("PAPER")) {
                System.out.println("\n    **** BOT WON ****\n");
            } else {
                System.out.println("\n    **** IT'S A DRAW ****\n");
            }
        }
    }
}
