import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};

        System.out.println("Вітаю тебе у старому замку! Це місце сповнене магією та загадками!");
        System.out.println("Але для того, щоб потрапити всередину, тобі треба відкрити двері! Бажаю успіхів!");
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
            scanner.close();
            return;
        }

        int[] numOnTheBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;

        System.out.println("Перед тобою нове завдання! Щоб пройти далі, виконай його!");
        System.out.println("Знайди суму чисел: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30");

        for (int i = 0; i < numOnTheBoard.length; i++) {
            sum += numOnTheBoard[i];
        }
        System.out.println("Cума всіх магічних чисел: ");
        int userSum = scanner.nextInt();
        if (userSum == sum) {
            System.out.println("Сума магічних чисел дійсно:" + sum);
            System.out.println("Вітаю!!! Ти відкрив наступну кімнату!!!");
            System.out.println("Але будь обережним! Тут на тебе чекає небезпека!");
        } else {
            System.out.println("Відповідь не вірна. Спобуй ще раз!");
            return;
        }

        int[] dragonAttacks = {8, 16, 24, 32, 40};
        boolean allAttacksEven = true;

        System.out.println("Щоб пройти далі, тобі потрібно здолати дракона.");
        System.out.println("Спробуй передбачити його атаки.");

          for (int i = 0; i < dragonAttacks.length; i++) {
              if (dragonAttacks[i] % 2 != 0) {
                  allAttacksEven = false;
              }
           }
          if (allAttacksEven) {
              System.out.println("Атаки парні! Захист активовано!");
          } else {
             System.out.println("Увага! Непарна атака!");
          }

        // Варіант 2
      //  for (int i = 0; i < dragonAttacks.length; i++) {
      //      if (dragonAttacks[i] % 2 == 0) ;
      //  }

      //  if (allAttacksEven) {
      //      System.out.println("Атаки парні! Захист активовано!");
      //  } else {
      //      System.out.println("Увага! Непарна атака!");
      //  }

        System.out.println("Супер! Ти справився з усіма викликами замку!");
        System.out.println("Щоб отримати ключ, залишився ще 1 крок.");
        System.out.println("Введи своє улюблене число: ");

        int userFavoriteNum = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < secretCode.length; i++) {
            if (secretCode[i] == userFavoriteNum) {
                found = true;
            }
        }
        for (int i = 0; i < numOnTheBoard.length; i++) {
            if (numOnTheBoard[i] == userFavoriteNum) {
                found = true;

            }
        }

        for (int i = 0; i < dragonAttacks.length; i++) {
            if (dragonAttacks[i] == userFavoriteNum) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Твій ключ знайдено!");
        } else {
            System.out.println("Треба більше магії...");
        }
    }
}
