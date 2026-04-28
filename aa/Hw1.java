// 基礎類別，定義講義頁面的共通屬性與顯示方法
abstract class Note {
    int page;
    String title;
    String desc;

    Note(int p, String t, String d) {
        page = p;
        title = t;
        desc = d;
    }

    void show() {
        System.out.printf("Page %2d | %-20s : %s%n", page, title, desc);
    }
}

// 根據講義內容建立的獨立簡短類別
class Def extends Note { 
    Def() { super(2, "Definition", "P(A) = 事件A發生的個數 / 全部可能情況"); } 
}
class Space extends Note { 
    Space() { super(3, "Sample Space", "S: 所有可能結果的集合"); } 
}
class Evt extends Note { 
    Evt() { super(4, "Event", "A: 我們關心的事件"); } 
}
class Form extends Note { 
    Form() { super(5, "Basic Formula", "P(A) = n(A) / n(S)"); } 
}
class Comp extends Note { 
    Comp() { super(6, "Complement", "P(A^C) = 1 - P(A)"); } 
}
class Union extends Note { 
    Union() { super(7, "Union (OR)", "P(A U B) = P(A) + P(B) - P(A n B)"); } 
}
class Inter extends Note { 
    Inter() { super(8, "Intersection (AND)", "P(A n B) = P(A) * P(B|A)"); } 
}
class Cond extends Note { 
    Cond() { super(9, "Conditional", "P(A|B) = P(A n B) / P(B)"); } 
}
class Indep extends Note { 
    Indep() { super(10, "Independent", "P(A n B) = P(A) * P(B)"); } 
}
class Bayes extends Note { 
    Bayes() { super(11, "Bayes' Theorem", "P(A|B) = P(B|A) * P(A) / P(B)"); } 
}
class Total extends Note { 
    Total() { super(12, "Total Probability", "P(A) = Σ P(A|Bi) * P(Bi)"); } 
}
class Ex1 extends Note { 
    Ex1() { super(13, "School Example 1", "P(建中) = J/N, P(北一女) = B/N"); } 
}
class Ex2 extends Note { 
    Ex2() { super(14, "School Example 2", "P(建中 U 北一女) = (J+B)/N"); } 
}

// 主程式
public class Hw1 {
    public static void main(String[] args) {
        // 將每一頁的物件實例化並存入陣列
        Note[] notes = {
            new Def(), new Space(), new Evt(), new Form(), new Comp(),
            new Union(), new Inter(), new Cond(), new Indep(), new Bayes(),
            new Total(), new Ex1(), new Ex2()
        };

        System.out.println("=== Assignment 1: Probability Lecture Notes ===");
        // 迴圈走訪陣列，呼叫 show() 方法印出結果
        for (Note n : notes) {
            n.show();
        }
    }
}