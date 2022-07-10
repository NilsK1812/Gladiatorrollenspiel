import java.text.MessageFormat;

public class Menus {
    //Eigenschaften/Attribute
    private String[] sections;
    private int index;
    private int current_line;

    public Menus(String[] sections){
        this.sections = sections;
    }

    public void show_menu(){
        create_menu();
        System.out.print("\nWas wollen Sie machen -> ");
    }

    private void create_menu(){
        current_line = 1;
        index = longest_word() + 5;
        start_and_end();
        System.out.print("\n");
        for (String x : sections) {
            System.out.print(MessageFormat.format("# {0}.{1} ", current_line,x));
            for(int y = (x.length() + 6); y <= index; y++)
                System.out.print(" ");
            System.out.println("#");
            current_line++;
        }
        start_and_end();
    }

    private void start_and_end(){
        for(int i = 0; i <= index; i++){
            System.out.print("#");
        }
    }

    private int longest_word(){
        int longest_index = 0;

        for (String x : sections) {
            if (longest_index < x.length())
                longest_index = x.length();
        }

        return longest_index;
    }
}
